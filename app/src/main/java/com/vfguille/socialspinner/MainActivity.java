
package com.vfguille.socialspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.vfguille.socialspinner.adapter.SocialAdapter;
import com.vfguille.socialspinner.model.Social;
import com.vfguille.socialspinner.model.SocialComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private SocialAdapter socialAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        socialAdapter = new SocialAdapter(this, getListSocial());
        socialAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(socialAdapter);
        spinner.setSelection(0, false); // No muestra el toast al iniciarse.
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(), adapterView.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) { }
        });
    }

    private List<Social> getListSocial() {
        List<Social> list = new ArrayList<>();
        list.add(new Social(R.drawable.daa, "Sovietic social", 300, 200));
        list.add(new Social(R.drawable.facebooklogo, "Facebú", 1009884, 459099));
        list.add(new Social(R.drawable.googlelogo, "Guguel", 99999, 99999999));
        // Ordenar por el orden natural.
        Collections.sort(list);
        // Ordenar por otro criterio usando el objeto Comparator.
        Collections.sort(list, new SocialComparator());
        return list;
    }
}