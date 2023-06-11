public class rec11prem {
    public static void pre(String str,String prem){
        if(str.length()==0){
            System.out.println(prem);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char cur =str.charAt(i);
            String newstring = str.substring(0,i) +str.substring(i+1);
            pre(newstring,prem+cur);

        }
    }
    public static void main(String[] args) {
        String str="abc";
        pre(str,"");
    }
}
