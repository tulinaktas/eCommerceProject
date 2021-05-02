package concretes;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName()+" game sold to "+gamer.getFirstName()+". Price: "+game.getPrice());
	}

	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName()+" game sold to "+gamer.getFirstName()+". Price: "+(game.getPrice()-campaign.getAmount()));
	}
	
}
