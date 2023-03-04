import java.util.Arrays;

class Prime {
    int limit;

    public String calcPrime(int n) {
        limit = n;
        String numbers = "";
        for (int i = 2; i <= limit; i++) {
            int marker = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(i%j == 0 && j != 1) {
                    marker++;
                    break;
                }
                            }
            if(marker == 0) numbers = numbers + i + " "; 
        }
        return numbers;
    }
    //  делаем два метода, чтобы был выбор в зависимости от типа данных, 
    //  который нужен пользователю - строка или массив чисел. В мэйне сделала оба варианта,  
    //  чтобы показать, что оба рабочие.

    public int[] arrayOfPrime(int n) {
        String str = calcPrime(n);
        int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        return numArr;
    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        Prime pr = new Prime();
        String primeNum = pr.calcPrime(1000);
        int[] primeNum2 = pr.arrayOfPrime(1000); 
        System.out.println(primeNum);
        for (int i : primeNum2) {
            System.out.print(i + " ");
        }
    }
}
