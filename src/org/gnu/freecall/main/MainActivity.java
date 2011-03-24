package org.gnu.freecall.main;

import org.gnu.freecall.R;

import android.app.Activity;
import android.os.Bundle;

/**
 * The main activity that shows the GNU head and the buttons that navigate to the other activities.
 */
public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view.
        setContentView(R.layout.main);
    }
}