package week4;

import java.util.Scanner;
import java.text.DecimalFormat;

class CalculateSphere {
    double radius, volume, surfaceArea;
        
    void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        this.radius = scan.nextDouble();  
        scan.close();
    }

    void Calculate() {
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);  
        this.surfaceArea = 4.0 * Math.PI * Math.pow(this.radius, 2);     
    }
      
    void Display() {
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println("Sphere with radius " + radius + ":");
        System.out.println("Volume: " + df.format(volume));
        System.out.println("Surface Area: " + df.format(surfaceArea));
    }
}

public class SphereCalc {
    public static void main(String[] args) {
        CalculateSphere a = new CalculateSphere();
        a.Input();
        a.Calculate();
        a.Display();
    }
}
