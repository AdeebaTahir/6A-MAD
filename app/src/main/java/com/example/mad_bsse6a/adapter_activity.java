package com.example.mad_bsse6a;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mad_bsse6a.databinding.ActivityAdapterBinding;

public class adapter_activity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityAdapterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] months = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, months);

        ListView listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int
                    position, long id) {
                // Intent intent=new Intent(getApplicationContext(),Second.class);
                // intent.putExtra("v1", String.valueOf(position));
                //startActivity(intent);
                Toast.makeText(adapter_activity.this, "Show error message", Toast.LENGTH_SHORT).show();
            }
        });
    }
}