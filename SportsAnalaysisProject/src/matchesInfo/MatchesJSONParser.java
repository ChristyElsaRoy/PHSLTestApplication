package matchesInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.json.*;

public class MatchesJSONParser {

	public static final String JSON_FILE = "matches.txt";

	public static void main(String[] args) throws IOException {
		InputStream fis = new FileInputStream(JSON_FILE);

		// create JsonReader object
		JsonReaderFactory factory = Json.createReaderFactory(null);
		jsonReader = factory.createReader(fis);

		// get JsonObject from JsonReader
		JsonObject jsonObject = jsonReader.readObject();

		// we can close IO resource and JsonReader now
		jsonReader.close();
		fis.close();

		// Retrieve data from JsonObject and create matches bean
		Matches matchObj = new Matches();

		matchObj.setId(jsonObject.getInt("id"));
		matchObj.setLeague(jsonObject.getString("league"));
		matchObj.setHomeTeam(jsonObject.getString("home"));
		matchObj.setAwayTeam(jsonObject.getString("away"));
		matchObj.setMatchDate(jsonObject.getString("date"));
		matchObj.setHomeScore(jsonObject.getString("home_score"));
		matchObj.setAwayScore(jsonObject.getString("away_score"));

		//System.out.println(matchObj);

	}

}