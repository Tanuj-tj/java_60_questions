class Car{
    Car()
    {
     System.out.println("Class Car");
    }
    void vehicleType()
    {
     System.out.println("Vehicle Type: Car");
    }
 }
 class Maruti extends Car{
    Maruti()
    {
     System.out.println("Class Maruti");
    }
    void brand()
    {
     System.out.println("Brand: Maruti");
    }
 }
 class P3_MultilevelInheritance extends Maruti{
 
   P3_MultilevelInheritance()
    {
     System.out.println("Derived Class ");
    }
    void speed()
    {
     System.out.println("Max: 80Kmph");
    }
    public static void main(String args[])
    {
      P3_MultilevelInheritance obj=new P3_MultilevelInheritance();
      obj.vehicleType();
      obj.brand();
      obj.speed();
    }
 }