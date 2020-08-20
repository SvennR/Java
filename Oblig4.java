
public class Oblig4 
{

    public static void main(String[] args) 
    {
        // Create a cylinder with radius: 5, height: 2, thickness: 1
        Circle cylinder1 = new Cylinder(2,2, 0.2); 
        
        // Create a box with length: 4, width: 2, height: 3, thickness: 1
        Rectangle box1 = new Box(4,2,3, 1);
        
        // Create a cone with radius: 3, height: 4, thickness: 1
        Circle cone1 = new Cone(3,4, 1); 
        
        // Create a sphere with radius:5 and thickness: 1
        Circle sphere1 = new SphereShape(5, 1);
        
        // 
        System.out.println(cylinder1.toString()); // sensible information about 
        System.out.println("the cylinder's volume is: " + cylinder1.findVolume());
        System.out.println("The cylinder's surface area is: " + cylinder1.findSurfaceArea());
        System.out.println("The cylinder's weight is: " + cylinder1.findWeight());
        System.out.println("\n");
        System.out.println(box1.toString());
        System.out.println("the box's volume is: " + box1.findVolume());
        System.out.println("the box's surface area is: " + box1.findSurfaceArea());
        System.out.println("the box's weight is: " + box1.findWeight());
        System.out.println("\n");
        System.out.println(cone1.toString());
        System.out.println("the cone's volume is: " + cone1.findVolume());
        System.out.println("the cone's surface area is: " + cone1.findSurfaceArea());
        System.out.println("the cone's weight is: " + cone1.findWeight());
        System.out.println("\n");
        System.out.println(sphere1.toString());
        System.out.println("the sphere's volume is: " + sphere1.findVolume());
        System.out.println("the sphere's surface is: " + sphere1.findSurfaceArea());
        System.out.println("the sphere's weight is: " + sphere1.findWeight());

    }
}
