import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//L'agence “oogle-stade” (Administrateur) crée un forum “OGCN”.
				Forum ogcn = new Forum("OGCN");
				
				//Initialisation du Forum avec les membres
				Membre mario = new Membre("Mario");
				Membre walter = new Membre("Walter");
				Membre alban = new Membre("Alban");
				ogcn.ajouterMembre(mario);
				ogcn.ajouterMembre(walter);
				ogcn.ajouterMembre(alban);
				ArrayList<Membre> Membres = ogcn.getListeMembres();
				

	}
}
