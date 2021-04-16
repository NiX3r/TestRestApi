package cz.ncode.restapitest.Instances;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class NCAddress {

	@Getter @Setter private String street, suite, city, zipcode;
	@Getter @Setter private NCGeoLocation geo;
	
}
