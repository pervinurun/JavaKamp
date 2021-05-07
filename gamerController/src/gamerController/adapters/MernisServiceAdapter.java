package gamerController.adapters;

import gamerController.abstracts.CustomerCheckService;
import gamerController.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean customerCheck(Gamer gamer) throws Exception {
		boolean result;
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		return kpsPublicSoapProxy.TCKimlikNoDogrula(
				Long . parseLong (gamer . getNationalityId ()),
				gamer.getFirstName().toUpperCase(),
				gamer.getLastName().toUpperCase(),
				gamer.getDateOfBirth().getYear());
		
	}

}
