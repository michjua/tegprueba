import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 
 Se crea la clase Juego. Dentro de esta clase se instanscia 
 el mundo, 
 se crean los contientes, 
 paises 
 jugadores.
 Se reparten las cartas iniciales
 
 
 */
public class Juego {
	Scanner sc = null;

	private static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private ArrayList<Continente> continentes = new ArrayList<Continente>();
	private ArrayList<String> contUnico = new ArrayList<String>();
	private HashMap<String, ArrayList<Pais>> continentespaises = new HashMap<String, ArrayList<Pais>>();
	String[] c;

	Mundo w1 = new Mundo();
	

	public void crearMundo() {
		/*
		 * validar paises con coordenadas iguales validar lineas en blanco en el
		 * archivo validar nombrecontinente = nombrepais validar formato
		 * string:string:int:int:string,...
		 */
		
		enumerarContinentes();
		crearContinentes();
		crearPaises();
		imprimirContinentes();
		crearJugador();
		
	}

	public void enumerarContinentes() {
		try {
			sc = new Scanner(new File("Mundo.txt"));
			String linea;

			while (sc.hasNextLine()) {
				linea = sc.nextLine();

				c = linea.split(":");

				if (!contUnico.contains(c[0])) { // carga 1 unico string por
					// cada continente.
					contUnico.add(c[0]);
				}

			}
			System.out.println(contUnico);

		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (sc != null) {
				try {
					sc.close();
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		}

	}

	public void crearContinentes() {
		for (int i = 0; i < contUnico.size(); i++) {
			Continente c1 = new Continente(contUnico.get(i));
			continentes.add(c1);
			
			
		}

	}

	public void crearPaises() {

		int i;
		for (i = 0; i < contUnico.size(); i++) {
			ArrayList<Pais> paises = new ArrayList<Pais>();
			try {
				sc = new Scanner(new File("Mundo.txt"));
				String linea;
				while (sc.hasNextLine()) {
					linea = sc.nextLine();

					c = linea.split(":");
					if (contUnico.get(i).contains(c[0])) {
						
						Pais p1 = new Pais(c[1], Integer.parseInt(c[2]),
								Integer.parseInt(c[3]));
						paises.add(p1);	
					}

				}
	
				continentes.get(i).setPaises(paises);
				//System.out.println("c1"+ c1.getPaises());
				

			} catch (Exception e) {
				System.err.println(e);
			} finally {
				if (sc != null) {
					try {
						sc.close();
					} catch (Exception e) {
						System.err.println(e);
					}
				}
			}

		}

	}

	public void crearJugador() {

		/*System.out.println("Ingrese Jugador: (neee) ");
		sc = new Scanner(System.in);
		String p = sc.next();
		while (!p.contains("fin")) {
			System.out.println(p);
			Jugador j1 = new Jugador();
			j1.setNombre(p);
			jugadores.add(j1);
			System.out.println("Ingrese proximo jugador: ");
			p = sc.next();
		}
		*/
		
		 for (int i = 0; i < 3; i++) { Jugador j1 = new Jugador();
		  j1.setNombre("j" + i); jugadores.add(j1); }
		 
		repartirPaises();
		Turno t= new Turno();
		t.hacer(jugadores);
	}



	int sumarPaises() {
		int suma = 0;
		for (int j = 0; j < continentes.size(); j++) {
			suma = suma + continentes.get(j).getPaises().size();
		}
		return suma;
	}

	public void repartirPaises() {

		int cantPaisesJugador = sumarPaises() / jugadores.size();
		System.out.println("cant de cartar repartidas: " + cantPaisesJugador);
		if (sumarPaises() % jugadores.size() != 0) {
			int resto = sumarPaises() % jugadores.size();
			System.out.println(resto);
		}
		//SarrayPaises();
		// shuffleArray();
	}

	// Collections.sort(paises,new Comparator<Pais>()) {
	// public int compare (Pais a, Pais b) {
	// int va= a.getX() * 100 + a.getY(),
	// vb=b.getX()*100+b.getY();
	// return va-vb
	// }
	// }
/* ********************************IMPRESION POR PANTALLA*********************************************/
	public void imprimirContinentes() {
		for (Object o : continentes) {
			System.out.println(o);
		}

	}

}
