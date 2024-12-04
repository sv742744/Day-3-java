import java.util.*;
class shifts{
    public static void main( String [] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("right shift   "+(a>>b));
        System.out.println("left shit     "+(a<<b));
    }
}