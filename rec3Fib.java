import java.util.*;
public class rec3Fib {
    public static void fib(int a,int b,int n)
    {
       if(n==0 )
       {
        return;
       }
     int   c=a+b;
     System.out.print(" "+c+" ");
      fib(b,c,n-1);
      
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a+" "+b);
        fib(a,b,6);
    }
}