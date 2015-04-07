/*********************输入一个整数，输出它的阶乘**********************/

package testFor;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Recurrence {
	
	public int jiecheng(int num){
		if(num>1)
			return num * jiecheng(num-1);
		else if(num==1)
			return 1;
		else 
			return 0;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String num="";
		Pattern pattern=Pattern.compile("\\d+");
		Matcher matcher=null;
		int k=0;
		while (true) {
			System.out.println("请输入一个整数:");
			num=scanner.nextLine();
			matcher=pattern.matcher(num);
			if (matcher.matches()) {
				k=Integer.valueOf(num);
				break;
			}
			else 
				System.out.println("输入的不是整数，请重新输入！");
		}
			System.out.println(new Recurrence().jiecheng(k));
	}
		
}
