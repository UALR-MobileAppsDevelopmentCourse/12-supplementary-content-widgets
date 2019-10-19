package edu.ualr.supplementarycontent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String FRAGMENT_TAG = "SaveDialog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void showTradSingleDialog(View view) {
        TraditionalSingleChoiceListFragment dialog = new TraditionalSingleChoiceListFragment();
        dialog.show(getSupportFragmentManager(), FRAGMENT_TAG);
    }

    public void showSingleDialog(View view) {
        SingleChoiceListFragment dialog = new SingleChoiceListFragment();
        dialog.show(getSupportFragmentManager(), FRAGMENT_TAG);
    }

    public void showMultiChoiceDialog(View view) {
        MultiChoiceListFragment dialog = new MultiChoiceListFragment();
        dialog.show(getSupportFragmentManager(), FRAGMENT_TAG);
    }
}
