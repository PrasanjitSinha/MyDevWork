public class CostPalindrome {

    static int cost(String str){
        int res = 0;
        int len = str.length();
        for (int i=0,j=len-1;i<j;i++,j--){
            res += Math.min(str.charAt(i), str.charAt(j))-'a' +1;
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(cost(str));
    }
}
