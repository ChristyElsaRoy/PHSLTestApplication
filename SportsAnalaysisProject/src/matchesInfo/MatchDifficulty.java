package matchesInfo;

public class MatchDifficulty {

	private int homeScore = 0;
	private int awayScore = 0;

	public String getmatchDifficulty() {

		String Match_Difficult;

		if ((homeScore - awayScore) == 0) {
			Match_Difficult = "Tough_game";
			
		} else if (((homeScore - awayScore) == 1) || ((homeScore - awayScore) == 2)) {
			Match_Difficult = "Average_Game";
			
		} else {
			Match_Difficult = "Major_Win";

		}

		return Match_Difficult;
	}

}
