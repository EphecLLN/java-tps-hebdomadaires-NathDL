/**
 * 
 */
package tp1;

/**
 * Classe Date représente une date de manière simple
 * @author nathdl
 *
 */
public class Date {
	
	//Variables d'instances
	int jour = 0;
	int mois = 0;
	int annee = 0;

	/**
	 * La méthode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Date today = new Date();
		today.jour = Integer.parseInt(args[0]);
		today.mois = Integer.parseInt(args[1]);
		today.annee = Integer.parseInt(args[2]);
		System.out.println(Integer.toString(today.jour) + '/' + Integer.toString(today.mois) + '/' + Integer.toString(today.annee));
	}

}
