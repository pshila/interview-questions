package stringprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintOnlyChar {

	public static void main(String[] args) {
	  String s="gh64bhh5gg5vg3b%7v$gdh&hef$dh^";
	  String str=" ";
	  String regex="[a-zA-Z]";
	  Pattern p=Pattern.compile(regex);
	  Matcher m=p.matcher(s);
	  while(m.find()) {
		  str+=s.charAt(m.start());
	  }
   System.out.println(str);	  

	}

}
