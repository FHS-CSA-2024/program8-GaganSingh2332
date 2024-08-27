//import stuff here
import java.util.Scanner;
import java.lang.Math;
//Your code here
public class Program8 {
public static void main(String[] args) {
int firstNum = 0;
int secondNum = 0;
  
Scanner numScanner = new Scanner(System.in);
System.out.println("Enter any Integer: ");
firstNum = numScanner.nextInt();
System.out.println("Enter another Integer: ");
secondNum = numScanner.nextInt();

int sum = firstNum + secondNum;
int difference = firstNum - secondNum;
int product = firstNum * secondNum;
double average = (double) (sum) / 2;
int distance = Math.abs(difference);
int max = (Math.abs(difference) + sum) / 2;
int min = (Math.abs(sum) - Math.abs(difference)) / 2;


System.out.println(sum);
System.out.println(difference);
System.out.println(product);
System.out.println(average);
System.out.println(distance);
System.out.println(max);
System.out.println(min);
 
 
 }
}
//Paste console output below:
/*
Enter number 1: 13

Enter number 2: 20

Original numbers are 13 and 20

Sum = 33

Difference = -7

Product = 260

Average = 16.5

Absolute value = 7

Maximum = 20

Minimum = 13

*/
