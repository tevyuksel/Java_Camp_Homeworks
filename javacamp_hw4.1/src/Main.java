
import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer ty = new Customer();
		ty.setId(1);
		ty.setFirstName("Tevhid");
		ty.setLastName("Yüksel");
		ty.setNationalityId("11111111111");
		ty.setBirthDate(2020);
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(ty);
	}

}
