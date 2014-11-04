
public class Pais {
	private String nombrePais;
	private int x;
	private int y;
	public String getNombrePais() {
		return nombrePais;
	}
	public Pais(String nombrePais, int x, int y) {
		super();
		this.nombrePais = nombrePais;
		this.x = x;
		this.y = y;
		
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Pais(String nombrePais) {
		super();
		this.nombrePais = nombrePais;
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Pais [nombrePais=" + nombrePais + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
}
