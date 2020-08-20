
public abstract class Rectangle extends GeometricObject
{
    
    
    private double length;
    private double width;
    
    public Rectangle() 
    {
        super();
        length = 3;
        width = 3;
        
    }
    
    public Rectangle(double length, double width, double thickness) 
    {
        super(thickness);
        this.length = length;
        this.width = width;
        
              
    }
    
    double getLength() 
    {
        return length;
    }
    
    void setLength(double length) 
    {
        this.length = length;
    }
    
    double getWidth() 
    {
        return width;
    }
    
    void setWidth(double width) 
    {
        this.width = width;
    }
    
    double findArea() 
    {
        return length * width;
    }
    
    public double findInnerArea() 
    {
        return (length-getThickness())*(width-getThickness());
    }
    
    double findCircumference()
    {
        return (length + length + width + width);
    }
    
    public String toString() 
    {
        return super.toString() + "\n" + "the object has a length on " + 
                length + "a width on " + width;
    }

    
}
