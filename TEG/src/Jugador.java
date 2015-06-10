import java.util.ArrayList;

public class Jugador{
	
	private String nombre;
	private ArrayList<Pais>paises = new ArrayList<Pais>();
	private ArrayList<Ejercito> ejercitos = new ArrayList<Ejercito>();
	
	public Jugador(String nombre) {
		this.nombre=nombre;
	}
	
	public Jugador() {
		
	}
	
	public Jugador(String nombre, ArrayList<Pais>paises){
		this.paises=paises;
		this.nombre=nombre;
		this.ejercitos=ejercitos;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + "]";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Pais> getPaises() {
		return paises;
	}

	public void setPaises(ArrayList<Pais> paises) {
		this.paises = paises;
	}

	public ArrayList<Ejercito> getEjercitos() {
		return ejercitos;
	}

	public void setEjercitos(ArrayList<Ejercito> ejercitos) {
		this.ejercitos = ejercitos;
	}

	public void agregarEjercito() { //pone un ejercito en un pais (apropia pais)
		
	}
	
	public void atacar() {
		System.out.println("atacar");
		
	}
	public void defender() {
		System.out.println("defender");
	}
	
}
