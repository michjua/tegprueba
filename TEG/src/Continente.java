import java.util.ArrayList;


public class Continente {

	private String nombre;
	private ArrayList<Pais> paises =new  ArrayList<Pais>();
	private int x;
	private int y;
	

	public Continente(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		paises =new  ArrayList<Pais>();
	}


	@Override
	public String toString() {
		return "Continente [nombre=" + nombre + "]";
	}


	public ArrayList<Pais> getPaises() {
		return paises;
	}


	public void setPaises(ArrayList<Pais> paises) {
		this.paises = paises;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



}
