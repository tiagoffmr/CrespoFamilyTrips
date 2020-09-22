package com.nbacademy.crespofamilytrips.crespofamilytrips.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nbacademy.crespofamilytrips.crespofamilytrips.R;

public class MyTripsActivity extends AppCompatActivity implements MyTripsAdapter.TripListener {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_trips);

        String[] myDataset = new String[] {"boas", "ola" , "broas"};  //TODO guardar dados do sqlite (pode ser uma lista)

        recyclerView = (RecyclerView) findViewById(R.id.trip_list);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyTripsAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);

    }

    @Override
    public void OnCLick(String TRIP) {
        //TODO ENTRAR DESPESAS DA VIAGEM TRIP
    }
}