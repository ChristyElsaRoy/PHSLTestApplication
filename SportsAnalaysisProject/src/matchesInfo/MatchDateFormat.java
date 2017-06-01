package matchesInfo;

import java.text.SimpleDateFormat;

public class MatchDateFormat {

	private String date;

	public String toDateFormat() {

		SimpleDateFormat newFormat = new SimpleDateFormat("MM/dd/yyyy");
		String formatDate = newFormat.format(date);
		return formatDate;
	}

}
