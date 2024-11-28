package instrumento;

//Subclase Clarinete
public final class Clarinete extends Instrumento {
	private String tonalidad; // Ejemplo: "Sib", "Do"
	
	// Constructor
	public Clarinete(String material, double longitud, double peso, String tonalidad) {
	   super("viento", material, longitud, peso);
	   this.tonalidad = tonalidad;
	}
	
	// Getter y setter de tonalidad
	public String getTonalidad() {
	   return tonalidad;
	}
	
	public void setTonalidad(String tonalidad) {
	   this.tonalidad = tonalidad;
	}
	
	// Implementación de métodos abstractos
	@Override
	public void tocar() {
	   System.out.println("Tocando el clarinete en tonalidad " + tonalidad);
	}
	
	@Override
	public void afinar() {
	   System.out.println("Afinando el clarinete con ajuste del barrilete");
	}
	
	// Método específico de Clarinete
	public void desmontar() {
	   System.out.println("Desmontando el clarinete para guardarlo");
	}
}