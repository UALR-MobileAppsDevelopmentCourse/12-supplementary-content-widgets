package edu.ualr.supplementarycontent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    // TODO 03. Specify the options menu for the activity.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    // TODO 04. Handling click events
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.favourite_action:
                Log.d(TAG, "Favourite option clicked");
                return true;
            case R.id.delete_action:
                Log.d(TAG, "Delete option clicked");
                return true;
            case R.id.settings_action:
                Log.d(TAG, "Settings option clicked");
                return true;
                default: return super.onOptionsItemSelected(item);
        }
    }
}
