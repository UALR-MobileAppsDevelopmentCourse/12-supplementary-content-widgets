package edu.ualr.supplementarycontent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

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

import com.google.android.material.snackbar.Snackbar;

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

    public void showCustomToast(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("This is a custom toast");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 32);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    public void showSnackbar(View view) {
        // TODO 02. Get the coordinator layout, parent of the snackbar
        CoordinatorLayout parentView = findViewById(R.id.rootView);
        // TODO 03. Create a snackbar object by calling the static make method
        String msg = getResources().getString(R.string.snackbar_message);
        int duration = Snackbar.LENGTH_LONG;
        Snackbar snackbar = Snackbar.make(parentView, msg, duration);
        // TODO 04. Add an action to the snackbar message
        snackbar.setAction(R.string.snackbar_action, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Snackbar action tapped");
            }
        });
        // TODO 05. Show the message to the user
        snackbar.show();
    }
}
