package question1;

public class MultiSphere {
    public static void main(String[] args) {
        Sphere s1 = new Sphere(10);
        Sphere s2 = new Sphere(20);
        
        System.out.println(s1);
        System.out.println("Volume: " + s1.getVolume());
        System.out.println("Surface Area: " + s1.getSurfaceArea());
        
        System.out.println(s2);
        System.out.println("Volume: " + s2.getVolume());
        System.out.println("Surface Area: " + s2.getSurfaceArea());
    }
}