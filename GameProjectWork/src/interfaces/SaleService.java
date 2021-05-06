package interfaces;

import Entities.Campaing;
import Entities.Game;
import Entities.User;
import concrete.DiscountManager;

public interface SaleService {
	
	public void sale(Game game,User user, DiscountManager discountManager, Campaing campaing );

}
