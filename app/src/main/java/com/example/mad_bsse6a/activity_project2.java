package com.example.mad_bsse6a;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mad_bsse6a.databinding.ActivityProject2Binding;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button showMenuButton = findViewById(R.id.showMenuButton);
        showMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display menu items in a dialog
                showMenuDialog();
            }
        });
    }

    private void showMenuDialog() {
        // Inflate the XML layout for the menu
        View menuLayout = getLayoutInflater().inflate(R.layout.menu_layout, null);

        // Create an AlertDialog to display the menu
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(menuLayout)
                .setTitle("Restaurant Menu")
                .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Close the dialog
                        dialog.dismiss();
                    }
                });

        AlertDialog menuDialog = builder.create();
        menuDialog.show();
    }
}
