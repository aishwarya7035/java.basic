/*class loop{
    public static void main(String[] args){
        int i=1;
    
       while (i<=10){
            System.out.println(+i);
            i++;


        }
    }
}*/



/*class loop{
    public static void main(String[] args){
        int num=2;
        int sum =0;
        
        while(num<=50){
            if(num%2==0){
             sum += num;

            }
            num++;
             

            }
            System.out.println("sum of even number is : "+sum);
        }
}*/



/*import java.util.*;
class loop{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int rem,q,rev=0;
                System.out.print("Enter the Num: ");
        int num = obj.nextInt();
        {
            while(num!=0){
                rem= num%10;
                rev=rev*10+rem;
                num/=10;
            }
        }
        System.out.println("reverse number: "+rev);

    }
}*/


/*import java.util.*;
class loop{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
int choice;
        do{

            System.out.println("------MENU------\t");
            System.out.println("1. Kari Dosa");
            System.out.println("2. Kadai Chicken");
            System.out.println("3. Chicken Rice");
            System.out.println("4. Chilli Chicken Biriyani");
            System.out.println("Menu Exist");
            System.out.println("Enter Your Choice: ");
            choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Selected Option 1 ");
                    break;
                case 2:
                    System.out.println("Selected option 2");
                    break;
                case 3:
                    System.out.println("Selected option 3");
                    break;
                case 4:
                    System.out.println("Slected option 4");
                    break;
                case 5:
                    System.out.println("Menu is existing");
                    break;
                default:
                    break;
            }
        }while(choice != 5);
    }
}*/


/*import java.util.*;

class loop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int fact = 1;
        int num;
        System.out.print("Enter the number: ");
        num = obj.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int originalNum = num;
            do {
                fact = fact * num;
                num--; 
            } while (num > 0); 

            System.out.println("Factorial of " + originalNum + " = " + fact);
        }
    }
}*/




/*import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.print("Enter a positive number (or a negative number to stop): ");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
            }
        } while (number >= 0);

        System.out.println("The sum of the positive numbers entered is: " + sum);
        scanner.close();
    }
}*/



/*import java.util.Scanner;

class loop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = obj.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) { 
            int pro = num * i;
            System.out.println(num + " x " + i + " = " + pro); 
        }
    }
}*/



/*import java.util.Scanner;

class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}*/



/*import java.util.Scanner;

public class loop{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    scanner.close();

    String result = "Prime";
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        result = "Not Prime";
        break;
      }
    }

    System.out.println(num + " is " + result);
  }
}*/



