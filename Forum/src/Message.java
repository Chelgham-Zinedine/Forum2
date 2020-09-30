import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Message {
	String date;
	HashMap<String, Membre> messageMembre = new HashMap();
	
	public Message(String s, Membre m) {
		messageMembre.put(s,m);
        LocalDateTime lcdt = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		date = lcdt.format(myFormatObj);
		
	}
	
	public HashMap<String,Membre> getMembre() {
		return messageMembre;
	}

}
