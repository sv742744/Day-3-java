import java.util.*;
class smallest{
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a<b){
            if(a<c)
                System.out.println("a is smaller");
            else
                System.out.println("c is smaller");
        }
        else{
            if(b<a)
                System.out.println("b is smaller");
            else
                System.out.println("c is smaller");
        }
    }
}