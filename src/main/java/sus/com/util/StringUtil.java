package sus.com.util;

import java.util.Collection;

/**
 * Created on Mar 17, 2015
 * 
 * @author Sushant
 * @version 1.0
 */
public abstract class StringUtil {
	
	public static String join(String delimeter, Collection<String> values) {
		return join(delimeter, values.toArray(new String[0]));
	}
	
    public static String join(String delimeter, String...values) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;

        for (String s : values) {
            if (isNotEmpty(s)) {
                if (!first && delimeter != null)
                    sb.append(delimeter);

                sb.append(s);
                first = false;
            }
        }

        return sb.toString();
    }

    public static String join(String delimeter, String open, String close, Collection<String> values) {
    	return join(delimeter, open, close, values.toArray(new String[0]));
    }
    
    public static String join(String delimeter, String open, String close, String...values) {
		StringBuilder sb = new StringBuilder();
    	String inner = join(delimeter, values);
    	
    	if (isNotEmpty(inner)) {
    		sb.append(open);
    		sb.append(inner);
    		sb.append(close);
    	}
    	
    	return sb.toString();
    }

    public static boolean isEmpty(String value) {
        return value == null || value.trim().length() <= 0;
    }

    public static boolean isNotEmpty(String value) {
        return !isEmpty(value);
    }
}