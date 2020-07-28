package stringprogram;

public class RemoveDublicateChar {

	public static void main(String[] args) {
		String s="i am belongs to Rewa madhya pradesh which is so for to bangalore";
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)){
					
					count++;
					break;
				}
				
			}
			
		  if(count==0) {
			  System.out.print(s.charAt(i));
		  }
		}

		
	}
}
