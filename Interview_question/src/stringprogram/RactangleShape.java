package stringprogram;

public class RactangleShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ractangle();
        ractangle1();
        
        
        
	}
	private static void ractangle1() {
		String s="Transneuron";
        for(int i=0;i<s.length();i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print(s.charAt(j));
        	}
        	System.out.println();
        }
	}
	private static void ractangle() {
		String s="Transneuron";
        String s1="";
        for(int i=0;i<s.length();i++) {
        	 s1+=s.charAt(i);
        	 System.out.println(s1);
        }
	}

}
