import java.util.*;
public class rec10Move {
    public static void string(String str,int idx,int count,String newstring)
    { 
        if(idx==str.length()){
            for(int i=0;i<count;i++)
            {
                newstring +='x';
                
            }
            System.out.println("  "+newstring);
            return;
        }
        char cur=str.charAt(idx);
        if(cur=='x')
        {
            count++;
            string(str, idx+1, count, newstring);
        }
        else{
        newstring += cur;
        
        string(str, idx+1, count, newstring);
        }
    }
    public static void main(String[] args) {
        String str ="axxdfwfx";
      
        string(str, 0, 0, "");
      
        
    }
}
