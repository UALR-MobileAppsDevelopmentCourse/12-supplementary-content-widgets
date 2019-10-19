package edu.ualr.supplementarycontent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

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

    public void openChildActivity(View view) {
        Intent intent = new Intent(this, ChildActivity.class);
        startActivity(intent);
    }

    public void showToast(View view) {
        // TODO 01. Instantiate a Toast object.
        // We must provide the application context, the text message, and the duration of the toast
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.toast_message);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        // TODO 02. We define the position of the toast
        // By default, it's positioned in the bottom center of the screen
        toast.setGravity(Gravity.TOP, 0, 128);
        // TODO 03. We display the toast notification
        toast.show();
    }
}
