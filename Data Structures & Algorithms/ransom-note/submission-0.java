class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int[] mag = new int[26];
        int[] ram = new int[26];
        for(char a : ransomNote.toCharArray()){
            ram[a -'a']++;
        }
        for(char a : magazine.toCharArray()){
            mag[a -'a']++;
        }
        for(int i =0;i < 26;i++){
            if(mag[i] >= ram[i] ){
                continue;
            }else{
                return false;
            }
        }
        return true;

    }
}