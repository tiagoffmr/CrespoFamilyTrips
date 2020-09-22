package com.nbacademy.crespofamilytrips.crespofamilytrips;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyTripsAdapter extends RecyclerView.Adapter<MyTripsAdapter.MyViewHolder> {

    private TripListener listener;
    private String[] mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public MyViewHolder(View v) {
            super(v);
            view = v;
        }
    }

    public MyTripsAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public MyTripsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View tripView = inflater.inflate(R.layout.trip_item, parent, false);

        MyViewHolder vh = new MyViewHolder(tripView);
        return vh;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        TextView tripName = holder.view.findViewById(R.id.trip_name);
        tripName.setText(mDataset[position]);
    }

    interface TripListener{
        void OnCLick(String s);
    }

    class TripViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TripViewHolder(View itemView, MyTripsAdapter adapter) {
            super(itemView);

            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        final MyTripsAdapter mAdapter;

        @Override
        public void onClick(View view) {

            listener.OnCLick(mDataset[getLayoutPosition()]);

        }
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }


}
