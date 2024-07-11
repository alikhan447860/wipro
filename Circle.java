public class Circle implements Shape {
    int radius;
    public double calculateArea() {
        return Math.PI * radius * radius;
    }    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
  
}
