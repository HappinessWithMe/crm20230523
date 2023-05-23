package Demo;

public class Demo06 {
    public static void main(String[] args) {
        /**
         * 验证补码的互补对称性
         * -n=~n+1      ~n表示n取反，0变1，1变0
         * 除最小值外都成立
         */
        int n = -1;
        n = ~n+1;
        System.out.println(n);//1

        System.out.println(Integer.toBinaryString(n));//1
        System.out.println(Integer.toBinaryString(~n));
        System.out.println(Integer.toBinaryString(~n+1));
    }
}
