package CompositionCircleCylinder;

public class Circle {
    private double radius;
    private String colour;

    Circle(){
        radius=1.0;
        colour="red";
    }
    Circle(double radius){
        this.radius=radius;
        colour="red";
    }
    Circle(double radius,String colour){
        this.radius=radius;
        this.colour=colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",colour='" + colour + "]";
    }
}
