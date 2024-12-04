import java.util.*;
class setbit{
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int pos=s.nextInt();
        if((a&(1<<pos))!=0){
            System.out.println("set bit");
        }
        else{
            System.out.println("not aset bit");
        }
    }
}