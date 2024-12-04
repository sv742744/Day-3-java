import java.util.*;
class powerof2{
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        if((a&(a-1))==0)
            System.out.println("power of 2");
        else
            System.out.println(" not power of 2");
    }
}