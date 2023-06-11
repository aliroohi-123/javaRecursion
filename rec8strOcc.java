import java.util.*;
public class rec8strOcc {
    public static int frist =-1;
    public static int  last=-1;
    public static void strr(String str,int idx, char e)
    {
        if(idx==str.length())
        {
            System.out.println(frist);
            System.out.println(last);
            return;
        }
        char cur = str.charAt(idx);
        if(cur==e)
        {
            if(frist==-1)
            frist=idx;
        }
        else
        last=idx;
        strr(str, idx+1, e);
    }
    public static void main(String[] args) {
        String str ="aabfra";
        strr(str,0,'a');
        
        

    }
}
