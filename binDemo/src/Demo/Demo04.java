package Demo;

public class Demo04 {
    public static void main(String[] args) {
        /**
         * 演示补码的最大值和最小值
         * -1的编码是什么样子的？使用程序测试一下
         */
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(min));

        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        System.out.println(Long.toBinaryString(lmax));
        System.out.println(Long.toBinaryString(lmin));

        int n = 88;
        n = n+(max+1)*2;//(max+1)*2是int的一圈多少个数
        System.out.println(n);//88

    }
}
