package cn.itcast.day04.demo02;
/*注意事项：
* 1、对于有返回值的方法，可以使用单独调用、打印调用、赋值调用
* 2、对于无返回值的方法，只能使用单独调用，不能使用打印调用和赋值调用
* */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int c = sum1(1, 2);
        sum2(2, 3);
        System.out.println(c);
    }
    public static int sum1(int a, int b){
        int result = a + b;
        return result;
    }
    public static void sum2(int a, int b){
        int result = a + b;
        System.out.println("结果是：" + result);

    }
}
