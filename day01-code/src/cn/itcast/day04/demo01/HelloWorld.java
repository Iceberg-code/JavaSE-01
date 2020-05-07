package cn.itcast.day04.demo01;
/*方法定义注意事项：
* 1、方法定义的先后顺序无所谓
* 2、方法定义必须是挨着的，不能在一个方法内部定义另一个方法
* 3、方法定义之后，自己不会执行的；如果希望执行，一定要进行方法的调用
* */
public class HelloWorld
{
    public static void main(String[] args)
    {
       printMethod();
    }
    public static void printMethod()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print("*好的");
            }
            System.out.println();
        }
    }
}
