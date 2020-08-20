
public class Cylinder extends Circle
{
       private double height;
       
       public Cylinder() // Creating a defult constructor
       { 
           super();
           height = 4;           
       }
       
       public Cylinder(double radius, double height, double thickness) 
       {
           super(radius, thickness);
           this.height = height;   
       }
  
       public double getHeight() // Return height
       { 
           return height;

       }

       public void setHeight(double height) // Set a new height
       { 
           this.height= height;
       }

       public double findVolume() 
       {
           double innerHeight = (height -2*getThickness());
           return (super.findArea() * height)-(super.findInnerArea()* innerHeight);
       }
        
       public double findSurfaceArea() 
       {
           return (2 * Math.PI * getRadius() * getHeight()) +
                  (2 * findArea() );
       }
        
       public double findWeight() 
       {
           return findVolume() * getMaterialDencity();
       }
        
       public String toString() 
    {
       return super.toString() + " and height on " + height + "\n" + 
               "with a thickness on " + getThickness() + " This is a cylinder";  
    }

}
