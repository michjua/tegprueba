import java.util.ArrayList;


public class Turno {
	
	int i;

	
	
	public void hacer(ArrayList<Jugador> j){
		
		
		imprimirJugador(j);
	}
	
	public void imprimirJugador(ArrayList<Jugador> j){
		
		for(int i=0;i<j.size();i++){
			System.out.println("los jugadores son: "+j.get(i));
		}
	}
}
