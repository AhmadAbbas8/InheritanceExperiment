
package inheritanceproject;


 
public class Inheritanceproject {

   
    public static void main(String[] args) {

        Shape shape = new Circle(5);
        System.out.println("Area = " + shape.calculateArea());
        shape.drawShape();
        
        
    }
    
}
