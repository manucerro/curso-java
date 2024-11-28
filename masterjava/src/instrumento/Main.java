package instrumento;

public class Main {
	 public static void main(String[] args) {
	     // Crear un Clarinete
	     Clarinete clarinete = new Clarinete("madera", 67.5, 0.8, "Sib");
	     clarinete.limpiar();
	     clarinete.tocar();
	     clarinete.afinar();
	     clarinete.desmontar();

	     // Crear un Violín
	     Violin violin = new Violin("madera", 60.0, 0.5, 4 / 4.0);
	     violin.limpiar();
	     violin.tocar();
	     violin.afinar();
	     violin.cambiarCuerdas();
	 }
}