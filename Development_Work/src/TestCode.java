import java.io.*;


public class TestCode {
    public static void main(String[] args) throws IOException {
       String str = "Prasanjit love rakhee, love become hate";
       int count=0,lastIndex=0;
       String find = "love";
       while(lastIndex!= -1){
           lastIndex = str.indexOf(find,lastIndex);
           if(lastIndex!=-1){
               count++;
               lastIndex+=find.length();
           }
       }
        System.out.println(count);
    }
}
