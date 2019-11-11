/**
 * 
 */
package tp2;

/**
 * Classe permettant de répresenter un étudiant
 * 
 * @author nathdl
 *
 */
public class Etudiant {
	
	//Variables d'instances
	private String nom;
	private String prenom;
	private int matricule;
	//Variable de type Date a créer après la classe du même nom  et disponible dans le même package.
	private Date dateNaissance;
	
	//Constructeur de la classe
	public Etudiant() {
		this.nom = "EPHEC";
		this.prenom = "etudiant";
		this.matricule = 000000;
		this.dateNaissance = new Date(0, 0, 0);
	}

	/**
	 * La classe main va afficher le nom, prénom et matricule en fonction des paramètres entrés en ligne de commande.
	 * @param args
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant();
		etu.nom = args[0];
		etu.prenom = args[1];
		etu.matricule = Integer.parseInt(args[2]);
		etu.dateNaissance = new Date(0, 0, 0);
		etu.dateNaissance.setJour(Integer.parseInt(args[3]));
		etu.dateNaissance.setMois(Integer.parseInt(args[4]));
		etu.dateNaissance.setAnnee(Integer.parseInt(args[5]));
		String dateFull = Integer.toString(etu.dateNaissance.getJour()) + "/" + Integer.toString(etu.dateNaissance.getMois()) + "/" + Integer.toString(etu.dateNaissance.getAnnee());
		System.out.println(etu.nom + " " + etu.prenom + " " + etu.matricule + " - " + dateFull);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + ", dateNaissance="
				+ dateNaissance + "]";
	}

}
