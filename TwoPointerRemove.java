package DSA;

public class TwoPointerRemove {
	
	public static int removeDuplicate(int[] num) {
		int k=2;
		for(int i=2;i<num.length;i++) {
			
			if(num[i] != num[k-2]) {
				num[k]=num[i];
				k++;
			}
			
		}
		return k;
	}
	
	public static void main(String[] args) {
		
		
	  int[] a =	{1,1,1,2,2,3};
	 int ans= removeDuplicate(a);
	 System.out.println(ans);
	}

}
