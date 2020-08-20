
public abstract class GeometricObject 
{
                    
    private double materialDencity = 7.8;
    private double thickness;
  
    abstract double findArea();
    abstract double findVolume();
    abstract double findCircumference();
    abstract double findSurfaceArea();
    abstract double findWeight();
    
    public GeometricObject()
    {
        thickness = 1;
    }
    
    public GeometricObject(double thickness)
    {
        this.thickness = thickness;
    }
    
    public double getThickness() 
       {
           return thickness;
       }
       
       public void setThickness(double thickness) // Set a new thickness
        { 
           this.thickness = thickness;
       }
    
    double getMaterialDencity() {
        return materialDencity;
    }
    
    public String toString() 
    {
        return "This object consists of iron, " +
                "and has a weight of " + 
                materialDencity + " kg/dm^3";
    }

}
