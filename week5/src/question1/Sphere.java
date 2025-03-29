package question1;

class Sphere {
    private double diameter;

    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRadius() {
        return diameter / 2.0;
    }

    public double getVolume() {
        double radius = getRadius();
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        double radius = getRadius();
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Sphere with diameter: " + diameter;
    }
}

