public interface TestingDemo {

    public static void testing(){
        System.out.println("Im in testing method of TestingDemo");
    }

    public default  void testing1(){
        System.out.println("Im in testing1 method of TestingDemo");
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        TestingDemo.testing();
    }
}
