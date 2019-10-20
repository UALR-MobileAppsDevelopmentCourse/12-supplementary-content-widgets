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

// TODO 02. We must create a class that extends the DialogFragment class
public class ChangesDialogFragment extends DialogFragment {

    private static final String TAG = ChangesDialogFragment.class.getSimpleName();

    // TODO 03. We must override the onCreateDialog method
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        // TODO 04. We use the Builder class to construct the new dialog
        AlertDialog.Builder  builder = new AlertDialog.Builder(getActivity());
        // TODO 05. We set the message text of the dialog...
        builder.setMessage(R.string.dialog_msg)
                // TODO 06. The title of the dialog...
                .setTitle(R.string.dialog_title)
                // TODO 07. We define a button the user should use to accept and continue with the action
                // Label + action listener
                .setPositiveButton(R.string.save_btn_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d(TAG, "Save action clicked");
                    }
                })
                // TODO 08. We define a button the user should use to cancel the action
                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Log.d(TAG, "Cancel action clicked");
                            }
                        }
                );

        // TODO 09. Create the dialog object and return it
        return builder.create();
    }
}
