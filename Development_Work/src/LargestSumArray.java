public class LargestSumArray {

    static int maxSubArraySum(int [] arr){
        int currSum = arr[0], max =arr[0];
        for(int i=0;i<arr.length;i++){
            currSum = Math.max(arr[i] , currSum+arr[i]);
            max = Math.max(max, currSum);
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = maxSubArraySum(a);
        System.out.println("Maximum contiguous sum is "
                + maxSum);
    }
}
