public class SubArraySum {

    static int subArraySum(int[] arr, int sum){
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(currSum == sum){
                    int p = j-1;
                    System.out.println("sunbarray between "+i + " and " + p);
                    return 1;
                }
                if(currSum>sum || j==arr.length){
                    break;
                }
                currSum = currSum + arr[j];
            }
        }
        System.out.println("no subarray");
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        subArraySum(arr, sum);
    }
}
