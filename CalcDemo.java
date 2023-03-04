import java.util.Scanner;

class Calculator {
    int a;
    int b;

    
    public void help () {
        System.out.println("Введите выражение вида (с пробелами):");
        System.out.println("a + b - для сложения чисел a и b");
        System.out.println("a - b- - для вычитания числа b из a");
        System.out.println("a * b - для перемножения чисел a и b");                    
        System.out.println("a / b - для деления число a на b");                   
        System.out.println("a ** b - для возведения числа a в степень b");
    }
    public void calculate(String str) {
        String[] elements = str.split(" ");
        // for (String string : elements) {
        //     System.out.println(string);
        // }
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[2]);
        
        switch(elements[1]) {
            case "+":
                addition(a, b);
                break;
            case "-":
                subtraction(a, b);
                break;
            case "*":
                multiplication(a, b);
                break;
            case "/":
                division(a, b);
                break;
            case "**":
                exponent(a, b);
                break;
            default:
                System.out.println("Некорректный ввод");
        }
    }

    // можно сделать методы с возвращаемым значением,
    // тогда результат вычислений будет сохраняться.
    private void addition (int x, int y) {
        System.out.println(x+y);
    }

    private void subtraction (int x, int y) {
        System.out.println(x-y);
    }

    private void multiplication (int x, int y) {
        System.out.println(x*y);
    }

    private void division (int x, int y) {
        double x2 = (double) x;
        double result = x2/y;
        System.out.println(result);
    }

    private void exponent (int x, int y) {
        System.out.println(Math.pow(x, y));
    }
}


public class CalcDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner in = new Scanner(System.in);
        calc.help();
        String exam = in.nextLine();
        
        calc.calculate(exam);
        in.close();       
    }
    
}