package concretes;

import abstracts.CheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{
	
	private CheckService govermentCheck;
	
	public GamerManager(CheckService govermentCheck) {
		this.govermentCheck = govermentCheck;
	}

	@Override
	public void add(Gamer gamer) {
		if(this.govermentCheck.check(gamer)) {
			System.out.println("Added gamer "+gamer.getFirstName());
		}else {
			System.out.println("Not avaible this gamer");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		if(this.govermentCheck.check(gamer)) {
			System.out.println("Deleted gamer "+gamer.getFirstName());
		}else {
			System.out.println("Not avaible this gamer");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(this.govermentCheck.check(gamer)) {
			System.out.println("Updated gamer "+gamer.getFirstName());
		}else {
			System.out.println("Not avaible this gamer");
		}
	}

}
