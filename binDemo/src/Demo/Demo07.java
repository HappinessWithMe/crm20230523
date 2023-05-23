package Demo;

import org.omg.PortableInterceptor.INACTIVE;

public class Demo07 {
    public static void main(String[] args) {
//        int n = 0x4fdd0eaf;
//        int m = 0xff;
//        int k = n&m;
//        System.out.println(Integer.toBinaryString(n));
//        System.out.println(Integer.toBinaryString(m));
//        System.out.println(Integer.toBinaryString(k));

        //把int类型拆成4个字节
        int n = 0x77f2e0d7;
        int b1 = (n>>>24)&0xff;
        int b2 = (n>>>16)&0xff;
        int b3 = (n>>>8)&0xff;
        int b4 = (n>>>0)&0xff;//效果等同int b4 = n&0xff;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(b1));
        System.out.println(Integer.toBinaryString(b2));
        System.out.println(Integer.toBinaryString(b3));
        System.out.println(Integer.toBinaryString(b4));

        System.out.println("-------------");
        //把4个字节合成int类型
        int kk = (b1<<24)|(b2<<16)|(b3<<8)|(b4<<0);
        System.out.println(Integer.toBinaryString(kk));
    }
}
