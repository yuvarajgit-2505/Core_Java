package java_basic;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class whilee {
    public static void main(String[] args) {
//        int i=0;
//        while (i<=6){
//            System.out.println(i+1);
//            i++;
//        }
        int attempts=0;
        int maxattempt=4;
        int pin=1234;
        while (attempts<maxattempt){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the pin:");
            int enterpin= scan.nextInt();
            if (enterpin==pin){
                System.out.println("Access the card");
                break;
            }
            else {
                System.out.println("invalid pin");
                attempts++;

            }
            if (attempts==maxattempt){
                System.out.println("out of attempts");
            }

        }

    }
}
