
package inheritanceproject;


public class Circle extends Shape{
    
    private int raduis;

    public Circle(int raduis) {
        this.raduis = raduis;
    }
    
    @Override
    public double calculateArea(){
    
    double area = Math.PI * this.raduis*this.raduis;
    return area;
    }
    
  @Override
    public void drawShape(){

      System.out.println("Circle");

}

    public int getRaduis() {
        return raduis;
    }

    public void setRaduis(int raduis) {
        this.raduis = raduis;
    }
    
    
    
    
}
