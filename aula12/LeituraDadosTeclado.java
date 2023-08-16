package cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Digite o seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é : " + nomeCompleto);
		
		System.out.println();
		
		
		System.out.println("Digite o seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é : " + primeiroNome);
		
		
		System.out.println();
		
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade + " anos");
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		
		
		System.out.println("Digite o seu primeiro nome, idade, email, telefone");
		String nomePrimeiro = scan.next();
		int suaIdade = scan.nextInt();
		String email = scan.next();
		int telefone = scan.nextInt();
		
		System.out.println("Você digitou: ");
		System.out.println("Primeiro nome : " + nomePrimeiro);
		System.out.println("Sua idade : " + suaIdade);
		System.out.println("Seu email: " + email);
		System.out.println("Seu telefone: " + telefone);
		
		scan.close();
	}

}
