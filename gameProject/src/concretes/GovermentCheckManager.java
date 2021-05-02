package concretes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import abstracts.CheckService;
import entities.Gamer;

public class GovermentCheckManager implements CheckService{

	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public boolean check(Gamer gamer) {
		try {
			if ( gamer.getFirstName() == "Tülin" && gamer.getLastName() == "Aktaþ" && gamer.getNationalIdentity()=="1" && gamer.getBirtday().equals(dateFormat.parse("18/09/1998")) ) {
				return true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
