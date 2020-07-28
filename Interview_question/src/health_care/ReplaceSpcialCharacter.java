package health_care;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpcialCharacter {

	public static void main(String[] args) {
		String s1="Shila@Patel";
		// regular expression
	         s1=s1.replaceAll("[^a-zA-Z0-9]", " ");
	         System.out.println(s1);

		ReplaceS( s1);
		
	}

	  public  static void ReplaceS(String s1){
		   String regex="[^a-zA-Z0-9]";
		   Pattern p=Pattern.compile(regex);
		   Matcher m=p.matcher(s1);
		    
		   while(m.find()){
			 System.out.println(  s1.replaceAll(regex, " "));
		   }
		  
		  
	  }
	  
}
