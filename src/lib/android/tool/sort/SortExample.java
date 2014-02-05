/**
 * 
 */
package lib.android.tool.sort;

import java.text.Collator;
import java.util.Comparator;
import java.util.Map;

/**
 * @author Otis
 * 
 */
public class SortExample {
	// This is a example that sort a List by comparing title. It construct Collator to define appropriate sorting method.
	// You can use Collections.sort(List, Comparator) to execute sorting.
	private final static Comparator<Map<String, Object>> sDisplayNameComparator = new Comparator<Map<String, Object>>() {
		private final Collator collator = Collator.getInstance();

		public int compare(Map<String, Object> map1, Map<String, Object> map2) {
			return collator.compare(map1.get("title"), map2.get("title"));
		}
	};
}
