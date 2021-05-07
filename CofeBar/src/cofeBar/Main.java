package cofeBar;
import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Customer customer =new Customer();
		customer.setId ("1");
		customer . setFirstName ( " Pervin " );
		customer.setLastName("ürün");
		customer.setNationalityId("1282302303");
		customer.setDateOfBirth(LocalDate.of(2000, Month.AUGUST, 14));
		
		
		BaseCustomerManager customerManager =  new  StarbucksCustomerManager ( new  CustomerCheckManager ());
		customerManager.save(customer);

	}

}
