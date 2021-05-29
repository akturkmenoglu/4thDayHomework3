package Business.Concretes;

import Business.Abstarcts.GamerCheckService;
import Entities.Concretes.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Gamer gamer) {
		
		return true;
	}

}