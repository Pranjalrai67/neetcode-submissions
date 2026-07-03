class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
            Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,(a,b)->{
            int freqa = hm.get(a);
            int freqb= hm.get(b);
            if(freqa != freqb){
                return Integer.compare(freqa,freqb);
            }
            return Integer.compare(b,a);
        });
        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }
}