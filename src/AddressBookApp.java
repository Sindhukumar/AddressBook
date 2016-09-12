import java.util.Scanner;

public class AddressBookApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		System.out.println("Enter the name:");
		ab.setAddress(sc.nextLine());
		System.out.println("Enter the Address:");
		ab.setAddress(sc.nextLine());
		System.out.println("Enter the city");
		ab.setCity(sc.nextLine());
		System.out.println("Enter the state");
		ab.setState(sc.nextLine());
		System.out.println("Enter zip");
		ab.setZip(sc.nextInt());
		System.out.println("Enter the phone:");
		while(!ab.setPhone(sc.nextLine())){
			System.out.println("Incorrect phone number format: Please phone number in \"(xxx) xxx-xxxx\" format");
		}
		System.out.println("Enter the email:");
		while(!ab.setEmail(sc.nextLine())){
			System.out.println("Incorrect email format: Please enter email in \"name@domain.com.\" format");
		}
		sc.close();
		
		System.out.println("Name: " +ab.getName());
		System.out.println("Address: "+ab.getAddress());
		System.out.println("City : "+ab.getCity());
		System.out.println("State: "+ab.getState());
		System.out.println("Zip: "+ab.getZip());
		System.out.println("Phone: "+ab.getPhone());
		System.out.println("Email: "+ab.getEmail());
	}
	

}
