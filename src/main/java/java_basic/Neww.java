package java_basic;
import java.util.Scanner;

public class Neww {
    static String name="yuva";
    int rollno=21;

    public void makrs(){
        int maths=89;
        int enlish=92;
        Scanner scam=new Scanner(System.in);
        System.out.println(name);
        System.out.println(rollno);
        System.out.println("Maths marks is"+maths);
        System.out.println("Enlish mark is"+enlish);
        System.out.println("Enter the mark in Science");
        int Science= scam.nextInt();
        int total=maths+enlish+Science;
        System.out.println("Total mark is "+total);

    }
    public static void main(String[] args) {
        Neww obj= new Neww();
        obj.makrs();
    }

}
//task
//weight and level of games can play

