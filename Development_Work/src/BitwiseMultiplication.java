public class BitwiseMultiplication {

    static int operation(int a, int b){
        int res = 0;
        while (b>0){
            if ((b&1)>0){
                res += a;
            }
            a = a<<1;
            b = b>>1;
        }
        return res;
    }
    public static void main(String[] args) {
        int a = 10;
        int b=20;
        System.out.println(operation(a,b));
    }
}
