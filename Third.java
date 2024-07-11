import java.util.*;
public class Third {
    public static void main(String[] args){
        double radius;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius");
        radius=s.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
   System.out.println(area);
    }
}
