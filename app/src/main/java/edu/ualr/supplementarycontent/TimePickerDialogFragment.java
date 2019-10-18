package edu.ualr.supplementarycontent;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

/**
 * Created by irconde on 2019-10-18.
 */

// TODO 02. Make the DialogFragment implement the OnTimeSetListenr interface
public class TimePickerDialogFragment extends DialogFragment {

    private static final String TAG = TimePickerDialogFragment.class.getSimpleName();

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        // TODO 01. Define the default values for the time picker. Use current time
        // TODO 04. Create a new instance of the TimePickerDialog
        return null;
    }
    // TODO 03. Implement the onTimeSet method to do something with the time chosen by the user
}

// TODO 05. Create a new DialogFragment to provide the user a DatePicker
