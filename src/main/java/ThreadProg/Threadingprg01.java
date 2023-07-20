package ThreadProg;
import java.util.Scanner;
public class Threadingprg01 {

	   public static void main(String[] args)throws InterruptedException {

	    Scanner sc=new Scanner(System.in);

	    System.out.println("Banking operation");

	    System.out.println("intet account no");

	    int acc= sc.nextInt();

	    System.out.println("int pin");

	    int pin=sc.nextInt();

	    

	    System.out.println("compeleted bankinng");

	    

	    System.out.println("Printing operation");

	    for(int i=0;i<=5;i++) {

	        System.out.println("Hii good day");

	        Thread.sleep(2000);

	    }

	    System.out.println("Printed complete");

	    System.out.println("Enter 1st no");

	    int n1=sc.nextInt();

	    System.out.println("Enter 2nd no");

	    int n2=sc.nextInt();

	    

	    int res=n1+n2;

	    

	    System.out.println("Answer is :"+res);

	    

	}
}
