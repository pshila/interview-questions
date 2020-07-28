package health_care;

public class FabonacySeries {
	   int a=10;
	   int b=20;
	   int c=0;

	public static void main(String[] args) {
	  //By using recursion class
		FabonacySeries f= new FabonacySeries();
		f.fabo(12);
		
 
	}
	public  void fabo(int n){
		if(n>=1)
			
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
			fabo(n-1);
		}
		
		
		
	}

}
