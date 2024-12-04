import java.util.*;
class biggestnumber{
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if((a>b)&&(a>c))
        {
        String r=String.format("a is bigger");
            System.out.println(r);
        }
        else if((b>a)&&(b>c)){
            String r=String.format("b is bigger");
            System.out.println(r);
        }
        else {
            String r=String.format("c is bigger");
            System.out.println(r);
        }
    }

}