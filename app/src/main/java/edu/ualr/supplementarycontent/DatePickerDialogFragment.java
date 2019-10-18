package edu.ualr.supplementarycontent;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by irconde on 2019-10-19.
 */

// TODO 06. Make the Dialog fragment class implement the OnDateSetListener interface
public class DatePickerDialogFragment extends DialogFragment {

    private static final String TAG = DatePickerDialogFragment.class.getSimpleName();

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        //TODO 08: We use today's date as the default value for the date picker
        return null;
    }

    // TODO 07. Implement the onDateSet method to do something with the date chosen by the user
}
