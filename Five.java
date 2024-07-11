import java.util.*;
public class Five {
    public static void main(String[] args){
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number ");
    n=s.nextInt();
    System.out.println("Multiplication Table for " + n + ":");
    for (int i = 1; i <= 10; i++) {
        System.out.printf("%d x %d = %d%n", n, i, n * i);
    }

    }
}
