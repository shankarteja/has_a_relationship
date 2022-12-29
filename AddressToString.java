package has_a_relationship;

public class AddressToString {
String street,city,state,country;

public AddressToString(String street, String city, String state, String country) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
	this.country = country;
}

public String toString() {
	return "AddressToString [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + "]";
}

	}


