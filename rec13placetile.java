public class rec13placetile {
    public static int place(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical=place(n-m,m);
        int horizantal=place(n-1,m);
        return vertical +horizantal;

    }
    public static void main(String[] args) {
        int s=place(4,2);
        System.out.println(s);
    }
}
