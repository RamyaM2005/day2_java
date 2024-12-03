import java.util.*;
public class Swapingusingxor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two values to swap:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swap a:"+a);
        System.out.println("before swap b:"+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap a:"+a);
        System.out.println("After swap b:"+b);
        
    }

    
}
