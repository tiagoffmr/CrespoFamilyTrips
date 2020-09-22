package com.nbacademy.crespofamilytrips.crespofamilytrips;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyTripsAdapter extends RecyclerView.Adapter<MyTripsAdapter.MyViewHolder> {

    private TripListener listener;
    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View view;
        public MyViewHolder(View v) {
            super(v);
            view = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyTripsAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyTripsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View tripView = inflater.inflate(R.layout.trip_item, parent, false);

        MyViewHolder vh = new MyViewHolder(tripView);
        return vh;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
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

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }


}
