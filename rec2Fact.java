import java.net.SocketTimeoutException;
import java.util.*;
public class rec2Fact {
   public static int  fact(int i)
   {
     if(i==1 || i== 0)
     {
        return 1;
     }
     return i*fact(i-1);
   }
    public static void main(String[] args) {
      int s=  fact(5);
      System.out.println(s);
    }
}


