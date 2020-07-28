package health_care;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecialCharacter {

	public static void main(String[] args) {
		String s1="fshjf#nkj&%^$#mk9$^%*";
		String regex="[^a-zA-A0-9]";
       String special=" ";
       int count=0;
		 Pattern p=Pattern.compile(regex);
		   Matcher m=p.matcher(s1);
		    
		   while(m.find()){
			   count++;
			   special+= s1.charAt(m.start()) ;
		   }
	     
		   System.out.println(special);
		   System.out.println(count);
	}
	

}
