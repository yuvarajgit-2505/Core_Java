package java_basic;


import java.util.Scanner;

public class Wonderla {
    public static void main(String[] args) {
        System.out.println("WELCOME TO WONDERLA");
        System.out.println("Enter your age:");
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        if (age>=20){
            System.out.println("You are eligible for high thrill games");
        }
        else {
            System.out.println("Sorry you are not eligible for high thrill games");
        }
        System.out.println("Enter the gender");
        String gender=scan.next();
        if (gender.equalsIgnoreCase("male" )|| gender.equalsIgnoreCase("female"))
        {
            System.out.println("Enter your height by feet");
            int height=scan.nextInt();
            if (height >=5)
            {
                System.out.println("You can play water games which have water level is 40m");
                System.out.println("Enjoy your rides!!");
            }
            else {
                System.out.println("You can't play the water games which have water level more than 20m");
                System.out.println("Play responsibly");
            }

        }
        else {
            System.out.println("Please enter valid details");

        }

    }
}
