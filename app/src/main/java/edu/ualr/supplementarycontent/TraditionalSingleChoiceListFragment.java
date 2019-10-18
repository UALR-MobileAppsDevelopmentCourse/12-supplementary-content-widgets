package edu.ualr.supplementarycontent;

import android.app.Dialog;
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

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        colorValues = getResources().getStringArray(R.array.colors);
        AlertDialog.Builder  builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.single_choice_dialog_title);
                // TODO 01. To create a single-choice list use the setItems() method
                // TODO 02. We get the selected item and we show its vale in the logcat
        return builder.create();
    }


}
