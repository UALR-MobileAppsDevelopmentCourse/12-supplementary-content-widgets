package edu.ualr.supplementarycontent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irconde on 2019-10-19.
 */
public class MultiChoiceListFragment extends DialogFragment {

    private static final String TAG = MultiChoiceListFragment.class.getSimpleName();

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        // TODO 02. To create a multi-choice list use the setMultiChoiceItems() method
        // We'll use the string array toppings as data source
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
        dialogBuilder.setTitle(R.string.multi_choice_dialog_title)
                // TODO 03. Track selected items. We create a list with the name of the selected
                //  items and another one with the available items
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            // TODO 04. Log selected values when ok button gets clicked
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        return dialogBuilder.create();
    }
}
