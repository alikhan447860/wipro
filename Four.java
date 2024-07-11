import java.util.*;
public class Four {
    public static void main(String [] args){
        double p,r,t;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the principle amount");
   p=s.nextDouble();
   System.out.println("Enter the time");
   t=s.nextDouble();
   System.out.println("Enter the rate");
   r=s.nextDouble();
   double simpleInterest = (p * r * t) / 100;
   System.out.println(simpleInterest);
    }
}
