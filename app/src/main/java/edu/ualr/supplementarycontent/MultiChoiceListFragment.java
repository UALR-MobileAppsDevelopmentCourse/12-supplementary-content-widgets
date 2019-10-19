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
    List<String> selectedItems;
    String[] availableItems;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        selectedItems = new ArrayList<>();
        availableItems = getResources().getStringArray(R.array.toppings);
        // TODO 04. To create a multi-choice list use the setMultiChoiceItems() method
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
        dialogBuilder.setTitle(R.string.multi_choice_dialog_title)
                .setMultiChoiceItems(R.array.toppings, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean isChecked) {
                        // TODO 05. Track selected items
                        if (isChecked) {
                            selectedItems.add(availableItems[i]);
                        } else {
                            if (selectedItems.contains(availableItems[i])) {
                                selectedItems.remove(i);
                            }
                        }
                    }
                }).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            // TODO 06. Log selected values when ok button gets clicked
            public void onClick(DialogInterface dialogInterface, int i) {
                Log.d(TAG, "Selected items: ");
                for (String item: selectedItems) {
                    Log.d(TAG, item + "  ");
                }
            }
        });
        return dialogBuilder.create();
    }
}
