import java.util.*;
/*class stack{
    ArrayList<Integer> list =new ArrayList<Integer>();
    public boolean isempty(){
        return list.size()==0;
    }
    public void push(int data){
        list.add(data);
    }
    public int  pop(){
        if(isempty())
        {
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public int peek(){
       return list.get(list.size()-1);
    }
}*/
public class stackArraylist {
   public static void pushbottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        pushbottom(data, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top =s.pop();
        reverse(s);
        pushbottom(top, s);
    }

    public static void main(String[] args) {
         Stack<Integer> s=new Stack<>();
         s.push(3);
         s.push(4);
         s.push(5);
         reverse(s);
         //pushbottom(9,s);
         while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
         }
    }
}


