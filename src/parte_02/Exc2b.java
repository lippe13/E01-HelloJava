package parte_02;


import java.util.Scanner;

public class Exc2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");

        int num1 = scanner.nextInt();

        if(num1 % 7 == 0){
            System.out.println("Eh multiplo de 7");
        } else{
            System.out.println("Nao eh multiplo de 7");
        }

        scanner.close();
    }
}