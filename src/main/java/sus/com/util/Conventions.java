package sus.com.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.joda.time.DateTime;
import org.joda.time.base.BaseDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created on Mar 17, 2015
 * 
 * @author Sushant
 * @version 1.0
 */

public abstract class Conventions {

	/** Standard date formatters. */
	public static final DateTimeFormatter[] DATE_FORMATTERS = {
		DateTimeFormat.forPattern("yyyy-MM-dd"),
		DateTimeFormat.forPattern("MM/dd/yy"),
		DateTimeFormat.forPattern("MM/dd/yyyy"),
		DateTimeFormat.forPattern("M/d/yy"),
		DateTimeFormat.forPattern("M/d/yyyy"),
		DateTimeFormat.forPattern("MM-dd-yy"),
		DateTimeFormat.forPattern("MM-dd-yyyy"),
		DateTimeFormat.forPattern("M-d-yy"),
		DateTimeFormat.forPattern("M-d-yyyy")
	};

	public static final DateTimeFormatter DEFAULT_DATE_FORMATTER = DATE_FORMATTERS[0];

	/** Standard date/time formatters. */
	public static final DateTimeFormatter[] DATE_TIME_FORMATTERS = {
		DateTimeFormat.forPattern("MM/dd/yyyy hh:mma"), // First one is used as DEFAULT in the Spring form binding

		DateTimeFormat.forPattern("yyyy-MM-dd hh:mma"),
		DateTimeFormat.forPattern("yyyy-MM-dd hh:mm:ss"),
		DateTimeFormat.forPattern("yyyy-MM-dd hh:mm:ssa"),
		DateTimeFormat.forPattern("yyyy-MM-dd HH:mm"),
		DateTimeFormat.forPattern("yyyy-MM-dd HH:mma"),
		DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss"),
		DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS"),
		DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ssa"),
		DateTimeFormat.forPattern("yyyy-MM-dd"),
		DateTimeFormat.forPattern("MM/dd/yyyy hh:mma"),
		DateTimeFormat.forPattern("MM/dd/yyyy hh:mm:ssa"),
		DateTimeFormat.forPattern("MM/dd/yyyy HH:mm"),
		DateTimeFormat.forPattern("MM/dd/yyyy HH:mma"),
		DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss"),
		DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss.SSS"),
		DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ssa"),
		DateTimeFormat.forPattern("MM/dd/yyyy"),
		DateTimeFormat.forPattern("MM/dd/yy hh:mma"),
		DateTimeFormat.forPattern("MM/dd/yy hh:mm:ssa"),
		DateTimeFormat.forPattern("MM/dd/yy HH:mm"),
		DateTimeFormat.forPattern("MM/dd/yy HH:mma"),
		DateTimeFormat.forPattern("MM/dd/yy HH:mm:ss"),
		DateTimeFormat.forPattern("MM/dd/yy HH:mm:ss.SSS"),
		DateTimeFormat.forPattern("MM/dd/yy HH:mm:ssa"),
		DateTimeFormat.forPattern("MM/dd/yy"),
		DateTimeFormat.forPattern("M/d/yyyy hh:mma"),
		DateTimeFormat.forPattern("M/d/yyyy hh:mm:ssa"),
		DateTimeFormat.forPattern("M/d/yyyy HH:mm"),
		DateTimeFormat.forPattern("M/d/yyyy HH:mma"),
		DateTimeFormat.forPattern("M/d/yyyy HH:mm:ss"),
		DateTimeFormat.forPattern("M/d/yyyy HH:mm:ss.SSS"),
		DateTimeFormat.forPattern("M/d/yyyy HH:mm:ssa"),
		DateTimeFormat.forPattern("M/d/yyyy"),
		DateTimeFormat.forPattern("M/d/yy hh:mma"),
		DateTimeFormat.forPattern("M/d/yy hh:mm:ssa"),
		DateTimeFormat.forPattern("M/d/yy HH:mm"),
		DateTimeFormat.forPattern("M/d/yy HH:mma"),
		DateTimeFormat.forPattern("M/d/yy HH:mm:ss"),
		DateTimeFormat.forPattern("M/d/yy HH:mm:ss.SSS"),
		DateTimeFormat.forPattern("M/d/yy HH:mm:ssa"),
		DateTimeFormat.forPattern("M/d/yy")
	};

	public static final DateTimeFormatter[] TIME_FORMATTERS = {
		DateTimeFormat.forPattern("HH"),
		DateTimeFormat.forPattern("HH:mm"),
		DateTimeFormat.forPattern("HH:mm:ss"),
		DateTimeFormat.forPattern("hh"),
		DateTimeFormat.forPattern("hha"),
		DateTimeFormat.forPattern("hh:mma"),
		DateTimeFormat.forPattern("hh:mm:ssa"),
	};

	public static final DateTimeFormatter DEFAULT_DATE_TIME_FORMATTER = DATE_TIME_FORMATTERS[0];
	
    /** Minimum supported date, used to close open ended intervals */
    public static final BaseDateTime MIN_DATE_TIME = new DateTime()
    	.year().withMinimumValue().monthOfYear().withMinimumValue().dayOfMonth().withMinimumValue()
    	.hourOfDay().withMinimumValue().minuteOfHour().withMinimumValue().secondOfMinute().withMinimumValue().millisOfSecond().withMinimumValue();

    /**
     * Maximum supported date, used to close open ended intervals.
     */
    public static final BaseDateTime MAX_DATE_TIME = new DateTime()
		.year().withMaximumValue().monthOfYear().withMaximumValue().dayOfMonth().withMaximumValue()
		.hourOfDay().withMaximumValue().minuteOfHour().withMaximumValue().secondOfMinute().withMaximumValue().millisOfSecond().withMaximumValue();

	public static final NumberFormat CREDIT_FORMATTER = new DecimalFormat("0.0#");
	
}