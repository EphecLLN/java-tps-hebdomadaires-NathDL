/**
 * 
 */
package tp1;

/**
 * Classe permettant de répresenter un étudiant
 * 
 * @author nathdl
 *
 */
public class Etudiant {
	
	//Variables d'instances
	String nom;
	String prenom;
	int matricule;
	//Variable de type Date a créer après la classe du même nom  et disponible dans le même package.
	Date dateNaissance;

	/**
	 * La classe main va afficher le nom, prénom et matricule en fonction des paramètres entrés en ligne de commande.
	 * @param args
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant();
		etu.nom = args[0];
		etu.prenom = args[1];
		etu.matricule = Integer.parseInt(args[2]);
		etu.dateNaissance = new Date();
		etu.dateNaissance.jour = Integer.parseInt(args[3]);
		etu.dateNaissance.mois = Integer.parseInt(args[4]);
		etu.dateNaissance.annee = Integer.parseInt(args[5]);
		String dateFull = Integer.toString(etu.dateNaissance.jour) + "/" + Integer.toString(etu.dateNaissance.mois) + "/" + Integer.toString(etu.dateNaissance.annee);
		System.out.println(etu.nom + " " + etu.prenom + " " + etu.matricule + " - " + dateFull);
	}

}
