package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WordBrreak {
	   public static boolean wordBreak(String s, List<String> dict) {
	        
	        boolean[] f = new boolean[s.length() + 1];
	        
	        f[0] = true;
	        
	        
	        /* First DP
	        for(int i = 1; i <= s.length(); i++){
	            for(String str: dict){
	                if(str.length() <= i){
	                    if(f[i - str.length()]){
	                        if(s.substring(i-str.length(), i).equals(str)){
	                            f[i] = true;
	                            break;
	                        }
	                    }
	                }
	            }
	        }*/
	        
	        //Second DP
	        for(int i=1; i <= s.length(); i++){
	            for(int j=0; j < i; j++){
	                if(f[j] && dict.contains(s.substring(j, i))){
	                    f[i] = true;
	                    break;
	                }
	            }
	        }
	        
	        return f[s.length()];
	    }
	   
	   public static void main(String[] args) {
		   
		   String s ="catsandog";
		   //List<String> wordDict = List.of("leet", "code");
		   
		   List<String> wordDict = List.of("cats","dog","sand","and","cat");
		   
		   boolean isTrue = wordBreak(s,wordDict);
		   System.out.println(isTrue);
		
	}
	}
	 


