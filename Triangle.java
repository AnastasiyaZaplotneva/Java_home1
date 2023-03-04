import java.util.Scanner;

class TriangleNumber {
    int n;

    public TriangleNumber(int x) {
        n = x;
    }

    public int calculate() {
        return (n*(n+1))/2;
    }
}


public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int number = in.nextInt();
        TriangleNumber tr = new TriangleNumber(number);
        int result = tr.calculate();
        System.out.println(result);
    }
}
