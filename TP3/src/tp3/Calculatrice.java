/**
 * 
 */
package tp3;

/**
 * La classe "Calculatrice" permet d'effectuer des calculs simples
 * 
 * @author nathdl
 *
 */
public class Calculatrice {
	
	// Variables d'instances
	private double valeurCourante;
	
	//Constructeur de la classe
	/**
	* Constructeur initialisant la calculatrice
	* avec la valeur indiquée.
	* @param value : valeur initiale pour la calculatrice
	*/
	public Calculatrice(double value) {
		this.valeurCourante = value;
	}
	
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
	* Cette méthode calcule le carré d’un nombre.
	* @param n : Un nombre entier quelconque
	* @return Un nombre >= 0, résultat de la multiplication de n par lui-même
	*/
	public int carre(int n){
	return n*n;
	}
	
	/**
	 * Méthode permettant de convertir l'objet courant en String
	 */
	public String toString() {
		return ("Valeur affichée : " + valeurCourante);
	}

	/**
	 * Méthode "main" permettant de tester notre classe "Calculatrice"
	 * 
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice myCalc = new Calculatrice(6);
		System.out.println(myCalc);
	}

	public double getValeurCourante() {
		return valeurCourante;
	}

	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}

}
