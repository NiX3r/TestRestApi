package cz.ncode.restapitest.Instances;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class NCAddress {

	@Getter @Setter private String Street, Suite, City, ZipCode;
	@Getter @Setter private NCGeoLocation GeoLoc;
	
}
