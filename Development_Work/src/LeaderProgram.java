public class LeaderProgram {

    static void printLeaders(int[] arr){
        /*for(int i = 0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[i] <= arr[j]){
                    break;
                }
                if(j==arr.length){
                    System.out.println(arr[i] + " ");
                }
            }
        }*/
        int n = arr.length;
        int max = arr[n-1];
        for (int i = n-2;i>=0;i--){
            if (max<arr[i]){
                max = arr[i];
                System.out.println(max);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        printLeaders(arr);
    }
}
