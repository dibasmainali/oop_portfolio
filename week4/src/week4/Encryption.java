package week4;

import java.util.Scanner;
import java.util.Random;

class PinEncrypter {
    private int pin;
    private String encryptedPin;
    private int firstRandom, secondRandom;
    
    void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a 4 digit pin number to encrypt: ");
        this.pin = scan.nextInt();
        scan.close();
    }
    
    void Encrypt() {

        String hexPin = Integer.toHexString(this.pin);
        
   
        Random random = new Random();
        this.firstRandom = random.nextInt(64536) + 1000;  
        this.secondRandom = random.nextInt(64536) + 1000; 
        
     
        String hexFirstRandom = Integer.toHexString(this.firstRandom);
        String hexSecondRandom = Integer.toHexString(this.secondRandom);
        

        this.encryptedPin = hexFirstRandom + hexPin + hexSecondRandom;
    }
    
    void Display() {
        System.out.println("Your encrypted pin number is " + this.encryptedPin + ".");
    }
}

public class Encryption {
    public static void main(String[] args) {
        PinEncrypter a = new PinEncrypter();
        a.Input();
        a.Encrypt();
        a.Display();
    }
}
