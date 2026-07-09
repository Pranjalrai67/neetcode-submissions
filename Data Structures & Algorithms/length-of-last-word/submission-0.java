class Solution {
    public int lengthOfLastWord(String s) {
        String main = s.trim();
        int len = 0;
        int i = 0;
        int j = 0;
        int n = main.length()-1;
        while( n >= 0 ){
            char curr = main.charAt(n);
            if(curr == ' '){
                return len;
            }
            len++;
            n--;
        }
        return len;


    }
}