package cliente;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String user ="";
		String senha ="";
		boolean logado = false;
		do
		{
			System.out.println("Insira o usuario");
			 user = scan.nextLine();
			
			System.out.println("Insira a senha");
			 senha = scan.nextLine();
			
			logado = LoginCliente.login(user,senha);
			if(!logado)
			{
			System.out.println("Usuario ou senha invalido");
			}
			
		}while (!logado);
		
		System.out.println("Login efetuado com sucesso");
		
		//apos logado prosseguir para o jogo

	}

}
