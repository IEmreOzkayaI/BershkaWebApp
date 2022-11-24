package pure.bershka.entities.concretes;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "locations")
public class Location {
	 	@Id
	    @Column(name = "location_id")
	    private int locationId;

	    @Column(name = "location_title")
	    private String locationTitle;

	    @Column(name = "address")
	    private String address;

	    @Column(name = "city")
	    private String city;

	    @Column(name = "town")
	    private String town;

	    @Column(name = "post_code")
	    private String postCode;

	    @Column(name = "another_adress_info")
	    private String anotherAddressInfo;

	    @OneToMany(mappedBy = "location")
	    private List<Order> orders;
	    
	    @OneToMany(mappedBy = "billingLocation")
	    private List<Order> orderBillingLocation;
	    

	    
}







