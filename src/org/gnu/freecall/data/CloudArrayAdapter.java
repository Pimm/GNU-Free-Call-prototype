package org.gnu.freecall.data;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

/**
 * A concrete BaseAdapter that is backed by an array of clouds.
 */
public class CloudArrayAdapter extends ArrayAdapter<Cloud> {
	/**
	 * A filter that reads into the cloud objects, rather than the value returned by the toString method.
	 */
	private final class CloudArrayFilter extends Filter {
		@Override
		protected final FilterResults performFiltering(CharSequence constraint) {
			return null;
		}
		@Override
		protected final void publishResults(CharSequence constraint, FilterResults results) {
			
		}
	}
	/**
	 * The filter returned by the getFilter method, or null if that method has not been called yet.
	 */
	private Filter filter;
	public CloudArrayAdapter(Context context, int resource, int textViewResourceId, List<Cloud> objects) {
		super(context, resource, textViewResourceId, objects);
	}
	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		final View result = super.getView(position, convertView, parent);
		result.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Log.d("You clicked", "You clicked on the " + getItem(position).label);
			}
		});
		return result;
	}
	@Override
	public Filter getFilter() {
		if (null == filter) {
			filter = new CloudArrayFilter();
		}
		return filter;
	}
}