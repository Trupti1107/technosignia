package DSA;

public class ReverseString {
	
	public static void main(String[] args) {
		String s ="Trupti";
	
		StringBuilder sb = new StringBuilder(s);
		
		sb.reverse();
		
		System.out.println(sb.toString()); 
	}

}
