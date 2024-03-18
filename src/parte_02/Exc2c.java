package parte_02;

import java.util.Scanner;

public class Exc2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua nota: ");

        int num1 = scanner.nextInt();

        if(num1 >= 60){
            System.out.println("Passou de Ano");
        } else{
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
