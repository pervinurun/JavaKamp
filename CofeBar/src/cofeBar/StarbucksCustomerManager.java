package cofeBar;

public class StarbucksCustomerManager extends  BaseCustomerManager {
	
	private PersonCheckService customerCheckService;

    public StarbucksCustomerManager(PersonCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
    
    @Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);	
		}else {
			System.out.println("geçerli müþteri deðil");
		}
		
			
	}

}
