package urnaEletronica;

import java.util.Vector;

public class Urna {
	
	private int contVotosBrancos = 0;
	private int contVotosNulos = 0;
	private int[] contVotosCand = new int[2];
	
	
	public int getContVotosBrancos() {
		return contVotosBrancos;
	}
	public int getContVotosNulos() {
		return contVotosNulos;
	}
	public int[] getContVotosCand() {
		return contVotosCand;
	}
	public void votar(int numeCandidato){
		if (numeCandidato == 1){
			contVotosCand[0]++;
		}else if (numeCandidato == 2){
			contVotosCand[1]++;
		}else if(numeCandidato == 0){
			votarBranco();
		}else{
			votarNulo();
		}
	}
	public void votarBranco(){
		this.contVotosBrancos++;
	}
	public void votarNulo(){
		this.contVotosNulos++;
	}
	public void apurar(){
		System.out.println("Votos candidato 1:");
		System.out.println(this.contVotosCand[0]);
		System.out.println("Votos candidato 2:");
		System.out.println(this.contVotosCand[1]);
		System.out.println("Votos em Branco:");
		System.out.println(this.contVotosBrancos);
		System.out.println("Votos Nulos:");
		System.out.println(this.contVotosNulos);
	}

	
}
