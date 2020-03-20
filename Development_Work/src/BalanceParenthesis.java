import java.util.Stack;

public class BalanceParenthesis {

    static boolean isMatch(char c1, char c2){
        if(c1=='(' && c2==')'){
            return true;
        } else if (c1 == '{' && c2=='}'){
            return true;
        } else if (c1=='[' && c2==']'){
            return true;
        } else{
            return false;
        }
    }
    static boolean isBalanced(String str){
        char[] ch = str.toCharArray();
        Stack<Character> st = new Stack();
        for (int i=0;i<ch.length;i++){
            if(ch[i] == '(' || ch[i] =='{' || ch[i]=='['){
                st.push(ch[i]);
            }
            if(ch[i]==')' || ch[i] ==']' || ch[i]==']'){
                if(st.isEmpty()){
                    return false;
                }
            } else if (!isMatch(st.pop(),ch[i])){
                return false;
            }
        }
        if (st.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "()";

        System.out.println(isBalanced(str));
    }
}
