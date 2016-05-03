import java.util.Scanner;

public class Day2Homework1Main {

	public static void main(String[] args) {
		// write a program that displays the following menu:
		//1.average of 3 numbers
		//2.convert from pounds to kilos
		//3.convert from dollar to euros
		//4.convert from euros to pounds
		
		//Scanner Object
		
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println("Please choose an option from the menu");
		System.out.println("1. Get Average");
		System.out.println("2. Convert from pounds to kilos");
		System.out.println("3. Convert from dollars to euros");
		System.out.println("4. Convert from euros to pounds");
		
		choice = input.nextInt();
		switch(choice){
		case 1:
			getAverage();
			break;
		case 2:
			convertpoundstoKilos();
			break;
		case 3:
			convertdollarstoEuros();
			break;
		case 4:
			converteurostoPounds();
			break;
			default:
				System.out.println("Sorry that is not a valid option");
				
		
		

	}


}
public static void getAverage(){
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the first  number: ");
	double x = input.nextDouble();
	System.out.println("Please enter the second number: ");
	double y = input.nextDouble();
	System.out.println("Please enter the third number: ");
	double z = input.nextDouble();
	double result = (x + y + z) / 3;
	System.out.println("The result is: " + result);
}
public static void convertpoundstoKilos(){
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the value in pounds: ");
	double pounds = input.nextDouble();
	double kilos = (pounds * 0.45);
	System.out.println(pounds + "Pounds = " + kilos + "kilos");
}
public static void convertdollarstoEuros(){
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the value in dollars: ");
	double dollars = input.nextDouble();
	double euros = (dollars / 0.7);
	System.out.println(dollars + "Dollars = " + euros + "Euros");
}
public static void converteurostoPounds(){
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the value in euros: ");
	double euros = input.nextDouble();
	double pounds = (euros / 0.71);
	System.out.println(euros + " Euros = " + pounds  + "Pounds ");
}
}
	
