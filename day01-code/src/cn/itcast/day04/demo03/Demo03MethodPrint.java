package cn.itcast.day04.demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(11);
    }

    public static void printCount(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Hello" + "\t" + (i + 1));
        }
    }
}
