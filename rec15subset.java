import java.util.*;
public class rec15subset {
    public static void printsubset(ArrayList<Integer> subset)
    {
        for(int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
   public static void findsub(int n,ArrayList<Integer> subset){
   if(n==0)
   {
    printsubset(subset);
    return;
   }
   subset.add(n);
   findsub(n-1,subset);
   subset.remove(subset.size()-1);
   findsub( n-1, subset);
}
    public static void main(String[] args) {
        ArrayList<Integer> subset=new ArrayList<>();
        
        findsub(3, subset);
    }
}
