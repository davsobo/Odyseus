package com.reader.hci.odyseus;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 10-Dec-16.
 */


//public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;
        Toast toast;

        ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personAge = (TextView)itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);

            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String judul = (String)personName.getText();
                    if(judul.equals("Timun Mas")) {
                        Intent intent  = new Intent(cv.getContext(), StoryPageActivity.class);
                        cv.getContext().startActivity(intent);
                    } else {
                        showToast("Konten belum tersedia", cv);
                    }
                }
            });
        }

        private void showToast (String st, CardView cv) { //"Toast toast" is declared in the class
            try {
                toast.getView().isShown();     // true if visible
                toast.setText(st);
            } catch (Exception e) {         // invisible if exception
                toast = Toast.makeText(cv.getContext(), st, Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }
    List<Person>persons;


    MyAdapter(List<Person> persons){
        this.persons = persons;
    }



    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        ViewHolder pvh = new ViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(persons.get(i).name);
        personViewHolder.personAge.setText(persons.get(i).age);

        if(persons.get(i).name.equals("Timun Mas")) {
            personViewHolder.personPhoto.setImageResource(R.drawable.dongeng_timun_mas);
        }
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}
