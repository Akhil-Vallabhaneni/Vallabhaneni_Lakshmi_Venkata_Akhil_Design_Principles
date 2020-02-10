package calculate;

public class MainC {
	public static void main(String[] args)
	{
		int a=17,b=6;
		calci c=new calci();
		int sum=c.add(a,b);
		int difference=c.subtract(a,b);
		int product=c.multiply(a,b);
		int div=c.divide(a,b);
		
		System.out.println("Addition of "+ a +" and "+ b +" is "+ sum);
		System.out.println("Subtraction of "+ a +" and "+ b +" is "+ difference);
		System.out.println("Multiplication of "+a+" and "+b +" is "+product);
		System.out.println("Division of "+a+" and "+b+" is "+div);
	}

}
