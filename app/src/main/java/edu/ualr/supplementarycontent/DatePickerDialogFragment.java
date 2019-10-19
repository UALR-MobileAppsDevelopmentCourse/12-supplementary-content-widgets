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
public class DatePickerDialogFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    private static final String TAG = DatePickerDialogFragment.class.getSimpleName();

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        //TODO 08: We use today's date as the default value for the date picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                getActivity(), this, year, month, day);

        return datePickerDialog;
    }

    // TODO 07. Implement the onDateSet method to do something with the date chosen by the user
    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        Log.d(TAG, String.format("Date selected- year %d, month %d, day %d", year, month, day));
    }
}
