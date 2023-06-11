import java.util.*;
public class rec6rev {
   public static void strrev(String str,int idx)
   {
      if(idx==0)
      {
         System.out.print(" "+str.charAt(idx));
         return;
      }
      System.out.print(" "+str.charAt(idx));
      strrev(str,idx-1);
   }
   public static void main(String[] args) {
    String s ="abcde";
    strrev(s,s.length()-1);
    

   } 
}
