
public class RentManager {
	
	public void rentCar(Car car,Customer customer) {
		System.out.println(customer.getId()+ " " + car.getBrand() + " Arac� kiralad�");
	}
	
	public void dropCar(Car car,Customer customer) {
		System.out.println(customer.getId()+ " " + car.getBrand() + " Teslim etti");
	}
}
