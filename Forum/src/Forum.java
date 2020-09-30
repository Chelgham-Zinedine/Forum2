import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Forum {
	
	String sujet;
	ArrayList<Message> listeMessages = new ArrayList<>(); 
	ArrayList<Membre> listeMembre = new ArrayList<>(); 
	String date;
	
	
	public Forum(String s) {
		sujet=s;
		LocalDateTime lcdt = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		date = lcdt.format(myFormatObj);
	}
	
	public void ajouterMembre(Membre m) {
		if(!listeMembre.contains(m))
			listeMembre.add(m);
		
	}
	
	public void ajouterMessage(Message msg) {
			listeMessages.add(msg);
		
	}
	
	public ArrayList<Membre> getListeMembres(){
		return this.listeMembre;
	}

	public ArrayList<Message> getlisteMessage() {
		// TODO Auto-generated method stub
		return this.listeMessages;
	}
	
	
}
