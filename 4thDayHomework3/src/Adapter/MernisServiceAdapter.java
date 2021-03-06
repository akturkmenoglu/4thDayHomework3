package Adapter;

import Business.Abstarcts.GamerCheckService;
import Entities.Concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter  implements GamerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		Boolean result=false;
		try {
			result=proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
				gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),
				gamer.getDateOfBirth().getYear());
		}catch (Exception e)
		{
		System.out.println("Not a valid person");
		}
		
		
		return result;
	}
		
}
