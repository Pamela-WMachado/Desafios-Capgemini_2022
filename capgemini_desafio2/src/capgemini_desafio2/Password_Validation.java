package capgemini_desafio2;

import java.util.Scanner;

public class Password_Validation {

	public static void main(String[] args) {
		/* // VALIDAÇÃO DE SENHA
		//a senha é cosiderada forte se ela obedecer os seguintes critérios:
		//minimo: 6 caracteres
		//minimo de 1 digito
		//1 letra maiusc
		//1 letra minusc
		//1 caractere especial !@#$%*()-+ */
		
		final int n_upperLetters = 1, n_lowerLetters = 1, n_digits = 1, pwLen = 6;
				
		int upperCount = 0, lowerCount = 0, digitCount = 0;
		
		String name, password;
		
		boolean Special = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Para efetuar o cadastro, informe seu nome completo: ");
		name = sc.nextLine();
		System.out.println("Digite uma senha forte: ");
		password = sc.nextLine();
		
		int passwordLen = password.length();
		
		//verificando se a senha possui algum caractere especial
		if (password.contains("!")) 
			Special = true;
		else if (password.contains("@"))
			Special = true;
		else if (password.contains("#"))
			Special = true;
		else if (password.contains("$"))
			Special = true;
		else if (password.contains("%"))
			Special = true;
		else if (password.contains("*"))
			Special = true;
		else if (password.contains("("))
			Special = true;
		else if (password.contains(")"))
			Special = true;
		else if (password.contains("-"))
			Special = true;
		else if (password.contains("+"))
			Special = true;
		else if (password.contains("/"))
			Special = true;

		
		for (int i = 0; i < passwordLen; i++) {
			char ch = password.charAt(i);
			
			if (Character.isUpperCase(ch))
				upperCount++;
			else if (Character.isLowerCase(ch))
				lowerCount++;
			else if (Character.isDigit(ch))
				digitCount++;
		}
		
		if (Special == true && upperCount >= n_upperLetters && lowerCount >= n_lowerLetters && digitCount >= n_digits && passwordLen >= pwLen)
			System.out.println("Senha válida. Cadastro efetuado com sucesso.");
		
		//verificando se os outros requisitos da senha são atingidos
		else {

			System.out.println("A senha não obedece os critérios básicos. Faltam:");
			if (Special == false)
				System.out.println(" - Caracteres especiais. Insira pelo menos um dos seguintes símbolos: !@#$%*()-+ */. ");
			if (upperCount < n_upperLetters) 
				System.out.println(" - Letras maiúsculas.");
			if (lowerCount < n_upperLetters)
				System.out.println(" - Letras minúsculas.");
			if (digitCount < n_digits)
				System.out.println(" - Números.");
			if (passwordLen < pwLen) {
				int missingChars = pwLen - password.length();
				System.out.println(" - Caracteres suficientes. Faltam " + missingChars + " caracteres para a senha ser considerada segura.");
				
			}
		}
		
		sc.close();
		
	}

}
