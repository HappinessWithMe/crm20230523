package Demo;

public class Demo05 {
    public static void main(String[] args) {
        /**
         * 认读负数的编码
         */
        int n = -3;
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-3));
        System.out.println(Integer.toBinaryString(-7));
        for (int i = -200; i <= 0; i++) {
            System.out.println("二进制："+Integer.toBinaryString(i)+"\t十进制："+i);
        }
    }
}
