package DSA;

public class PrintIndex {
	 public static void printIndex(String str, String s) {
	        int i = 0; // Initialize a pointer for the substring 's'
	        boolean flag = false; // Initialize a flag to check if any occurrence is found

	        for (int j = 0; j < str.length(); j++) {
	            if (str.charAt(j) == s.charAt(i)) {
	                i++; // If characters match, increment the pointer 'i'
	            } else {
	                j -= i; // If characters don't match, reset 'j' to its previous value
	                i = 0; // Reset the pointer 'i'
	            }
	            
	            if (i == s.length()) { // If the entire substring is found
	                flag = true; // Set the flag to indicate an occurrence
	                System.out.print(j - i + 1 + " "); // Print the starting index of the occurrence
	            }
	        }

	        if (!flag) {
	            System.out.print("NONE"); // If no occurrence is found, print "NONE"
	        }
	    }

	    public static void main(String[] args) {
	        String str1 = "GFG";
	        String str2 = "g";
	        printIndex(str1, str2);
	    }
}
