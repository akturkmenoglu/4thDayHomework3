package Business.Abstarcts;

import Entities.Concretes.Campaign;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public interface SaleService {


	void sale(Game game,Gamer gamer);
	void saleWithCampaign(Game game, Gamer gamer,Campaign campaign);
	
}
