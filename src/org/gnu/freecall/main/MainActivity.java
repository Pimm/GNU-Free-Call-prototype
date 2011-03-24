package org.gnu.freecall.main;

import org.gnu.freecall.R;
import org.gnu.freecall.you.YouActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * The main activity, which shows the GNU head and the buttons that navigate to the other activities.
 */
public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view.
        setContentView(R.layout.main);
        ((Button) findViewById(R.id.you)).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View button) {
				startActivity(new Intent(MainActivity.this, YouActivity.class));
			}
		});
    }
}