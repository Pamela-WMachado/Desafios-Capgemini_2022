package capgemini_questao1;

public class desafio_1 {

	public static void main(String[] args) {
		
		int n = 6;
		int nSpaces; 
		
		for (int nSteps = 1; nSteps <= n; nSteps ++ ) {
			//implementando a l�gica por tr�s da rela��o entre os espa�os em branco e os *
			nSpaces = n - nSteps;
			//imprimindo os espa�os vazios
			for (int i = 0; i < nSpaces; i++) {
				System.out.print(" ");		
			}
			//imrpimindo os degraus
			for (int i = 0; i < nSteps; i++) {
				System.out.print("*");
			}
			//chamada vazia para imprimir uma nova linha e permitir que os * tomem o formato de uma escada
			System.out.println();
		}
	}

}
//para implementar a escada, primeiro � necess�rio criar uma var para receber os degraus, que se chamar� nSteps
//a nSteps passar� por um loop for, para que complete o n� de * em cada degrau
//