package RESTAPI;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.testng.annotations.Test;

public class DELETE_Request {

	@Test
	public static void DeleteRequest() throws Exception  {
	
		URL url = new URL("http://192.168.0.32:8000/api/notes/5ce66b286b01dc1bc4922aa0/user/notes");
		String readLine = null;
		URLConnection urlCon = url.openConnection();
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("DELETE");
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
			 System.out.println("DELETE NOT WORKED");
		}
	}
	}
	

