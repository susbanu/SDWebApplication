package sus.com.util;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.base.BaseDateTime;

/**
 * Created on Mar 17, 2015
 * 
 * @author Sushant
 * @version 1.0
 */
public abstract class DateTimeUtil {
	
	// This does not take time zones into consideration.
	public static boolean isSameDate(BaseDateTime a, BaseDateTime b) {
		
		if (a == null || b == null)
			return false;
		
		BaseDateTime aMidnight = new DateMidnight(a);
		BaseDateTime bMidnight = new DateMidnight(b);
		
		return aMidnight.equals(bMidnight);
	}
	
	public static BaseDateTime startOfDay(BaseDateTime dateTime) {
		return new DateTime(dateTime).withTime(0, 0, 0, 0);
	}
	
	public static BaseDateTime endOfDay(BaseDateTime dateTime) {
		return new DateTime(dateTime).withTime(23, 59, 59, 999);
	}
	
	// This does not take time zones into consideration.
	public static boolean isWithin(BaseDateTime date, BaseDateTime begin, BaseDateTime end) {
		if (date == null)
			return false;

		if (begin != null && date.isBefore(begin))
			return false;
		
		if (end != null && date.isAfter(end))
			return false;
		
		return true;
	}
}