import java.util.*;
/*public class rec7subString {
    //for unique substring
    public static void subsequence(String str,int idx,String newString,HashSet<String> set)
    { if(idx==str.length())
        {if(set.contains(newString))
            {               
                return;
            }
            else
            System.out.print(newString+" ");
            set.add(newString);
            return;
        }
        char cur =str.charAt(idx);
        subsequence(str, idx+1, newString+cur,set);
        subsequence(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str ="abc";
        HashSet<String> set=new HashSet<String>();
        subsequence(str, 0, "",set);
    }
}*/
class rec7subString{
    public static void sub(String str,int idx,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char cur=str.charAt(idx);
        sub(str, idx+1, newstring+cur);
        sub(str, idx+1, newstring);
    }
    public static void main(String[] args) {
        String str="abc";
        sub(str,0,"");
    }
}