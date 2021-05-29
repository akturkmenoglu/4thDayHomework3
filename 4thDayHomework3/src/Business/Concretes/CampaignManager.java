package Business.Concretes;

import Business.Abstarcts.CampaignService;
import Entities.Concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("campaign has been added " + campaign.getDiscount());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("campaign has been updated " + campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("campaign has been deleted " + campaign.getDiscount());
		
	}
	
	

}
