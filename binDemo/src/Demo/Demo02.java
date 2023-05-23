package Demo;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 二进制和十六进制
         * java7开始，提供了二进制直接量写法，前缀是 0b
         * 书写的时候可以利用下划线进行分割，提升可读性。
         * 二进制书写比较繁琐
         * 利用十六进制缩写二进制，就会简化许多
         *      缩写规则：从二进制数最低位开始，每4位缩写为1位十六进制
         * 十六进制的前缀是0x
         */
        int n = 0b110010;//表明写的是二进制，不写0b默认是十进制
        System.out.println(n);
    }
}
