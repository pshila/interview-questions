package health_care;

public class ReverseStringByFunction {
	
	public static void reverse(String s1){
		if(s1.length()<=1)
		System.out.println(s1);
		else{
		 System.out.print( s1.charAt(s1.length()-1));
		reverse(s1.substring(0,s1.length()-1));
		}}
	public static void revs(){
		String s1="ShilaPatel";
		char[] ch=s1.toCharArray();
		for(int i=ch.length-1; i>=0;i--){
			System.out.print(ch[i]);
		}}
	public static void reverseEachString(){
		
		String s="My name is shila Patel";
		   String[] s1= s.split(" ");
		   for(int i=0;i<=s1.length-1;i++){
			   String s2=s1[i];
			   String rev="";
			   for(int j=s2.length()-1;j>=0;j--){
				   rev+=s2.charAt(j);
			     } 
			   System.out.print(rev+" ");
		   }}
	public static void reverseMidWord(){
		String s1="my name shila";
		String[] s2=s1.split(" ");
		for(int i=0;i<=s2.length-1;i++){
			String s3=s2[i];
			String rev="";
			
			int mid=s2.length/2;
			
			if(i==mid){
				for(int j=s3.length()-1;j>=0;j--){
					rev+=s3.charAt(j);
				}
			System.out.print(rev+" ");
			}
			else{
			System.out.print(s3+" ");
			}
			   }
		}
	
	public static void main(String[] args) {

		reverse("Shila");
		revs();
		reverseEachString();
		reverseMidWord();	

	}

}
