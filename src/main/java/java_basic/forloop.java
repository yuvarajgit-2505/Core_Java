package java_basic;


import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        int pin=1234;
        int Enterpin;

        for (int attempt=0;attempt<4;attempt++){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the pin:");
            Enterpin= scan.nextInt();
            if (Enterpin==pin){
                System.out.println("Now you can access the card");
                break;
            }
            else {
                System.out.println("invalid pin");
            }
        if (attempt==3){
            System.out.println("Out of attempts");
        }


        }
    }
}
