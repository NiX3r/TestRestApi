package cz.ncode.restapitest.Utils;

import com.google.gson.Gson;

import cz.ncode.restapitest.Instances.NCUser;

public class NCJsonReader {

	public static Boolean LoadUsers(String JSON) {
		
		Gson gson = new Gson();
		NCUser[] users = gson.fromJson(JSON, NCUser[].class);
		
		for(NCUser user : users) {
			
			System.out.println(user.getName() + " >>> " + user.getAddress().getGeo().getLat());
			
		}
		
		return true;
		
	}
	
}
