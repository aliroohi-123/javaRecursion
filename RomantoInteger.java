import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;
import java.security.Key;
  class RomantoInteger{
	
        // code here
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s =sc.next();
		HashMap<Character,Integer> translations =new HashMap<>();
		translations.put('I',1); 
        translations.put('V',5); 
        translations.put('X',10); 
        translations.put('L',50); 
        translations.put('C',100); 
        translations.put('D',500); 
        translations.put('M',1000);
       
		s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
		int res =0;
		for(int i=0;i<s.length();i++){
			res =res+ translations.get(s.charAt(i));
		}
		System.out.println(res);
          
		
	}
  }
