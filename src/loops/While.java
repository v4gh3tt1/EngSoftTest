package loops;

public class While {
	

	public static void main(String[] args) {

		/*
		int controle=0;
		
		while (controle < 10) { // primeiro testa, depois executa enquanto a condição é verdadeira
			System.out.println("Valor da variavel de controle : " + controle);
			controle++; // incremento da variavel de controle
		}
		*/
		
		int varControle = 0;
		
		String [] postagens = {"Postagem # 01" , "Postagem # 02" , "Postagem # 03"};
		
		//System.out.println(postagens.length); -> nomeArray.lenght: tamanho do array

		while (varControle < postagens.length) {
			System.out.println(postagens[varControle]);
			System.out.println("#####\n");
			varControle++;
		}
	}

}
