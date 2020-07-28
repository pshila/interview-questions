package health_care;

public class AlternetCharFromTwoString {

	public static void main(String[] args) {
		String s1="Shilap";
		String s2="Patela";
		String str=" ";
		int j=0;
		
		for(int i=0;i<s1.length()-1;i++){
			
			str+=s1.charAt(i);
			str+=s1.charAt(i+1);
			i=i+1;
			
			for(;j<i;j++){
				str+=s2.charAt(j);
				str+=s2.charAt(j+1);
				j=j+1;
			}
			
		}
		
   System.out.println(str);
	}

}
