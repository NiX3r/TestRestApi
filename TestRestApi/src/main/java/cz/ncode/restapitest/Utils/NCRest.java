package cz.ncode.restapitest.Utils;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class NCRest {

	public static Boolean LoadUsers() {
		
		try {
			
			HttpURLConnection connection = (HttpURLConnection) new URL("https://jsonplaceholder.typicode.com/users").openConnection();
			
			connection.setRequestMethod("GET");

			int responseCode = connection.getResponseCode();
			if(responseCode == 200){
				String response = "";
				Scanner scanner = new Scanner(connection.getInputStream());
				while(scanner.hasNextLine()){
					response += scanner.nextLine();
					response += "\n";
				}
				scanner.close();
				NCJsonReader.LoadUsers(response);
			}
			
			return true;
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}
	
}
