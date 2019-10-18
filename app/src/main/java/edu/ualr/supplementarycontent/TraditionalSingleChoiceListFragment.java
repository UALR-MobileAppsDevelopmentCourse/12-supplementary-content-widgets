package edu.ualr.supplementarycontent;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

/**
 * Created by irconde on 2019-10-18.
 */

public class TraditionalSingleChoiceListFragment extends DialogFragment {

    private static final String TAG = TraditionalSingleChoiceListFragment.class.getSimpleName();
    private String[] colorValues;
    // TODO 02. Use the defined interface as type to declare a new member of the DialogFragment class
    // TODO 01. Define an interface to deliver events back to the host activity
    // TODO 03. Override the onAttach method to instantiate the NoticeDialogListener (the corresponding activity)
    // TODO 04. Verify the host activity implements the callback interface

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        colorValues = getResources().getStringArray(R.array.colors);
        AlertDialog.Builder  builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.single_choice_dialog_title)
                .setItems(R.array.colors, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO 07. Invoke the listener's method to send event to the Activity
                    }
                });
        return builder.create();
    }


}
