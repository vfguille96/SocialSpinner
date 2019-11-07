
package com.vfguille.socialspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.vfguille.socialspinner.adapter.SocialAdapter;
import com.vfguille.socialspinner.model.Social;

import java.util.ArrayList;
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


    }

    private List<Social> getListSocial() {
        List<Social> list = new ArrayList<>();
        list.add(new Social(R.drawable.daa, "Sovietic social"));
        list.add(new Social(R.drawable.facebooklogo, "Facebú"));
        list.add(new Social(R.drawable.googlelogo, "Guguel"));
        return list;
    }
}
