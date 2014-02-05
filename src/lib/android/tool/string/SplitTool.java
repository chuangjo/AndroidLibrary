/**
 * 
 */
package lib.android.tool.string;

/**
 * @author Otis
 *
 */
public class SplitTool {
	public static String[] splitString(String oriStr, String regularExpression, boolean includeRegularExpression) throws NullPointerException {
		String[] stringSet = null;
		if(oriStr == null) {
			stringSet = null;
		} else {
			stringSet = oriStr.split(regularExpression);// NullPointerException when includeRegularExpress is null.
			if(includeRegularExpression) {
				for(int i = 0; i < stringSet.length; i++) {
					stringSet[i] += regularExpression;
				}
			}
		}
		return stringSet;
	}
}
