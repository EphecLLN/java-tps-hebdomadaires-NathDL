/**
 * 
 */
package tp3;

/**
 * Classe permettant de s'exercer à la rédaction de tests avec JUnit
 * @author nathdl
 *
 */
public class ExerciceTDD {
	
	/**
	 * Vérifie si un nombre est pair
	 * 
	 * @param num : un nombre entier
	 * @return parite : "true" si le nombre est pair, "false" sinon
	 */
	public boolean estPair(int i) {
		if ((i % 2) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Calcule le périmètre d’un carré sur base de la longueur de son côté
	 * 
	 * @param val : un nombre entier positif
	 * @return perim : La valeur du périmètre
	 */
	public double perimetreCarre(int n) {
		return n*n;
	}
	
	/**
	 * Vérifie si un caractère donné apparaît dans une chaîne de caractères
	 * 
	 * @param chaine : une chaine de caractères
	 * @param caract : un caractère
	 * @return presence : "true" si présent, "false" sinon
	 */
	public boolean contientCaractere(String chaine, char caract) {
		for (int i = 0; i < chaine.length(); i++ ) {
			if (chaine.charAt(i) == caract) {
				return true;
			}
		}
		return false;
	}

}
