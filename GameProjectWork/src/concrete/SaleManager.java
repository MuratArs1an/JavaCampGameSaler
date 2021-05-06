package concrete;

import Entities.Campaing;
import Entities.Game;
import Entities.User;
import interfaces.SaleService;

public class SaleManager implements SaleService{
	
	private DiscountManager discountManager;
	
	public SaleManager(DiscountManager discountManager) {
		this.discountManager=discountManager;
		
	}

	@Override
	public void sale(Game game, User user, DiscountManager discountManager, Campaing campaing ) {
		double discountedPrice=game.getPrice()-discountManager.discountCalculator(game.getPrice(),campaing.getDiscount() );
		System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli musteri "+
				game.getGameName()+" isimli oyunu "+game.getPrice()+"TL yerine "+campaing.getCampaignName()+" ile "
				+discountedPrice+"TL ye satin almistir. "
				);
	}

}
