import java.util.*;

public class rec5tow {
  public static void tower(int n,String src,String helper,String destination )
  {
    if(n==1)
    {
        System.out.println(" move disk "+n+" from "+src+" to "+destination);
        return;
    }
     tower(n-1,src,destination,helper);
     System.out.println(" move disk "+n+" from "+src+" to "+destination);
     
     tower(n-1,helper,src,destination);
  }
    public static void main(String[] args) {
        int n=2;
        tower(n,"S","H","D");
        
    }
}
