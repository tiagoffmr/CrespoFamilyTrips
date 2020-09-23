package com.nbacademy.crespofamilytrips.crespofamilytrips;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class DestinationsConfig extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private FloatingActionButton newTripButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations_config);


            String[] tripNames = new String[] {"boas", "ola" , "broas"};  //TODO guardar dados do sqlite (pode ser uma lista)
            String[] tripDays = new String[] {"boas", "ola" , "broas"};


            recyclerView = (RecyclerView) findViewById(R.id.destiny_list);
            newTripButton =  findViewById(R.id.add_destiny);

            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            recyclerView.setHasFixedSize(true);

            // use a linear layout manager
            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);

            // specify an adapter (see also next example)
            mAdapter = new MyTripsAdapter(tripNames, tripDays);
            recyclerView.setAdapter(mAdapter);

            newTripButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(DestinationsConfig.this , NewDestinyActivity.class);
                    startActivity(i);
                }
            });




    }
}