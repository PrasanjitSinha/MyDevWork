import java.util.Arrays;

public class CheckPermutationString {

    static boolean isPermutation(String st1, String st2){
        int n1 = st1.length();
        int n2 = st2.length();

        if(n1!=n2){
            return false;
        }
        char ch[] = st1.toCharArray();
        char ch1[] = st2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<n1;i++){
            if(ch[i]!=ch1[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String st1 = "pras";
        String st2 = "spra";

        if(isPermutation(st1,st2)){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}
