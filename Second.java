import java.util.*;
public class Second {
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        n=s.nextInt();
        if(n%2==0){
            System.out.println("it is a even number");
        }else{
            System.out.println("it is a odd number");
        }
    }
}
