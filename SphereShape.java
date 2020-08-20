
public class SphereShape extends Circle
{
    
    public SphereShape() 
    {
        super();
    }
    
    public SphereShape(double radius, double thickness) 
    {
        super(radius, thickness);
    }
    
    double findVolume() 
    {
        double innerRadius = (getRadius()-getThickness());
        
        return ((4/3.0) * super.findArea()*getRadius()) -
                ((4.0/3)*super.findInnerArea()*innerRadius);
    }
    
    
    double findSurfaceArea() 
    {
        return 4 * findArea();
    }
    
    double findWeight() 
    {
        return findVolume() * getMaterialDencity();
    }
    
    public String toString() 
    {
        return super.toString() + "\n" + "with a thickness on " 
                + getThickness() + " This is a SphereShape";  
    }
    
}
