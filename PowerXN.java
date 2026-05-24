package DSA;

public class PowerXN {
	
	/* public static double myPow(double x, long n) {
		    if (n == 0)
		      return 1;
		    if (n < 0)
		      return 1 / myPow(x, -n);
		    if (n % 2 == 1)
		      return x * myPow(x, n - 1);
		    return myPow(x * x, n / 2);
		  }*/
	
		public static double myPow(double x, long n) {
			if(n ==0)
				return 1;
			
			if(n<0)
				return 1/myPow(x,-n);
			
			if(n%2 ==1) {
				return x*myPow(x,n-1);
			}
			
			return myPow(x*x,n/2);
			
		}
		  
		  
		 public static void main(String[] args) {
			 
			 double x = 2.000;
			 
			 int n =10;
			System.out.println( myPow(x,n));
			
			
		}

}
