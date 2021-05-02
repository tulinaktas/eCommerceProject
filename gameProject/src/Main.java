import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import concretes.CampaignManager;
import concretes.GamerManager;
import concretes.GovermentCheckManager;
import concretes.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Game game1 = new Game(1,"Valorant",50);
		Game game2 = new Game(2,"The Sims 4",250);
		Game game3 = new Game(2,"Counter Strike",127);
		
		Gamer gamer = new Gamer(1,"1","Tülin","Aktaþ",dateFormat.parse("18/09/1998"));
		
		Campaign campaign1 = new Campaign(1,"a",50);
		Campaign campaign2 = new Campaign(2,"b",25);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign2);
		
		GamerManager gamerManager = new GamerManager(new GovermentCheckManager());
		gamerManager.add(gamer);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game1, gamer);
		saleManager.sale(game3, gamer, campaign2);
		saleManager.sale(game2, gamer, campaign1);
		
		
	}

}
