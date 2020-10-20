public class HelloWorld {

    private boolean flag2;

    public static final String LOG_PUSH = "";

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.aD();
        testIntLong();
        testFloatInt();
        test2();
    }

    private void aD() {
        boolean flag = true;
        System.out.println(flag);
        //boolean默认为false
        System.out.println(flag2);
    }

    public static void testIntLong() {
        int a = 14;
        long b = a;
        System.out.println(b);
    }

    //精度丢失
    public static void testFloatInt() {
        float a = 14.8f;
        int b = (int) a;
        System.out.println(b);
    }

    //溢出
    public static void test2() {
        int a = 128;
        byte b = (byte) a;
        System.out.println(b);
    }

    /*字符出不能直接转换为基本类型，但通过基本类型对应的包装类则可以实现吧字符串转换成基本类型*/
    //int 转String
    public static void test3() {
        int a = 12;
        String b = ""+a;
        String c = String.valueOf(a);
        String d = Integer.toString(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    //String 转int
    public static void test4() {
        String a = "12";
        int b = Integer.parseInt(a);
        int c = Integer.valueOf(a).intValue();
        System.out.println(b);
        System.out.println(c);
    }

}