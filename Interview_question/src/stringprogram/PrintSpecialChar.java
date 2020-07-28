package stringprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintSpecialChar {

	public static void main(String[] args) {
		String s="ghfhrt@hf6*47&4#$b^&vT^b^g7$654G";
		String reguEx="[^a-zA-Z0-9]"; //regularExpression
		String special=" ";
		int count=0;
		Pattern p=Pattern.compile(reguEx);
		Matcher m=p.matcher(s);
		while(m.find()) {
			count++;
			special+=s.charAt(m.start());
			
			
		}
		System.out.println(count);
		System.out.println(special);
	}

}
