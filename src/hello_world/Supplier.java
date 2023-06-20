package hello_world;

public class Supplier {
    //làm gì ko cần tham số và cần giá trị trả về thì dùng supplier
    //vid dụ lấy ngày tháng hiện tại
    //dùng tương tự getter
    public static void main(String[] args) {
        java.util.function.Supplier<Double> random = ()->{return Math.random()*10;};
        System.out.println(random.get());
    }
}
