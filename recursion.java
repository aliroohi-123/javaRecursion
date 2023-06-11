import java.util.*;
import java.util.concurrent.SubmissionPublisher;
public class recursion {
    public static  void  print1(int n,int sum)
    {
        if(n==1)
        {   sum += n;
            System.out.println(sum);
            return;
        }
        sum += n;
        print1(n-1,sum);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        print1(5,0);
        
    }
}
