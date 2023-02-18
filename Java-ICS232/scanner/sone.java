package scanner;

import java.util.Scanner;

public class sone {
    public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);

    System.out.print("age");
    int age = s.nextInt();
   
    System.out.print("name");
    String name = s.next();

    System.out.print("weight");
    int weight = s.nextInt();    

    System.out.println("Your age is " +age);
    System.out.println("Your name is " +name);
    System.out.println("Your weight is " +weight);
    

    }
}