import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        int a[]={7,8,1,2};
        for(int i=0;i<a.length-1;i++)
        {
            int small =i;
            for(int j=i+1;j<a.length;j++)
            if(a[small]>a[j]){
            {
                small =j;
            }}
            int temp=a[small];
            a[small]=a[i];
            a[i]=temp;
        
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
