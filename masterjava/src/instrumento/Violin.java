package instrumento;

//Subclase Violín
public final class Violin extends Instrumento {
	private double tamaño; // Tamaño del violín en pulgadas, ejemplo: 4/4, 3/4
	
	// Constructor
	public Violin(String material, double longitud, double peso, double tamaño) {
	   super("cuerda", material, longitud, peso);
	   this.tamaño = tamaño;
	}
	
	// Getter y setter de tamaño
	public double getTamaño() {
	   return tamaño;
	}
	
	public void setTamaño(double tamaño) {
	   this.tamaño = tamaño;
	}
	
	// Implementación de métodos abstractos
	@Override
	public void tocar() {
	   System.out.println("Tocando el violín de tamaño " + tamaño + " pulgadas");
	}
	
	@Override
	public void afinar() {
	   System.out.println("Afinando el violín ajustando las clavijas");
	}
	
	// Método específico de Violín
	public void cambiarCuerdas() {
	   System.out.println("Cambiando las cuerdas del violín");
	}
}

