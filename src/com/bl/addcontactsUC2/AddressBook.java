package com.bl.addcontactsUC2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList<Contacts> arrayDetails = new ArrayList<Contacts>();
	Scanner sc = new Scanner(System.in);

	public void addDetails() {
		Contacts info = new Contacts();
		System.out.println("Enter the first name");
		info.setFirstName(sc.nextLine());
		System.out.println("Enter the last name");
		info.setLastName(sc.nextLine());
		System.out.println("Enter the address");
		info.setAddress(sc.nextLine());
		System.out.println("Enter the city");
		info.setCity(sc.nextLine());
		System.out.println("Enter the state");
		info.setState(sc.nextLine());
		System.out.println("Enter the email");
		info.setEmail(sc.nextLine());
		System.out.println("Enter the zip code");
		info.setZip(sc.nextInt());
		System.out.println("Enter the phone number");
		info.setPhoneNumber(sc.nextLong());
		arrayDetails.add(info);
		sc.close();
	}

	public void display() {
		System.out.println(arrayDetails);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook details = new AddressBook();
		details.addDetails();
		details.display();
	}
}
