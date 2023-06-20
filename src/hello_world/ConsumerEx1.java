package hello_world;

public class ConsumerEx1 {

    public static void main(String[] args)  {

        // Create a Consumer object directly
        Consumer<String> greeter = name -> System.out.println("Hello " + name);

        greeter.accept("Tran");   // Hello Tran
    }
}