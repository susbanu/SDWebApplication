package sus.com.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Embeddable
@Entity
@Table(name = "address")
public class AddressEntity {
	
    @Column(name="address_zip_code")
    private String zipCode;

    @Column(name="address_street")
	private String street;
	
    @Column(name="address_complement")
	private String complement;
	
    @Column(name="address_city")
	private String city;
	
	@Column(name="address_state")
	private String state;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
