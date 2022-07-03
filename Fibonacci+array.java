import java.util.Scanner;
public class fibonacciEmVetor {

    
    public static void main(String args[]) {
        int input;
        int i;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        int fibo[] = new int[input];
        for(i=0;i<input;i++){
            if(i==0)
                fibo[i] = 0;
            else if(i==1)
                fibo[i] = fibo[i-1] + 1;
            else
                fibo[i] = fibo[i-1] + fibo[i-2];
            if(i==input){
                System.out.println("Fib("+i+") = " + fibo[i]);
                break;
            }
            
        }
    }
}
