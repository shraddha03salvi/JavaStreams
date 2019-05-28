package RESTAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.http.HttpResponse;
import org.testng.annotations.Test;

public class POST_Request {

	
	@Test
	public static void PostLogin() throws IOException 
	{
		final String POST_PARAMS = "{\n" + "\"email\" :\"shraddha12salvi@gmail.com\",\r\n" + "\"password\":\"Shraddha@123\" "+"\n}";
		//System.out.println(POST_PARAMS);
		URL Obj = new URL("http://192.168.0.32:8000/api/user/login");
		HttpURLConnection postConnection = (HttpURLConnection) Obj.openConnection();
		 postConnection.setRequestMethod("POST");
		 postConnection.setRequestProperty("Content-Type","application/json");
		 
		 postConnection.setDoOutput(true);
		    OutputStream os = postConnection.getOutputStream();
		    os.write(POST_PARAMS.getBytes());
		    os.flush();
		    os.close();
		    
		    int responseCode = postConnection.getResponseCode();
		  
		    String responseBody = postConnection.getResponseMessage();
		    System.out.println("POST Response Code :  " + responseCode);
		    System.out.println("POST ResponseBody : " +  responseBody);
		    
		    if (responseCode == HttpURLConnection.HTTP_CREATED) { //success
		        BufferedReader in = new BufferedReader(new InputStreamReader(
		            postConnection.getInputStream()));
		        String inputLine;
		        StringBuffer response = new StringBuffer();
		        while ((inputLine = in .readLine()) != null) {
		            response.append(inputLine);
		        } in .close();
		        // print result
		        System.out.println(response.toString());
		    } 
		  
	}
}
