import java.util.*;
public class rec16Premutation {

    public static void printprem(String str,String prem,int idx)
    {   if(str.length()==0)
        {
            System.out.println(prem);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char cur =str.charAt(i);
            String newstr =str.substring(0,i) + str.substring(i,i+1);
            printprem(newstr, prem+cur, idx+1);
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        printprem(str, "", 0);
    }
}
