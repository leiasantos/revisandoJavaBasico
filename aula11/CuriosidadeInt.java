package cursojava.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		/*
		 * 
		Pergunta pegadinha
		
		O que vai acontecer se somar essas duas variaveis por exemplo
		sendo que a primeira variavel já esta no valor maximo do inteiro ?
		Qual vai ser a saída desse programa ?
		
		Resposta: Não vai dar erro, é como fosse uma roleta, depois do 7 depois de 
		exceder o limite ele vai para o menor núemro.
		
		Os numeros em java funcionam como uma roleta, do momento que você pega o limite 
		e soma, ele vai voltar para os números negativos
		
		*/
		
		int var1 =  2147483647; // valor maximo de um inteiro
		int var2 = 100;
	
		System.out.println(var1 + var2);

	}

}
