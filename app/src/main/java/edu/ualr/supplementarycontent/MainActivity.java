package edu.ualr.supplementarycontent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// TODO 05. The activity tha receives events from dialog must implement the interface
public class MainActivity extends AppCompatActivity implements TraditionalSingleChoiceListFragment.NoticeDialogListener {

    private static final String FRAGMENT_TAG = "SaveDialog";
    private TextView colorTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorTV = findViewById(R.id.selected_option_tv);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void showTradSingleDialog(View view) {
        SingleChoiceListFragment dialog = new SingleChoiceListFragment();
        dialog.show(getSupportFragmentManager(), FRAGMENT_TAG);
    }

    // TODO 06. Implement the methods of the interface
    @Override
    public void onDialogColorClick(String color) {
        this.colorTV.setText(color);
    }
}
