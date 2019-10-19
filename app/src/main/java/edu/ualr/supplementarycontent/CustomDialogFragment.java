package edu.ualr.supplementarycontent;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.AlteredCharSequence;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

/**
 * Created by irconde on 2019-10-18.
 */

// TODO 01. Define de layout to be used for the AlertDialog.  custom_dialog.xml
public class CustomDialogFragment extends DialogFragment {

    private static final String TAG = CustomDialogFragment.class.getSimpleName();

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder  builder = new AlertDialog.Builder(getActivity());
        // TODO 02. Get the layout inflater to inflate the layout and create the corresponding view
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        // TODO 03. Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.custom_dialog, null))
                .setPositiveButton(R.string.sign_in_button_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Sign in the user
                    }
                })
                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Cancel
                    }
                });
        return builder.create();
    }
}
