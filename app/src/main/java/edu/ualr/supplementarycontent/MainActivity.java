package edu.ualr.supplementarycontent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

// TODO 01. Create the layout of the persistent bottom sheet
// TODO 02. Create a specific layout for the content of the activity, under the bottom sheet
public class MainActivity extends AppCompatActivity {

    private static final String FRAGMENT_TAG = "SaveDialog";
    private BottomSheetBehavior bottomSheetBehavior;
    private LinearLayout bottomSheetLayout;
    private Button bottomSheetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO 07. We must get a reference to the bottom sheet and its behavior
        // We create the bottomSheetBehavior from the bottomSheetLayout
        // TODO 08. We can also define actions triggered by changes in the state of the bottom sheet
        // We'll use a BottomSheetBehavior.BottomSheetCallback
    }

    // TODO 06. Define a click event to show-dismiss bottom sheet based on the current state of the bottom sheet
}
