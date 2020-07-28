package health_care;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpace {

	public static void main(String[] args) {
	/*	
		short a=-128;
		short b=2;
		short c=  (short) (a+b);
		System.out.println(c);
		*/
		String s="my name is shila patel, i am the wife of drigendra patel";
		countspace(s);
		countSpace(s);
	}
	 
	public static void countspace(String s){
		
		String reg="\\s";
		int count=0;
       Pattern pt=Pattern.compile(reg);
       Matcher mat=pt.matcher(s);
       
        while (mat.find()){
        	count++;
        	
        	
        }
        System.out.println(count);
	}
	
	public static void countSpace(String s){
		String[] s1=s.split(" ");
		int count =s1.length-1;
		System.out.println(count);
		
	}
}
