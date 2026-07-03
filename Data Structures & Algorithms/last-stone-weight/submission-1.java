class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> mh = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i < stones.length;i++){
            mh.add(stones[i]);
        }
        while(mh.size() > 1){
            int x = mh.poll();
            int y = mh.poll();
            if(x == y){
                continue;
            }
            mh.add(Math.abs(y-x));
        }
        if(mh.size() < 1){
            return 0;
        }
        return mh.poll();
    }
}
