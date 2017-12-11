package com.example.admin.googleplaces;

/**
 * Created by Admin on 12/4/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.google.android.gms.location.places.Place;

import java.util.ArrayList;
import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
{
    public static List<MyPlace> places = new ArrayList<>();
    Context context;

    public List<MyPlace> getPlaceList() {
        return places;
    }


    public static final String TAG = "RecyclerAdapter";

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        context = parent.getContext(); //set the context here so I can use it later in this class if I want
        //this will be the Articles.xml that I'm inflating
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.places_recycler_item, null);

        return new ViewHolder(view); //should be initialized with the inflated calls above
    }

    public RecyclerAdapter(List<MyPlace> ArticleList) {
        this.places = ArticleList;
    }


    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: ");
        MyPlace gr = places.get(position);
        holder.tvName.setText("Name: " + gr.getName());
        holder.tvAddress.setText("Address: " + gr.getAddress());
        holder.tvPhoneNumber.setText("Phone Number: " + gr.getPhoneNumber());

    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //private final TextView tvName;
       // private final RecyclerView recyclerView;
        private final TextView tvName, tvAddress, tvPhoneNumber;

        public ViewHolder(View ArticleView) {
                super(ArticleView);
                //this is where we do our initializations by findViewById method calls
                tvName = ArticleView.findViewById(R.id.tvName);
                tvAddress = ArticleView.findViewById(R.id.tvAddress);
                tvPhoneNumber = ArticleView.findViewById(R.id.tvPhoneNumber);
                ArticleView.setOnClickListener(this);
            }



        @Override
        public void onClick(View view) {
            //this is where I have my logic for when they click on an Article in the recyclerview, like if i want to go to the next activity
            /*
            ArrayList<Animal> animals = AnimalsRecyclerAdapter.animalsList;
            Log.d("AnimalsRecyclerAdapter", "onClick: you clicked position " + getPosition());
            Log.d(TAG, "onClick: this results in value from list: " + animals.get(getPosition()).getName());
            Intent intent = new Intent(view.getContext(), ViewAnimalActivity.class);
            intent.putExtra("animal", animals.get(getPosition()).getName());
            view.getContext().startActivity(intent); */
            Log.d(TAG, "onClick: you clicked on position" + getPosition());
            MyPlace gr = places.get(getPosition());
           Intent intent = new Intent(view.getContext(), ViewPlaceActivity.class);
            intent.putExtra("Place", gr);
            view.getContext().startActivity(intent);

        }
    }
}
