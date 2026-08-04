class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=  0;
        int length= s.length();
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                count++;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=1; i < count;i++){
            str.append("1");
        }
        while(str.length() < length-1){
            str.append("0");
        }
        str.append("1");
        return str.toString();

    }
}