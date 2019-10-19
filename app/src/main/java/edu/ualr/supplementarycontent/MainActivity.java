package edu.ualr.supplementarycontent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.toast_message);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP, 0, 128);
        toast.show();
    }

    // TODO 01. Define a customized layout for the toast notification
    public void showCustomToast(View view) {
        // TODO 02. We retrieve the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // TODO 03. Inflate the toast layout and create the corresponding view
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_container));
        // TODO 04. We set the text of the custom toast
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("This is a custom toast");
        Toast toast = new Toast(getApplicationContext());
        // TODO 05. We can set toast's gravity and duration
        toast.setGravity(Gravity.BOTTOM, 0, 32);
        toast.setDuration(Toast.LENGTH_LONG);
        // TODO 06. We plug in the view in the toast
        toast.setView(layout);
        toast.show();
    }
}
