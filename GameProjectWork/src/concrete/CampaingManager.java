package concrete;

import Entities.Campaing;
import interfaces.CampaingService;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaignName()+" eklendi");
		
	}

	@Override
	public void remove(Campaing campaing) {
		System.out.println(campaing.getCampaignName()+" silindi");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaignName()+" guncellendi");
		
	}
	

}
