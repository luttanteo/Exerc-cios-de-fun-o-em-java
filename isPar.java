/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class isPar {
    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número (ou qualquer letra para sair): ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (isPar(num)) {
                    System.out.println("Número par");
                } else {
                    System.out.println("Número ímpar");
                }
            } else {
                break;
            }
        }

        scanner.close();
    }
}