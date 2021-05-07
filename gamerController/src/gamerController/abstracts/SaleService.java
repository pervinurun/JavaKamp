package gamerController.abstracts;

import gamerController.entities.Campaign;
import gamerController.entities.Game;
import gamerController.entities.Gamer;

public interface SaleService {
	void sell(Game game, Gamer gamer);
	void sellWithCampaign(Game game, Gamer gamer, Campaign campaign);

}
