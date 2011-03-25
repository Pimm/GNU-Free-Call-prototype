package org.gnu.freecall.discoverherd;

import java.util.ArrayList;
import java.util.List;

import org.gnu.freecall.R;
import org.gnu.freecall.data.Cloud;
import org.gnu.freecall.data.CloudArrayAdapter;
import org.gnu.freecall.view.SearchFieldWatcher;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

/**
 * The "discover herd" activity.
 */
public class DiscoverHerdActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Set the content view.
        setContentView(R.layout.list);
        final List<Cloud> clouds = new ArrayList<Cloud>();
        clouds.add(new Cloud("David Sugar"));
        clouds.add(new Cloud("Andrew Bovsunovskiy"));
        clouds.add(new Cloud("Pimm Hogeling"));
        clouds.add(new Cloud("Guitarist"));
        clouds.add(new Cloud("Hospital"));
        final CloudArrayAdapter dataAdapter = new CloudArrayAdapter(this, R.layout.list_item, R.id.text, clouds);
        ((ListView) findViewById(R.id.list_view)).setAdapter(dataAdapter);
        new SearchFieldWatcher(((EditText) findViewById(R.id.search_field)));
	}
}