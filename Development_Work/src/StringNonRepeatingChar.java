public class StringNonRepeatingChar {

    static char[] count=new char[256];

    static int firstNonRepeated(String str){
        int index =-1;
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)] == 1){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        String str="prasanjit";
        int index = firstNonRepeated(str);
        System.out.println("first non repeat char is " + str.charAt(index));
    }
}
