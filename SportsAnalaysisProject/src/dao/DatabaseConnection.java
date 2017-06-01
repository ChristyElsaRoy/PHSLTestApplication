package dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import matchesInfo.MatchDateFormat;
import matchesInfo.MatchDifficulty;
import matchesInfo.Matches;

public class DatabaseConnection {
	public Connection getConnection() throws Exception {
		Connection connection = null;
		try {
			int status = 0;
			String connectionURL = "jdbc:mysql://localhost:";

			JSONParser parser = new JSONParser();
			PreparedStatement preparedStatement = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "");

			preparedStatement = connection.prepareStatement("insert into  Table_Name values (?, ?, ?, ? ,?, ?, ?, ?)");
			Matches matchObj = new Matches();

			int id = (int) matchObj.getId();
			preparedStatement.setInt(1, "id");

			String league = matchObj.getLeague();
			preparedStatement.setString(2, league);

			String homeTeam = matchObj.getHomeTeam();
			preparedStatement.setString(3, homeTeam);

			String awayTeam = matchObj.getAwayTeam();
			preparedStatement.setString(4, awayTeam);

			String matchDate = matchObj.getMatchDate();
			preparedStatement.setString(5, matchDate);

			int homeScore = matchObj.getHomeScore();
			preparedStatement.setInt(6, homeScore);

			int awayScore = matchObj.getAwayScore();
			preparedStatement.setInt(7, awayScore);

			String matchDifficulty = matchObj.getMatchDifficulty();
			preparedStatement.setString(8, matchDifficulty);

			status = preparedStatement.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {

			connection.close();
		}

	}

}