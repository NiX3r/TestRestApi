package cz.ncode.restapitest.Instances;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class NCUser {

	private int id;
	private String name, username, email, phone, website;
	//private NCAddress Address;
	//private NCCompany Company;
	
}
