package edu.ualr.supplementarycontent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

// TODO 01: Define a new xml menu resource to add actions to the action bar. toolbar_menu.xml

// TODO 02: We have to add an item element for each item you want to include in the action bar
// We have to define for each item in the menu: title, icon, showAsAction and id
/**
 * "Mark Favorite", should appear as action button always
 * "Delete", should appear as action button if possible
 * "Settings", should not appear as action button
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    // TODO 03. Specify the options menu for the activity. Override the onCreateOptionsMenu method

    // TODO 04. Handling click events. Override onOptionsItemSelected method

}
