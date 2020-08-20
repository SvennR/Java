
public abstract class Circle extends GeometricObject
{
    private double radius;
     
    public Circle() {   // Creating a defult constructor
        super();
        radius = 1;
    }
    
    public Circle(double radius, double thickness) {  // Creating a constructor with value
        super(thickness);
        this.radius = radius;       
    }
    
    public double getRadius() { // Return radius
        return radius;
    }
    
    public void setRadius(double radius) { // Set a new radius
        this.radius = radius;
    }
    
    public double findCircumference() {
       return Math.PI * 2 * radius;
    }
    
    public double findArea() { 
        return radius * radius * Math.PI;
    }
    
    public double findInnerArea() 
    {
        return (radius-getThickness()) * (radius-getThickness()) * Math.PI;
    }
    
    public String toString() 
    {
        return super.toString() +"\n" + "the object has a radius on " + radius;
    }

} // End of class


