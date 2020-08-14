package edu.ualr.supplementarycontent;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

/**
 * Created by irconde on 2019-10-18.
 */
public class SingleChoiceListFragment extends DialogFragment {

    private static final String TAG = SingleChoiceListFragment.class.getSimpleName();
    private String[] colorValues;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        colorValues = getResources().getStringArray(R.array.colors);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.single_choice_dialog_title)
                // TODO 01. To create a single-choice list use the setSingleChoiceItems() method
                // Although both a traditional list and a list with radio buttons provide a
                // "single choice" action, you should use setSingleChoiceItems() if you want to
                // persist the user's choice
                .setSingleChoiceItems(R.array.colors, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK, so save the selectedItems results somewhere
                // or return them to the component that opened the dialog
            }
        })
                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                    }
                });
        return builder.create();
    }
}
