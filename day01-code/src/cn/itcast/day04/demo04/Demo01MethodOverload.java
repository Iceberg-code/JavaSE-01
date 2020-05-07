package cn.itcast.day04.demo04;
/*
方法的重载（Overload）:多个方法的名称一样，但是参数列表不一样
好处：只需要记住唯一的一个方法名称，就可以实现类似的多个功能
方法重载与下列因素相关：
    1、参数个数不同
    2、参数类型不同
    3、参数的多类型顺序不同
方法重载与下列因素无关：
    1、与参数的名称无关
    2、与方法的返回值类型无关
*/
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(2, 9, 0, 5));
        System.out.println(sum(1.1, 2.2));
    }
    public static int sum(int a, int b){
        System.out.println("调用两个相加方法");
        return a + b;
    }
    public static int sum(int a, int b, int c){
        System.out.println("调用三个相加方法");
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d){
        System.out.println("调用四个相加方法");
        return a + b + c + d;
    }
    public static double sum(double a, double b){
        System.out.println("调用第五个方法");
        return a + b;
    }
    public static int sum(int a, double b){
        System.out.println("调用方法六");
        return (int) (a + b);
    }
    public static int sum(double a, int b){
        System.out.println("调用方法七");
        return (int) (a + b);
    }
/*  错误写法，与方法一冲突
    public static double sum(int a, int b){
        return  (a + b);
        //return (double) (a + b);  //也不对

    }
*/
}
