package loops;

import java.util.Scanner;

public class DoWhile {
	

	public static void main(String[] args) throws InterruptedException {

		int varControle = 0;
		String teste = "s";
		
		String [] postagens = {"Postagem # 01" , "Postagem # 02" , "Postagem # 03"};
		
		
		do { 
			System.out.println(postagens[varControle]);
			System.out.println("#####\n");
			varControle++;
		} while (varControle < postagens.length); // executa operacao e depois testa a variavel de controle
	
	
		Scanner entradaDeDados = new Scanner(System.in);

		
		
		do {
		Thread.sleep(2000);	// tempo de espera
		System.out.println("Insira a nota do aluno");
		int nota = entradaDeDados.nextInt();
		
		switch (nota) {  // entre parentes lançar o argumento escolhido
		case 0: 
			System.out.println("Nota 0 - Repetiu de ano");
			break;
		case 1: 
			System.out.println("Nota 1 - Repetiu de ano");
			break;
		case 2: 
			System.out.println("Nota 2 - Repetiu de ano");
			break;
		case 3: 
			System.out.println("Nota 3 - Repetiu de ano");
			break;
		case 4: 
			System.out.println("Nota 4 - Recuparação");
			break;
		case 5: 
			System.out.println("Nota 5 - Recuparação");
			break;
		case 6: 
			System.out.println("Nota 6 - Recuparação");
			break;
		case 7: 
			System.out.println("Nota 7 - Passou de ano");
			break;
		case 8: 
			System.out.println("Nota 8 - Passou de ano");
			break;
		case 9: 
			System.out.println("Nota 9 - Passou de ano");
			break;
		case 10: 
			System.out.println("Nota 10 - Parabéns, ganhou uma bolsa de studos");
			break;
		default: // não precisa break
			System.out.println("Nota inválida");
		}
		
		System.out.println("Deseja continuar? (s/n)");
		teste = entradaDeDados.next();
		
		} while (teste =="s");
		
		System.out.println("Execução encerrada");
		entradaDeDados.close();
	
	
	}

}
