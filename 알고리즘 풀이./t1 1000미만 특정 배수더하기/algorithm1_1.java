import java.util.stream.IntStream;

public class algorithm1_1{
    public static void main(String[] args) {
        System.out.println(String.format("정답: %d", foo(1000)));
    }

    public static int foo(int x) {
        return IntStream.range(1, x).filter(j -> j % 3 == 0 || j % 5 == 0).sum();
    }
}