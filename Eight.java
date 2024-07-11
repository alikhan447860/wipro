public class Eight {
    int count = 0;
    public void calculate(String s) {
        for (int index = 0;; index++) {
            try {
                s.charAt(index);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        Eight e = new Eight();
        e.calculate("ali");
        Nine n=new Nine();
        n.sum(10,20);
    }
}
 class Nine{

public void sum(int a,int b){
    System.out.println(a+b);
}
}