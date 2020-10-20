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

    public static void test2() {
        float a = 14.8f;
        int b = (int) a;
        System.out.println(b);
    }

}