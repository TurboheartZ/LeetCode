
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("ccc"));
	}
    //The center-aligned substring of the a palindromic string is also a palindromic one
    public static String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        else{
            String max = "";
            for(int i = 0; i<s.length(); i++){
            	if(max.length()>(s.length()-i-1)*2) break; //Saves time
                if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
                    int flag = 0;
                    int j;
                    for(j = 1;i-j>=0&&i+1+j<s.length(); j++){
                        if(s.charAt(i-j)==s.charAt(i+1+j)){
                            flag = 1;
                        }
                        else{
                            break;
                        }
                    }
                    int len = flag==0?2:j*2;
                    if(len>max.length()){
                        max = s.substring(i-j+1,i+j+1);
                    }
                }
                if(i+2<s.length()&&s.charAt(i)==s.charAt(i+2)){
                    int flag = 0;
                    int j;
                    for(j = 1;i-j>=0&&i+2+j<s.length(); j++){
                        if(s.charAt(i-j)==s.charAt(i+2+j)){
                            flag = 1;
                        }
                        else{
                            break;
                        }
                    }
                    int len = flag==0?3:j*2+1;
                    if(len>max.length()){
                        max = s.substring(i-j+1,i+j+2);
                    }
                }                
            }
            return max;
        }
    }
}
