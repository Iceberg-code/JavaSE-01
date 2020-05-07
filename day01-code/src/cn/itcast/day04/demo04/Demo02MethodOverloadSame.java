package cn.itcast.day04.demo04;
/*
* 比较两个数据是否相等
* 数据类型：byte short int long
* 并在main方法中进行测试
* */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        
        System.out.println(isSame(a, b));

        System.out.println(isSame((short) 20, (short) 20));
        System.out.println(isSame(30, 30)); //默认就是int类型
//      System.out.println(isSame((long)11, (long)11)); //注意long数据类型写法，下一行
        System.out.println(isSame(11L, 11L));
    }
    public static boolean isSame(byte a, byte b){
        System.out.println("两个byte参数的方法执行");
        boolean same;
        if(a == b)
            same = true;
        else
            same = false;
        return same;
    }
    public static boolean isSame(short a, short b){
        System.out.println("两个short参数的方法执行");
        boolean same = a == b ? true : false;
        return same;
        //或者写为：return a == b ? true : false;
    }
    public static boolean isSame(int a, int b){
        System.out.println("两个int参数的方法执行");
        return a == b;
    }
    public static boolean isSame(long a, long b){
        System.out.println("两个long参数的方法执行");
        if(a == b)
            return true;
        else
            return false;
    }
}
