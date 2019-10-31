/**
 * 
 */
package tp1;

/**
 * La classe "Calculatrice" permet d'effectuer des calculs simples
 * 
 * @author nathdl
 *
 */
public class Calculatrice {
	
	// Variables d'instances
	double valeurCourante = 0;
	
	// Méthodes
	
	/**
	 * Méthode permettant d'ajouter au résultat afficher par la calculatrice un nombre
	 * 
	 * @param n double le nombre à ajouter
	 */
	public void ajoute(double n) {
		valeurCourante += n;
	}
	
	/**
	 * Méthode permettant de soustraire au résultat afficher par la calculatrice un nombre
	 * 
	 * @param n double le nombre à soustraire
	 */
	public void soustrait(double n) {
		valeurCourante -= n;
	}
	
	/**
	 * Méthode permettant d'élever au carré le résultat afficher par la calculatrice
	 */
	public void carre() {
		valeurCourante = valeurCourante * valeurCourante;
	}

	/**
	 * Méthode "main" permettant de tester notre classe "Calculatrice"
	 * 
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice calcTest = new Calculatrice();
		calcTest.ajoute(5);
		System.out.println(calcTest.valeurCourante);
		calcTest.soustrait(2);
		System.out.println(calcTest.valeurCourante);
	}

}
