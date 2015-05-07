package testFor;

public class TestIndex {

	public static void main(String[] args) {
		String teString= "a,b";
		String x=teString.substring(0, teString.indexOf(","));
		String y=teString.substring(teString.indexOf(",")+1, teString.length());
		System.out.println(x);
		System.out.println(y);
	}

}
