import java.util.stream.IntStream;

public class Program{
    public static void main(String[] args){
        IntStream stream = IntStream.builder().add(1).add(2).add(3).add(4).add(5).add(6).add(7).add(8).add(9).build();
        int sum = stream.sum();
        System.out.println(sum);
        for (int i = 0; i < 100; i++) {
            // System.out.println("Hello, World!");    
        }
        return;
    }
}