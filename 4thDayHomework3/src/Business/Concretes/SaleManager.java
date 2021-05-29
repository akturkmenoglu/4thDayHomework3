package Business.Concretes;

import Business.Abstarcts.SaleService;
import Entities.Concretes.Campaign;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("game named "+game.getName() + " sold to gamer "+gamer.getFirstName());
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		
		System.out.println("game named "+game.getName() + " discount applied "+campaign.getDiscount() +" sold to gamer "+gamer.getFirstName());
	}

	

}