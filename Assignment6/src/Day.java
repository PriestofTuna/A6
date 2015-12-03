import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * @author lyttek
 *
 */
public class Day {
	String day;
	private String[] days = { "Monday", "Tuesday", "Wendsday", "Thursday", "Friday", "Saterday", "Sunday" };

	/**
	 * Initializes public Day
	 * 
	 * @param day
	 */
	public Day(String day) {
		super();
		this.day = day;
	}
/**
 * gets and sets day
 * @return
 */
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * calculates day
	 * @param numOfDays
	 * @return
	 */
	public String calculateDay(int numOfDays) {
		String message = "";
		int dayIndex = getDayIndex(this.day);
		int i=0;
		dayIndex += numOfDays;
		if (dayIndex != -1) {
			while (dayIndex > days.length) {
				dayIndex -= 7;
			}
			
			message = days[((dayIndex)%7)];
		} else {

			dayIndex += 7;
			message = days[(dayIndex)%7];
		}
		return message;
	}
/**
 * sets the value for numOfDays for "previous" day.
 * @return
 */
	public String previousDay() {
		return calculateDay(-1);
	}
	/**
	 * sets the value for numOfDays for "next" day.
	 * @return
	 */
	public String nextDay() {
		return calculateDay(+1);
	}
	/**
	 * sets the value for the portion of the array being used as a starting point.
	 * @return
	 */
	private int getDayIndex(String day) {
		int list = Arrays.asList(days).indexOf(this.day);
		// boolean done = false;
		if (days[list] != null) {
			return list;
		}
		return -1;
	}
}
