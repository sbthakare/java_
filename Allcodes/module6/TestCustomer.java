package module6;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Customer customer = new Customer();
		System.out.println("\t Default constructor");
		System.out.println(customer);
//		System.out.println(customer.getCustid());
//		System.out.println(customer.getName());
//		System.out.println(customer.getMobile());
//		System.out.println(customer.getAddress());

		System.out.println("-----------------------");
		System.out.println("\t Parameter constructor");
		System.out.println("Enter Roll NO:");
		int roll = sc.nextInt();
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter mobile No:");
		int mob = sc.nextInt();
		System.out.println("Enter Address:");
		String add = sc.next();
		Customer customer1 = new Customer(roll, name, mob, add);
		System.out.println("-----------------------------");

		System.out.println("\t Information");
		System.out.println(customer1);
//		System.out.println("Id:"+customer1.getCustid());
//		System.out.println("Name:"+customer1.getName());
//		System.out.println("Mobile No"+customer1.getMobile());
//		System.out.println("Address:"+customer1.getAddress());

	}

}
