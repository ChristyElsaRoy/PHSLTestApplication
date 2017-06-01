package webservice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

public class MatchRESTServiceClient {
	public static void main(String[] args) {
		String string = "";
		try {

			InputStream matchesInputStream = new FileInputStream("/Users/<username>/Documents/matches.txt");
			InputStreamReader matchesReader = new InputStreamReader(matchesInputStream);
			BufferedReader br = new BufferedReader(matchesReader);
			String line;
			
			while ((line = br.readLine()) != null) {
				string += line + "\n";
			}

			JSONObject jsonObject = new JSONObject(string);
			System.out.println(jsonObject);

			// Pass JSON File Data to REST Service
			try {
				URL url = new URL("http://localhost:8080/webservice/MatchesRESTWebService");
				URLConnection connection = url.openConnection();
				connection.setDoOutput(true);
				connection.setRequestProperty("Content-Type", "application/json");
				connection.setConnectTimeout(5000);
				connection.setReadTimeout(5000);
				OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
				out.write(jsonObject.toString());
				out.close();

				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

				while (in.readLine() != null) {
				}
				System.out.println("\nREST Service Invoked Successfully..");
				in.close();
			} catch (Exception e) {
				System.out.println("\nError while callingREST Service");
				System.out.println(e);
			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
