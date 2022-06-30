package oopsproblems;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * 
 * @author singa
 *
 */

public class AddressBookMain {
	public static String firstName;
	public static String lastName;
	public static String address;
	public static String city;
	public static String state;
	public static int zipNo;
	public static long phoneNo;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<PersonDetails> adressBook = new ArrayList<PersonDetails>();
/** 
 * 
 * @param args
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		System.out.println("Enter firstName");
		firstName =sc.next();
		
		System.out.println("Enter LastName");
		lastName =sc.next();
		
		System.out.println("Enter Address");
		address =sc.next();
		
		System.out.println("Enter City");
		city =sc.next();
		
		System.out.println("Enter State");
		state =sc.next();
		
		System.out.println("Enter Zip");
		zipNo =sc.nextInt();
		
		System.out.println("Enter phoneNumber");
		phoneNo =sc.nextLong();
		
	}
}
