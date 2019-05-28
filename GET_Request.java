package RESTAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;

public class GET_Request {

	@Test
	public static void GETRequest() throws IOException 
	{
		//URLConnection and HttpURLConnection classes for developing Java programs
//that communicate to a server via URLs (mostly using HTTP protocol).
		URL urlGetRequest = new URL("http://192.168.0.32:8000/api/user");
		String readLine = null;
		HttpURLConnection connection = (HttpURLConnection) urlGetRequest.openConnection();
		connection.setRequestMethod("GET");
		int responseCode = connection.getResponseCode();
		System.out.println("Response code is" +responseCode);
		if(responseCode == HttpURLConnection.HTTP_OK) 
		{  BufferedReader in = new BufferedReader(
	            new InputStreamReader(connection.getInputStream()));
		 StringBuffer response = new StringBuffer();
	        while ((readLine = in .readLine()) != null) {
	            response.append(readLine);
	        } in .close();
	        // print result
	        System.out.println("JSON String Result " + response.toString());
	       
		}else 
		{
			 System.out.println("GET NOT WORKED");
		}
	}
	

}
