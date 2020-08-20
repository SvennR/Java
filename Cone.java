
public class Cone extends Circle
{
    private double height;
 
    public Cone() 
    {
        super();
        height = 3;
    }
    
    public Cone(double radius,double height, double thickness) 
    {
        super(radius, thickness);
        this.height = height;
    }
    
    double findVolume() 
    {
        double innerHeightCone = height - getThickness()-
                Math.sqrt(((getThickness()*getRadius())/(height))
                        *((getThickness()*getRadius())/(height)+
                        getThickness()*getThickness()));
        
        double innerRadiusCone = (innerHeightCone * getRadius())/height;
        
        return ((1.0/3)*super.findArea()*height) -
                ((1.0/3)*innerRadiusCone*innerRadiusCone*Math.PI*innerHeightCone);
    }
    
    double findSurfaceArea() 
    {
        double slantHeigh = Math.sqrt((getRadius()*getRadius()) +
                (height*height));
        
        return Math.PI*getRadius()*(getRadius() + slantHeigh);
    }
    
    double findWeight() 
    {
        return findVolume() * getMaterialDencity();
    }
    
    public String toString() 
    {
        return super.toString() + " and height on " + height + "\n" + 
                "with a thickness on " + getThickness() + " This is a cone";  
    }
    
}
