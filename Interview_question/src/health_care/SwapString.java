package health_care;

public class SwapString {

	public static void main(String[] args) {
		String s1="Shila";
		String s2="Patel";
		s2=s1+s2;
		s1=s2.substring(s1.length(),s2.length());  //s2=shilapatel
		s2=s2.substring(0,s1.length());    
		System.out.println(s1);
		System.out.print(s2);

	}

}
