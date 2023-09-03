import  java.util.Scanner;
/**
 * currency converter
 * 
 *
 */
public class CurrencyConverter {

	public static void main(String[] args) {
		System.out.println("1 Rupee");
		System.out.println("2 Dollar");
		System.out.println("3 Euro");
		
		//Taking  Input 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the currency");
		int choice=sc.nextInt();
		System.out.println("Enter the Amount ");
		double amount=sc.nextDouble();
		
		//Converting the amount
		
		switch(choice) {
		   case 1:
		    	Rupee_To_other(amount);
		    	break;
		   case 2:
			    Dollar_To_other(amount);
			    break;
		   case 3:
			    Euro_To_other(amount);
			    break;
			default: 
				System.out.println("Invalid choice");
				
				}
	}
	public static void Rupee_To_other(double amt ) {
		System.out.println("1 Rupee="+0.012+"Dollar");
		System.out.println();
		
		System.out.println(amt+"Rupee="+(amt*0.012)+"Dollar");
		System.out.println();
		
		System.out.println("1 Rupee="+0.011+"Euro");
		System.out.println();
		
		System.out.println(amt+"Rupee="+(amt*0.011)+"Euro");
		System.out.println();
	}
		
		public static void Dollar_To_other(double amt ) {
			System.out.println("1 Dollar="+82.51+"Rupee");
			System.out.println();
			
			System.out.println(amt+"Dollar="+(amt*82.51)+"Rupee");
			System.out.println();
			
			System.out.println("1 Dollar="+0.93+"Euro");
			System.out.println();
			
			System.out.println(amt+"Dollar="+(amt*0.93)+"Euro");
			
		}
		
		public static void Euro_To_other(double amt ) {
			System.out.println("1 Euro="+88.40+"Rupee");
			System.out.println();
			
			System.out.println(amt+"Euro="+(amt*88.40)+"Rupee");
			System.out.println();
			
			System.out.println("1 Euro="+1.07+"Dollar");
			System.out.println();
			
			System.out.println(amt+"Euro="+(amt*1.07)+"Dollar");
		
		
		
		
		
		
		
		

	}

}
