public class rec12maze {
    public static int maze(int i,int j,int n,int m){
        if(i==n || j== m){
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
       
        int down=maze(i+1, j, n, m);
        int right =maze(i, j+1, n,m );
        return down+right;
    }
    public static void main(String[] args) {
        
       int s= maze(0, 0, 3, 3);
       System.out.println(s);
    }
}
