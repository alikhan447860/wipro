public class Fifteen implements Thirteen,Fourteen {
    static int radius =10;
    public double area(){

        return 2*radius;
    };
    public double perimeter(){
        return perimeter();
    };
    public double line(){
        return line();
    };
    public double round(){
        return round();
    };
    public static void main(String [] args){
        Fifteen f=new Fifteen();
        System.out.println(f.area());
    }
}
