//this program find HCF of two number
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,i,HCF=0;
		Scanner s=new Scanner(System.in);//create a Scanner class object
		System.out.println("Enter first number:");
		a=s.nextInt();
		System.out.println("Enter second number:");
		b=s.nextInt();
		
		for(i=1;i<=a||i<=b;i++) {
			
    	if(a%i==0&&b%i==0)
			HCF=i;
	    }
	  System.out.println("Hcf of two given number is:" +HCF);
	}
}
		
	


