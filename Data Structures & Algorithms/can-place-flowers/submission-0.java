class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size=  flowerbed.length;
        if(n==0){
            return true;
        }
        if(size == 1){
            if(flowerbed[0] == 0){
                n--;
            }
            return n==0?true:false;
        }
        int count = 0;
        for(int i = 0;i < size;i++){
            if(i == 0){
                if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] =1;
                    count++;
                }
            }else if(i == size-1){
                if(flowerbed[i] == 0 && flowerbed[i-1] ==0){
                    flowerbed[i] = 1;
                    count++;
                }
            }else{
                if(flowerbed[i] ==0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return n <= count ? true:false;

    }
}