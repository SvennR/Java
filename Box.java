
public class Box extends Rectangle
{
    private double height;
    
    public Box() 
    {
        super();
        height = 3;
    }
    
    public Box(double length, double width, double height, double thickness) 
    {
        super(length, width, thickness);
        this.height = height;
    }
    
    double getHeight() 
    {
        return height;
    }
    
    public void setHeight(double height) 
    {
        this.height = height;
    }
    
    double findVolume() 
    {
        double innerHeight = height - 2 * getThickness();
        return (super.findArea() * height)-(super.findInnerArea()*innerHeight);
    }
    
    double findSurfaceArea() 
    {
        return 2*(getLength()*getWidth()+getWidth()*
                height+getLength()*height);
    }
    
    double findWeight() 
    {
        return findVolume() * getMaterialDencity();
    }
    
    public String toString()
    {
        return super.toString() + "a height on " + height + "\n" + 
                "with a thickness on " + getThickness() + " This is a box";  
    }

 
}
