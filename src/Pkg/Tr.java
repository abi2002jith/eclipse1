package Pkg;

public class Tr {

	public static void main(String[] args) {
		System.out.println("hi");

		
		String username="abcd";
		String pswd="123";
		System.out.println(username=="abcd"&& pswd=="123");
		System.out.println(username=="abcd"&& pswd=="1243");
		System.out.println(!(username=="abcd"));
		System.out.println(!(pswd=="123"));
		
		int z=55,x=70;
		System.out.println(z<50&&z<x);
		System.out.println("z<x");
		
		int l=17,q=10;
		System.out.println(l%q);
		
	}

}
