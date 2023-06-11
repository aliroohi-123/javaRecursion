public class rec14Calguest {
    public static int guest(int n)
    {   if(n<=1)
        {
            return 1;
        }
        int way1=guest(n-1);
        int way2=(n-1)*guest(n-2);
        return way1+way2;
    }
    public static void main(String[] args) {
        int s=guest(4);
        System.out.println(s);
    }
}
