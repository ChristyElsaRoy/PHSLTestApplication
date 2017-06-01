package matchesInfo;

public class Matches {

	private int id;
	private String league;
	private String homeTeam;
	private String awayTeam;
	private String matchDate;
	private int homeScore;
	private int awayScore;
	private String matchDifficulty;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	// home team
	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	// away team
	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	// matchdate

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	// home Score
	public int getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}

	// awayScore
	public int getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(int awayScore) {
		this.awayScore = awayScore;
	}

	// Match Difficlty
	public String getMatchDifficulty() {
		return matchDifficulty;
	}

	public void setmatchDifficulty(String matchDifficulty) {
		this.matchDifficulty = matchDifficulty;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("***** Match Details *****\n");
		sb.append("ID=" + getId() + "\n");
		sb.append("League=" + getLeague() + "\n");
		sb.append("Home Team=" + getHomeTeam() + "\n");
		sb.append("Away Team=" + getAwayTeam() + "\n");
		sb.append("match date=" + getMatchDate() + "\n");
		sb.append("Home Score=" + getHomeScore() + "\n");
		sb.append("Away Score=" + getAwayScore() + "\n");

		sb.append("\n*****************************");

		return sb.toString();
	}
}
