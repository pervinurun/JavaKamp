package gamerController.conretes;

import gamerController.abstracts.SaleService;
import gamerController.entities.Campaign;
import gamerController.entities.Game;
import gamerController.entities.Gamer;
import gamerController.entities.Sale;

public class SaleManager  extends BaseManager<Sale> implements SaleService {

	@Override
	public void sell(Game game, Gamer gamer) {
		System.out.println(game.getName() + " oyunu " + game.getUnitPrice() + "Liraya Alýndý.");
	}

	@Override
	public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		double discountPrice = game.getUnitPrice()-(game.getUnitPrice()*(campaign.getDiscountRate()/100));
		System.out.println(game.getName() + " oyunu " + discountPrice + " Liraya Alýndý.");
		
	}
	

}
