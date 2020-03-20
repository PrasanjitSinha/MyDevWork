public class MissingNumberArray {

    static int maxSubArraySum(int[] arr, int n){
        int total = n*(n+1) / 2;
        for (int i=0;i<arr.length;i++){
            total = total - arr[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,5};
        int n = 5;
        int maxSum = maxSubArraySum(a,5);
        System.out.println("Missing number is  "
                + maxSum);
    }
}
