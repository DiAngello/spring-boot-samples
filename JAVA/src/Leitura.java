import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite seu primeiro nome, idade e altura: ");
        String nome = sc.next();
        int idade = sc.nextInt();
        float altura = sc.nextFloat();

        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);

        sc.close();
    }
}
