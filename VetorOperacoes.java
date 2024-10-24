/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class VetorOperacoes {

    public static int maiorValor(int[] vetor) {
        int maior = vetor[0];
        for (int num : vetor) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static int menorValor(int[] vetor) {
        int menor = vetor[0];
        for (int num : vetor) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public static double mediaMaiorMenor(int[] vetor) {
        int maior = maiorValor(vetor); 
        int menor = menorValor(vetor); 
        return (maior + menor) / 2.0; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números você deseja inserir? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maior = maiorValor(numeros);
        int menor = menorValor(numeros);
        double media = mediaMaiorMenor(numeros);

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média entre maior e menor: " + media);

        scanner.close();
    }
}
