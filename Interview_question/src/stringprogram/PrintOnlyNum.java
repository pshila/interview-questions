package stringprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintOnlyNum {

	public static void main(String[] args) {

     String s="fdgfdgfg2%4hh@h3hjb33h$j4b34%n3b3";
     String regex="[0-9]";
     String Num="";
    Pattern p=Pattern.compile(regex);
     Matcher m=p.matcher(s);
     while(m.find()) {
    	 Num+=s.charAt(m.start());
    			 
     }
     System.out.println(Num);
	}

}
