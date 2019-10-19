package edu.ualr.supplementarycontent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

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
        bottomSheetLayout = findViewById(R.id.bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetLayout);
        bottomSheetButton = findViewById(R.id.btn_bottom_sheet);
        // TODO 08. We can also define actions triggered by changes in the state of the bottom sheet
        final Context context = this;
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                switch (newState) {
                    case BottomSheetBehavior.STATE_HIDDEN:
                        break;
                    case BottomSheetBehavior.STATE_EXPANDED:
                        Toast.makeText(context, "Sheet expanded", Toast.LENGTH_SHORT).show();
                    break;
                    case BottomSheetBehavior.STATE_COLLAPSED:
                        Toast.makeText(context, "Sheet collapsed", Toast.LENGTH_SHORT).show();
                    break;
                    case BottomSheetBehavior.STATE_DRAGGING:
                        break;
                    case BottomSheetBehavior.STATE_SETTLING:
                        break;
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
    }

    // TODO 06. Define a click event to show-dismiss bottom sheet
   public void onBottomSheetTapped(View view) {
       if (bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
           bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
           bottomSheetButton.setText(R.string.close_sheet);
       } else {
           bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
           bottomSheetButton.setText(R.string.expand_sheet);
       }
   }


}
