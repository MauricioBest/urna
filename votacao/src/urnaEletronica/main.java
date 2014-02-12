package urnaEletronica;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Urna urna = new Urna();
		int opcao = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (opcao > -1){
			System.out.println("votar Candidato Joao = 1");
			System.out.println("votar Candidato José = 2");
			System.out.println("votar em Branco = 0");
			System.out.println("Apurar votos = -1");
			
			opcao = sc.nextInt();
			if(opcao > -1){
				urna.votar(opcao);
			}
			
			
		}
		urna.apurar();
		
	}

}
