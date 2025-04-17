class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for (int n : nums) {
            arr.add(n);
        }
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (!arr.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
