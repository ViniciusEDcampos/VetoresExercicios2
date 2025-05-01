import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            // TODO code application logic here

            int numeros[] = new int[15];
            Scanner scanner = new Scanner(System.in);
            int maiorNumero = 0;

            for(int i=0;i<15;i++){
                System.out.println("Digite um numero: ");
                numeros[i] = scanner.nextInt();


                if (numeros[i] >  maiorNumero){
                    maiorNumero = numeros[i];
                }

            }
            System.out.println("O maior numero digitado é: " + maiorNumero);
        }
    }
