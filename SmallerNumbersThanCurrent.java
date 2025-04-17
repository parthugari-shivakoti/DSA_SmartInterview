class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        int i=0;
        int[] res = new int[nums.length];
        int[] x = nums;
        while(i<nums.length){
            arr[nums[i]]+=1;
            i+=1;
        }
        i=0;
        while(i<nums.length){
            res[i] = summat(arr,nums[i]);
            i++;
        }
        
        return res;
    }
    private int summat(int[] arr, int end){
        int sum = 0;
        for(int i=0;i<end;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    
}
