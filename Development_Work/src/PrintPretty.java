class PrintPretty {

    public static void main(String args[]) {
        System.out.println("Hello World");
        String input = "public class PrettyPrint { public static void main(String args[]) " + "{ System.out.println(\"Hello World\"); String input = \"This is a sample code\";" + " System.out.println(Indent(input)); }"+" public static String Indent(String input) { return \"Indented: \" + input; } }";
        System.out.println(Indent(input));

    }

    private static StringBuilder printDepth(int depth){
        StringBuilder sb  =new StringBuilder();
            for(int i=0;i<depth*4;i++){
                sb.append(" ");
            }
            return sb;
    }
    public static String Indent(String input) {
        String indentedOutput = "";
        StringBuilder s = new StringBuilder();
        char[] inputCharArr = input.toCharArray();
        char prevChar=inputCharArr[0];
        int depth =0;
        for(int i = 0; i < inputCharArr.length; i++) {
            if(inputCharArr[i]=='{' ) {
                s.append('{');
                s.append('\n');
                depth++;
                s.append(printDepth(depth));
                prevChar=inputCharArr[i];
            } else if(inputCharArr[i] == ';'){
                if(inputCharArr[i+2] == '}'){
                    depth--;

                }

                s.append(';');
                s.append('\n');

                s.append(printDepth(depth));
                prevChar=inputCharArr[i];
            } else if(inputCharArr[i] == '}'){
                depth--;
               // depth--;
                s.append(printDepth(depth));
                s.append('}');
              //  depth++;



                if(prevChar!=';') {
                    s.append('\n');

                }
                prevChar=inputCharArr[i];
            }
            else {
                s.append(inputCharArr[i]);
                prevChar=inputCharArr[i];
            }

        }

        return s.toString();
    }
}

/*
* The string at line 5 contains a valid java program
* You have to write a method to indent the program(string)
* You have to take care of following scenarios
*   1. When you encounter a '{', a new line should be inserted and 4 spaces should be put in the next line
*   2. For subsequent '{', we should increase the tab space by 4 spaces in the next line. We need to ensure that each code block is in right indentation level
*   3. For a ';' a new line should be inserted and next line should begin on right indentation level
*   4. For a '}' a new line should be inserted and 4 spaces should be removed from the next line

If the program is implemented correctly, the output of Indent method will look like following

public class PrettyPrint {
    public static void main(String args[]) {
        System.out.println("Hello World");
        String input = "This is a sample code";
        System.out.println(Indent(input));
    }
    public static String Indent(String input) {
        return "Indented: " + input;
    }
}

*
* NOTES:
* 1. You can assume that the string is a valid java program and there are no compilation error possible
* 2. You can do Google search for syntax/library calls
*/
