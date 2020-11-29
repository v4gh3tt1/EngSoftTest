package loops;

public class For {

	public static void main(String[] args) {
		
		// atribuição de dados a uma array bidimensional usando for

		
		String nomeArray[][] = new String[5][2];
		for (int n=0; n<nomeArray.length; n++) {
		
			for (int j=0; j<nomeArray[0].length; j++) {
				nomeArray[n][j] = n + ", " + j;

			}
		}
		// impressão de elementos do array usando for
		
		for (int n=0; n<nomeArray.length; n++) {
		
			for (int j=0; j<nomeArray[0].length; j++) {
				nomeArray[n][j] = n + ", " + j;

				System.out.println(nomeArray[n][j]);
			}
		}
	

	}

}
