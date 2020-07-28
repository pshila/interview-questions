package stringprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpaceOrCountSpace {

	public static void main(String[] args) {
		countSpace();
		removeSpace();
	}
	
	
	private static void countSpace() {
		String s="I am  working with  4 tester in my company";
		String reguex="\\s";
		String str = null;
		int count=0;
		Pattern p=Pattern.compile(reguex);
		Matcher m=p.matcher(s);
		while(m.find()) {
			count++;
			str+=s.charAt(m.start());
			
		}
		System.out.println(count);
	}


	private static void removeSpace() {
		String s="I am  working with  4 tester in  my company";
		String reguex="[a-zA-Z0-9]";
		String str="";
		int count=0;
		Pattern p=Pattern.compile(reguex);
		Matcher m=p.matcher(s);
		while(m.find()) {
			count++;
			str+=s.charAt(m.start());
			
		}
		System.out.println(count);
		System.out.println(str);
	}
		
}
	

	
