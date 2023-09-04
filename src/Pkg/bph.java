package Pkg;


import java.util.Scanner;

interface bank
{
public void personaldetails(String name);
public void withdrawl();
public void deposit();
public void balance();
}
class canara implements bank
{
static String bankname="canara";
int accountnumber;
int balance=1500;
Scanner sc=new Scanner(System.in);



@Override
public void personaldetails(String name) {
	System.out.println("enter your accountnumber:");
	accountnumber=sc.nextInt();
	System.out.println("bankname="+bankname);
	System.out.println("accountnumber="+accountnumber);
	System.out.println("balance="+balance);
}

@Override
public void withdrawl() {
	System.out.println("enter your withdrawal amount");
	int amount=sc.nextInt();
	balance=balance-amount;
	System.out.println("balance="+balance);
	
}

@Override
public void deposit() {
	System.out.println("enter your deposit amount");
	int deposit=sc.nextInt();
	balance=balance+deposit;
	System.out.println("balance="+balance);
}


@Override
public void balance() {
	System.out.println(balance);
	
}
}

public class bph {

	public static void main(String[] args) {
		canara ab=new canara();
		ab.personaldetails("abijith");
		ab.deposit();
		ab.balance();
		ab.withdrawl();

	}

}
