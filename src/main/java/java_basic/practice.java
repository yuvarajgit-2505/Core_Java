package java_basic;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("WELCOME TO WONDERLA");
        System.out.println("Enter your age");
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        if (age>=20){
            System.out.println("you are eligible for water games");
        }
        else {
            System.out.println("sorry you are not eligible");
        }
        System.out.println("Enter the gender");
        String geneder=scan.next();
        if (geneder.equalsIgnoreCase("male"))
        {
            System.out.println("Enetr your height");
            int height=scan.nextInt();
            if (height >=6)
            {
                System.out.println("Water level is 40m");
                System.out.println("Enjoy your rides");
            }
            else {
                System.out.println("Water level is 20m");
                System.out.println("Play responsibly");
            }

        }
        else {
            System.out.println("Water level is 20 meter");
            System.out.println("Enjoy your rides");
        }

    }
}
