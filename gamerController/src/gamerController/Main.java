package gamerController;

 
import gamerController.conretes.SaleManager;
import gamerController.entities.Campaign;
import gamerController.entities.Game;
import gamerController.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
			Gamer gamer = new Gamer();
			Campaign campaign = new Campaign();
			SaleManager saleManager = new SaleManager();
			
			
			game.setId(1);
			game.setName("Counter");
			game.setUnitPrice(95);
			
			gamer . setId ( 1 );
			gamer.setFirstName("Pervin");
			gamer.setLastName("Ürün");
			gamer.setNationalityId("2829202");
			
			campaign.setId(1);
			campaign.setName("%10 indirim");
			campaign.setDiscountRate(10);
			
			saleManager.sellWithCampaign(game, gamer, campaign);
	}

}
