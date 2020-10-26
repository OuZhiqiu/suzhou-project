package com.neuedu.common;

public class Assignment1 {
    /**
     * @param args
     * 计算一个二维数组值的总和
     */
    public static void main(String[] args) {
        //定义一个二维数组arr并进行静态初始化
        int[][] arr=new int[][]{{3,8,2},{2,7},{9,0,1,6}};
        //定义一个int类型的值，用于存放二维数组的总和
        int sum=0;
        //循环遍历二维数组的行
        for (int i = 0; i < arr.length; i++) {
            //循环遍历二维数组的列
            for (int j = 0; j < arr[i].length; j++) {
                //进行二维数组值的累加
                sum+=arr[i][j];
            }
        }
        //输出二维数组值的总和
        System.out.println("二维数组的和为"+sum);
    }
}
