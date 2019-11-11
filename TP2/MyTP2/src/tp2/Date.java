/**
 * 
 */
package tp2;

/**
 * Classe Date représente une date de manière simple
 * @author nathdl
 *
 */
public class Date {
	
	//Variables d'instances
	private int jour;
	private int mois;
	private int annee;
	
	// Constructeur de la classe
	/**
	 * Constructeur initiant la date avec les valeurs indiquées.
	 * @param jour : valeur initiale pour le jour
	 * @param mois : valeur initiale pour le mois
	 * @param annee : valeur initiale pour l'année
	 */
			public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	/**
	 * La méthode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Date today = new Date(0, 0, 0);
		today.jour = Integer.parseInt(args[0]);
		today.mois = Integer.parseInt(args[1]);
		today.annee = Integer.parseInt(args[2]);
		System.out.println(Integer.toString(today.jour) + '/' + Integer.toString(today.mois) + '/' + Integer.toString(today.annee));
		System.out.println(today);
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		if (jour <= 31 && jour > 0) {
			this.jour = jour;
		}
		else {
			System.out.println("Erreur ! Le jour entré n'est pas compris entre 1 & 31");
		}
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		if (mois <= 31 && mois > 0) {
			this.mois = mois;
		}
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String toString() {
		return "Date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}

}
