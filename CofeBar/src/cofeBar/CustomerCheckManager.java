package cofeBar;

public class CustomerCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		  return true ;
	}
	

}
