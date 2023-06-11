/*public class rec4Pow {
    public static int calpow(int i,int n)
    {
        if(i==0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        //stack height = logn
        if(n%2 ==0)
        {
            return calpow(i,n/2)*calpow(i,n/2);
        }
        else 
        {
            return calpow(i,n/2)*calpow(i,n/2)*i;
        }
    }
    public static void main(String[] args) {
      int x=  calpow(2,5);
      System.out.println(x);
    }
}
*/
class rec4Pow
{    public static int calpow(int n,int p)
    {
        if(p==0)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        return n*calpow(n,p-1);
    }
    public static void main(String[] args) {
        int s=calpow(2,5);
        System.out.println(s);
    }
}