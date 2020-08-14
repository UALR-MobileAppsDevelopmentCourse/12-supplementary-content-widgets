package edu.ualr.supplementarycontent;

import android.app.Dialog;
import android.content.Context;
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
    // TODO 02. Use the defined interface as type to declare a new member of the DialogFragment class
    NoticeDialogListener listener;

    // TODO 01. Define an interface to deliver events back to the host activity
    public interface NoticeDialogListener {
        public void onDialogColorClick(String color);
    }

    // TODO 03. Override the onAttach method to instantiate the NoticeDialogListener (the corresponding activity)
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        // TODO 04. Verify the host activity implements the callback interface
        if (context instanceof  NoticeDialogListener) {
            listener = (NoticeDialogListener) context;
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        colorValues = getResources().getStringArray(R.array.colors);
        AlertDialog.Builder  builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.single_choice_dialog_title)
                .setItems(R.array.colors, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onDialogColorClick(colorValues[which]);
                    }
                });
        return builder.create();
    }


}
