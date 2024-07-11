import java.util.*;
public class Six {
    public static void main(String [] args){
        String a;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the character");
     a=s.next();
     switch (a) {
        case "a":
            System.out.println("This is vovel:" +a);
            break;
            case "e":
            System.out.println("This is vovel:"+a);
            break;
            case "i":
            System.out.println("This is vovel:"+a);
            break;
            case "o":
            System.out.println("This is vovel:"+a);
            break;
            case "u":
            System.out.println("This is vovel:"+a);
            break;
     
        default:
        System.out.println("THis is Consonent");
            break;
     }
    }
}
