package ineritance;

class Address {

	int street_no;
	String city;
	String state;
	int pin;
	Address(int street_no, String city, String state, int pin ){
		this.street_no = street_no;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
}

class Student
{
	String name;
	Address ad;
}



