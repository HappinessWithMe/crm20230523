package Demo;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 二进制
         * 1、Java程序先编译为.class字节码文件
         *   程序中的十进制数被编译为二进制
         * 2、在运行期间，n一直是二进制110010
         *   如果 n = n+1 = 110010+1=110011
         * 3、输出时候，将二进制数转换为十进制字符串输出
         * 4、Integer.toBinaryString()将内存中二进制真实输出
         */
        int n = 50;//110010
        n = n+1;//110011
        System.out.println(n);//110011转换51
        System.out.println(Integer.toBinaryString(n));//110011

        for (int i = 0; i < 200; i++) {
            System.out.println("二进制："+Integer.toBinaryString(i)+"\t十进制："+i);
        }
    }
}
