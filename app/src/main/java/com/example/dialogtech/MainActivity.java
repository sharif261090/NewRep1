package com.example.dialogtech;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button Logout;
    private Button Confirm;
    private Button Cancel;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        MyDialog di = new MyDialog();
        di.onCreateDialog(savedInstanceState);

    }

    public void onClickLogout(View v){

        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.layout_dialog);
        dialog.show();
        dialog.setCancelable(false);
    }

    public void cancel(View v){
        dialog.cancel();
    }
}