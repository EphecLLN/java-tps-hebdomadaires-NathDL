/**
 * 
 */
package tp2;

/**
 * La classe "UtilisationCalculatrice" permet de tester l'accessibilité
 * de variables en fonction de leur visibilité 
 *
 * @author nathdl
 *
 */
public class UtilisationCalculatrice {

	/**
	 * Méthode "main" permettant de tester l'accessibilité aux variables de la classe "Calculatrice"
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Calculatrice calc = new Calculatrice(10);
		System.out.println(calc.getValeurCourante());
		calc.setValeurCourante(calc.getValeurCourante() + 56);
		System.out.println(calc.getValeurCourante());
	}

}
