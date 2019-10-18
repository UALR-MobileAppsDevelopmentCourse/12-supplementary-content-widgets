package edu.ualr.supplementarycontent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

// TODO 01. Define a class for the bottom sheet that extends the BottomSheetDialogFragment class
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String FRAGMENT_TAG = "BottomSheetDialog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void showDialog(View view) {
        CustomBottomSheetDialogFragment dialog = new CustomBottomSheetDialogFragment();
        dialog.show(getSupportFragmentManager(), FRAGMENT_TAG);
    }
}
