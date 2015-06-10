import java.util.ArrayList;


public class Continente  {
	private String nombre;
	private ArrayList<Pais> paises = new ArrayList<Pais>();
	private int x;
	private int y;
	
	
	public Continente() {
		paises =new ArrayList<Pais>();
	}
	
	public Continente(String nombre) {
		this.nombre=nombre;
	}
	
	public Continente(String nombre, ArrayList<Pais>paises) {
		this.nombre=nombre;
		paises =new ArrayList<Pais>();
		}
	
	public Continente(ArrayList<Pais> paises) {
		paises =new ArrayList<Pais>();
		}
	
	public Continente(String nombre, ArrayList<Pais> paises, int x, int y) {
		this.nombre=nombre;
		this.paises=paises;
		this.x=x;
		this.y=y;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Continente [nombre=" + nombre  + "Paises: " + paises+ "]";
	}

	public ArrayList<Pais> getPaises() {
		return paises;
	}

	public void setPaises(ArrayList<Pais> paises) {
		this.paises = paises;
	}


	
	
	
}
