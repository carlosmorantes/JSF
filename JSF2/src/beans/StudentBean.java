package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentBean {
	
	private String firstName;
	private String lastName;
	private String country;
	private String[] city;
	private String favoriteProgrammingLanguage;
	
	List<String> countryOptions;
	
	// no arg. constructor
	public StudentBean(){
		countryOptions = new ArrayList<>();
		countryOptions.add("Brazil");
		countryOptions.add("India");
		countryOptions.add("Italy");
		countryOptions.add("Colombia");		
		firstName = "Joe";
		lastName = "Doe";
		country = "India";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteProgrammingLanguage() {
		return favoriteProgrammingLanguage;
	}

	public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
		this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
	}

	public String[] getCity() {
		return city;
	}

	public void setCity(String[] city) {
		this.city = city;
	}

	
	
}
