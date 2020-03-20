import java.util.StringTokenizer;

public class LongestWordInSentence {

    static String printLongestWord(String str){
        int max = 0;
        String s = new String();
        StringTokenizer st = new StringTokenizer(str, " ");
        while(st.hasMoreTokens()){
            String s1 = st.nextToken();
            int n = s1.length();
            if(n>max){
                max = n;
                s = s1;
            }
        }
        return s;
    }
    public static void main(String[] args) {
     String str = "My Name is Prasanjit";
        System.out.println(printLongestWord(str));
    }
}
