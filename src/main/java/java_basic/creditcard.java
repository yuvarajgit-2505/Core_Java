package java_basic;


import java.util.Scanner;

public class creditcard {
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        System.out.println("Enter the cibil score you have:");
        int score= ent.nextInt();
        if (score>=100 && score<=200) {
            System.out.println("You are eligible for the loan amounnt of 1 lakh");
            System.out.println("Enter the adhar number for extra loan amount");
            long adhar= ent.nextLong();
            if (ent.hasNextLong()){

                System.out.println("Now you are eligible for the extra loan amount");
            }
            else {
                System.out.println("Enter a valid adhaar number");
            }
        } else if (score>=200 && score<=400) {
            System.out.println("you are eligible for the loan amount of 2 lakh");
            System.out.println("Enter the adhar number for extra loan amount");
            long adhar= ent.nextLong();
            if (ent.hasNextLong()){
                System.out.println("Now you are eligible for the extra loan amount");
            }
            else {
                System.out.println("Enter a valid adhaar number");
            }
        } else if (score>=400 && score<=500) {
            System.out.println("You are eligible with the loan amount of 5 lakh");
            System.out.println("Enter the adhar number for extra loan amount");
            long adhar= ent.nextLong();
            if (ent.hasNextLong()){
                System.out.println("Now you are eligible for the extra loan amount");
            }
            else {
                System.out.println("Enter a valid adhaar number");
            }
        }
        else if (score>500) {
            System.out.println("You are eligible with the loan amount of 5 lakh");
            System.out.println("Enter the adhar number for extra loan amount");
            long adhar= ent.nextLong();
            if (ent.hasNextLong()){
                System.out.println("Now you are eligible for the extra loan amount");
            }
            else {
                System.out.println("Enter a valid adhaar number");
            }
        }

        else {
            System.out.println("you are not eligible for the loan");
        }

            }

        }


