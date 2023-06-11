public class rec10dup {
    public static boolean[] map=new boolean[26];
    public static void dup(String str,int idx,String newstring){
        if(idx==str.length())
        {
            System.out.println(newstring);
            return;
        }
        char cur=str.charAt(idx);
        if(map[cur-'a']==true)
        {
            dup(str, idx+1, newstring);
        }
        else{
            newstring+=cur;
            map[cur-'a']=true;
            dup(str, idx+1, newstring);
        }
    }
    public static void main(String[] args) {
        String str ="asdeas";
        dup(str, 0, "");
        
    }
}
