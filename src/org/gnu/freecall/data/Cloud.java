package org.gnu.freecall.data;


/**
 * A cloud is a somewhat unsorted list of information. In the "you" activity, a cloud might represent the interests of the
 * user. This might turn into an interface or abstract class at some point, not quite sure yet.
 */
public class Cloud {
	/**
	 * The label of the cloud, such as "interests". This is not private property with a getter, for speed reasons.
	 */
	public final String label;
	/**
	 * The values of this cloud. This is an array, as Pimm thinks this way the filter operation is faster. This should be
	 * measured, though (TODO). Can be null if there are no values yet.
	 */
	private String[] values;
	public Cloud(String label) {
		this.label = label;
	}
	public final void addValue(String value) {
		if (null == values) {
			values = new String[1];
			values[0] = value;
		} else {
			String[] currentValues = values;
			final int oldLength = values.length;
			values = new String[oldLength + 1];
			System.arraycopy(currentValues, 0, values, 0, currentValues.length);
			values[oldLength] = value;
		}
	}
	public final boolean determineContains(CharSequence value) {
		return true;
	}
	/**
	 * Returns the label of the cloud.
	 */
	public final String toString() {
		return label;
	}
}
