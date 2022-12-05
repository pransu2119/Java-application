import java.util.Scanner;
class Addition
{
	int eno;
	String ename;
    Double bsal,da,hra,pf,tsal;
    Scanner obj = new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter value of Eno:-");
		eno=obj.nextInt();
		System.out.println("Emter value of Ename:-");
		ename=obj.next();
		System.out.println("Enter value of Bsal:-");
		bsal=obj.nextDouble();
	}
	void calculate()
	{
      da=bsal*0.2;
      hra=bsal*0.5;
      pf=bsal*0.1;
      tsal=bsal+da+hra-pf;
	}
	void show()
	{
		System.out.println("Eno is:- " +eno);
		System.out.println("Ename is:-" +ename);
		System.out.println("Basic salary is:- " +bsal);
		System.out.println("Da is:-" +da);
		System.out.println("Hra is:-" +hra);
		System.out.println("PF is:-" +pf);
		System.out.println("Total salary:- " +tsal);
	}

}
class Employee
{
	public static void main(String args[])
	{
		Addition a=new Addition();
		a.getdata();
		a.calculate();
		a.show();
	}
}