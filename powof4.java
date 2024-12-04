import java.util.*;
class powof4{
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        if((a&(a-2))==0)
            System.out.println("power of 4");
        else
            System.out.println(" not power of 4");
    }
}