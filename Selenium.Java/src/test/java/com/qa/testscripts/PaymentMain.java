import java.awt.Menu;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PaymentMain {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

Menu menu = new Menu();

double total =0;

double total1=0;

// Userdeatils userdetails = new Userdeatils();

System.out.println("==============================");

System.out.println("Do you Want TO login Or Signup");

System.out.println("------------------");

System.out.println("press 1 for login");

System.out.println("press 2 for signup");

System.out.println("-------------------");

//System.out.println("==============================");

try {

int choose = scanner.nextInt();

if(choose == 1) {

System.out.println("Please LogIn");

menu.login();

}else {

System.out.println("Please SignUp");

//userdetails.signup();

menu.signup();

}

System.out.println("*******");

System.out.println("Welcome Naveen!!!");

System.out.println("*******");

ArrayList<String> items =new ArrayList<String>();

items.add("VIVO S1 Pro");

items.add("Headset");

//items.

double price[]= {25000,1000};

System.out.println("You have 2 products in the cart :"+items);

System.out.println("________");

System.out.println( );

System.out.println("Vivo S1 Pro :"+price[0]);

System.out.println();

System.out.println("Headset :"+price[1]);

System.out.println("_________");

total = price[0]+price[1];

System.out.println("=============================");

System.out.println("Your Total price is :"+total);

System.out.println("=============================");

System.out.println("As your Bill is :"+total);

System.out.println("You will get 20% discount");

total1 = total-(total*0.20);

System.out.println("======================================");

System.out.println("Now your total bill After Discount is ");

System.out.println(" "+total1+" ");

System.out.println("======================================");

menu.list();

System.out.println("Do You want to replace the item");

System.out.println("---------------------");

System.out.println("Choose 1 for replace");

System.out.println("Choose 0 for not");

System.out.println("---------------------");

int choose3 = scanner.nextInt();

if(choose3 == 1) {

menu.replace();

}else {

System.out.println("====================");

System.out.println("Thanks for shopping ");

System.out.println("Have a nice day");

System.out.println("====================");

System.exit(0);

}

} catch (InputMismatchException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

}//sv

}//pm