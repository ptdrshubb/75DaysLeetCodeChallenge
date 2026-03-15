class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i : nums){
            set.add(i);
        }
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}