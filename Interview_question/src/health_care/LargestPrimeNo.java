package health_care;

public class LargestPrimeNo {

	public static void main(String[] args) {
		int largPrime=0;
		   for (int n=2;n<=200;n++) {
			   int count=0;
			   for(int i=2;i<=n/2;i++){
				      if(n%i==0) {
				    	  count++;
				    	  break;
				      }
				   }
			    if(count==0) {
			    //	System.out.print(n+"          ");
			    	if (largPrime<n) {
			    		largPrime=n;
			    	}
			    }
		   }
		 System.out.print("  "+largPrime+"     ");
	}

}
