package cn.itcast.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        int c;
        c = sum(5, 6);
        System.out.println(c);
        System.out.println(sum(2, 3));
    }
    public static int sum(int a, int b){
        int result = a + b;
        System.out.println("方法执行了");
        return result;
    }
}
