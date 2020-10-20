import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    /*二维数组 Java中多维数组不必都是规则矩阵形式*/
    private static void test3() {
        //动态初始化
        int[][] arr=new int[3][2];
        //静态初始化
        int[][] arr2=new int[][]{{1,2},{1,2,3}};
    }

    /*测试数组测试默认值*/
    private static void test2() {
        int[] a=new int[3];
        Integer[] b=new Integer[3];
        boolean[] c=new boolean[3];
        double[] d=new double[3];
        float[] e=new float[3];
        System.out.println(a[0]);
        System.out.println(b[0]);
        System.out.println(c[0]);
        System.out.println(d[0]);
        System.out.println(e[0]);
    }

    /*一维数组*/
    private static void test1() {
        //更倾向于第一种写法
        int[] a=new int[3];
        int b[]=new int[3];

        //动态初始化
        int[] arry=new int[3];
        arry[0]=1;
        arry[1]=2;
        arry[2]=3;

        //静态初始化
        int[] arry2=new int[]{1,2,3};
        int[] arry3={4,5,6};

        //for 循环遍历
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

        //增强for循环遍历
        for (int c:arry3){
            System.out.println(c);
        }

        //工具类遍历
        System.out.println(Arrays.toString(arry3));
    }
}
