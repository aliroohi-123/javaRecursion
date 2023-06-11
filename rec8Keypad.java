public class rec8Keypad {
    public static String [] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcomb(String str,int idx,String combination)
    {
        if(idx==str.length())
        {
            System.out.print(combination+" ");
            return;
        }
        char cur= str.charAt(idx);
        String mapping=keypad[cur-'0'];
        for(int i=0;i<mapping.length();i++)
        {
            printcomb(str, idx+1, combination+mapping.charAt(i));
        }
    }  
    public static void main(String[] args) {
        String str="2";
        printcomb(str, 0, "");
    }
}
