package CompositionCircleCylinder;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }
    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height,String colour) {
        base = new Circle(radius,colour);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return base.getArea()*height;
    }
    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public double getArea(){
        return base.getArea();
    }

    public String getColour(){
        return base.getColour();
    }
}
