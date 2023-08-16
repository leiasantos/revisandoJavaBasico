package cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int soma, subtracao, multiplicacao, divisao, resto;
		
		soma = 1 + 2;
		subtracao = 5 - 2;
		multiplicacao = 5 * 2;
		divisao = 10 / 3;
		resto = 10 % 3;
		
		String primeiroNome ="Esta é ";
		String segundoNome= "uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		
		soma++;
		soma--;
		
		
		
		System.out.println("O resultado da soma é: " + soma);
		
		System.out.println("O resultado da subtração é: " + subtracao);
		
		System.out.println("O resultado da multiplicação é : " + multiplicacao);
		
		System.out.println("O resultado da divisão é: " + divisao);
		
		System.out.println("O resultado do resto da divisão é " + resto);
		
		System.out.println(terceiroNome);

	}

}
