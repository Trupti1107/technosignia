package DSA;

public class RotateString {
	
	static String rotateString(String s , int d){
		
		int n = s.length();
		
		d %= n;
		
		char[] temp = s.toCharArray();
		
		  // Reverse the first d elements
		reverseString(temp, 0, d - 1);

        // Reverse the remaining n-d elements
		reverseString(temp, d, n - 1);

        // Reverse the entire array
		reverseString(temp, 0, n - 1);

        // Convert the array back to a string and return
        return new String(temp);
		
		
		
	}
	
	static void reverseString(char[] temp,int start,int end) {
		
		while(start<end) {
			char c= temp[start];
			temp[start] = temp[end];
			temp[end] = c;
			
			start++;
			end--;
			
			 
		}
		
	
	}
	
	public static void main(String[] args) {
		  String s = "Trupti";
	        int d = 4;
	        String rotatedString = rotateString(s, d);
	        System.out.println(rotatedString);
		
	}

}
