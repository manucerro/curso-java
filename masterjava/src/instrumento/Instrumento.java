package instrumento;

//Clase base Instrumento
public abstract sealed class Instrumento implements Tocable permits Violin, Clarinete {
	private String tipo; // Ejemplo: "viento", "cuerda"
	private String material; // Ejemplo: "madera", "metal"
	private double longitud; // En centímetros
	private double peso; // En kilogramos
	
	// Constructor
	public Instrumento(String tipo, String material, double longitud, double peso) {
	    this.tipo = tipo;
	    this.material = material;
	    this.longitud = longitud;
	    this.peso = peso;
	}
	
	// Métodos de acceso (getters y setters)
	public String getTipo() {
	     return tipo;
	}
	 
	public void setTipo(String tipo) {
	     this.tipo = tipo;
	}
	
	public String getMaterial() {
	     return material;
	}
	
	public void setMaterial(String material) {
	     this.material = material;
	}
	
	public double getLongitud() {
	     return longitud;
	}
	
	public void setLongitud(double longitud) {
	     this.longitud = longitud;
	}
	
	public double getPeso() {
	     return peso;
	}
	
	public void setPeso(double peso) {
	     this.peso = peso;
	}
	
	 // Método común a todos los instrumentos
	public void limpiar() {
		System.out.println("Limpiando el instrumento de tipo " + tipo);
	}
	
	// Métodos de la interfaz (deben ser implementados en las subclases)
	public abstract void tocar();
	
	public abstract void afinar();
}
