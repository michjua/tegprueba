import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Juego {
	Scanner sc = null;
    private ArrayList<Pais> paises=new ArrayList<Pais>();
	private ArrayList<Continente> continentes= new ArrayList<Continente>();

	String[] stringCortado;
	
	
public void Juego()
{
	ArrayList<Pais> paises= new ArrayList<Pais>();
	continentes = new ArrayList<Continente>();
	
}
	public void crearMundo() {

		try {
			sc = new Scanner(new File("mundo.txt"));// leo lo que esta en el
													// archivo mundo
			String linea;
			
			while (sc.hasNextLine()) {
				linea = sc.nextLine();// leo una lineasi

				stringCortado = linea.split(":");// obtengoi los datos en un
												// vector de
				// string. en cada posicion
				// me trae lo que esta entre dos puntos

				
				Pais var =new Pais(stringCortado[1], Integer.parseInt(stringCortado[2]),Integer.parseInt(stringCortado[3]));
				paises.add(new Pais(stringCortado[1], Integer.parseInt(stringCortado[2]),Integer.parseInt(stringCortado[3])));
				continentes.add(new Continente(stringCortado[0], var));
						
				String[] a = stringCortado[4].split(",");

			}
			//System.out.println(arrayContinents);
			agregarContinentes();
		

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
	
	public void agregarContinentes(){
		
		
		
		
		for(Object o : continentes)
		{
			
			System.out.println(o);
			
		}
		System.out.println(paises.size());
		System.out.println(paises.get(0));
		
	}

}