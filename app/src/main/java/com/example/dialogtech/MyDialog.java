package com.example.dialogtech;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("Are you sure??") // Dialog will have "Make a selection" as the title
                .setPositiveButton("Confirm", new DialogInterface.OnClickListener() // An OK button that does nothing
                {
                    public void onClick(DialogInterface dialog, int id) {// Nothing happening here
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {// A "Cancel" button that does nothing
                    public void onClick(DialogInterface dialog, int id) {// Nothing happening here either
                    }
                });
        return builder.create();
    }

}
