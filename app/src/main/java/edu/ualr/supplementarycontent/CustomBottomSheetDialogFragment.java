package edu.ualr.supplementarycontent;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/**
 * Created by irconde on 2019-10-18.
 */

// TODO 01. Define a class for the bottom sheet that extends the BottomSheetDialogFragment class
public class CustomBottomSheetDialogFragment extends BottomSheetDialogFragment implements View.OnClickListener {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // TODO 02. We must override the OnCreateView method
    // TODO 03. We must use the layout inflater to create a view for the dialog with the provided layout
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  getLayoutInflater().inflate(R.layout.bottom_sheet, container, false);
        // TODO 04. Dismiss dialog on button tapped
        Button proceedButton = view.findViewById(R.id.proceed_payment_button);
        proceedButton.setOnClickListener(this);
        return view;
    }

    // TODO 04. Dismiss dialog on button tapped
    @Override
    public void onClick(View view) {
        this.dismiss();
    }
}
