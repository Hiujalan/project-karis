package com.kares.karisprojek;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CobaAdapter extends RecyclerView.Adapter<CobaAdapter.CobaViewHolder> {
    public  class CobaViewHolder extends RecyclerView.ViewHolder {
        private CardView containerView;
        public TextView Judul, Desk;
        public ImageView img;

        public CobaViewHolder(@NonNull View itemView) {
            super(itemView);

            containerView = itemView.findViewById(R.id.item_layout);
            Judul = itemView.findViewById(R.id.Judul);
            Desk = itemView.findViewById(R.id.text_Desk);
            img = itemView.findViewById(R.id.img);

            containerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Track tracks = (Track)containerView.getTag();
                    Intent intent = new Intent(view.getContext(),detail.class);
                    intent.putExtra("Judul", tracks.getJudul());
                    intent.putExtra("Desk", tracks.getDesk());
                    intent.putExtra("img", tracks.getImg());

                    view.getContext().startActivity(intent);
                }
            });
        }
    }

    List<Track> tracks = Arrays.asList(
        new Track("KOTA MIAMI", "Kota Miami adalah sebuah kota di bagian selatan negara bagian Florida, Amerika serikat.", R.drawable.miami),
        new Track("KOTA LOS ANGLES", "Kota Di Amerika Serikat yang memiliki penduduk terbanyak.", R.drawable.losangles),
        new Track(" KOTA JAKARTA", "Ibukota negara indonesia sekaligus memiliki 5 kota administrasi dan satu kabupaten administrasi atau disebut kota metropolitan", R.drawable.jakarta)
    );


    @NonNull
    @Override
    public CobaAdapter.CobaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new CobaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CobaAdapter.CobaViewHolder holder, int i) {
       Track current = tracks.get(i);
       holder.Judul.setText(current.getJudul());
//       holder.Desk.setText(current.getDesk());
       holder.img.setImageResource(current.getImg());
       holder.containerView.setTag(current);


//       holder.itemView.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               Intent intent = new Intent(view.getContext(),detail.class);
//               intent.putExtra("Judul", current.getJudul());
//               intent.putExtra("Desk", current.getDesk());
//               intent.putExtra("img", current.getImg());
//
//               view.getContext().startActivity(intent);
//           }
//       });

    }

    @Override
    public int getItemCount() {
        return tracks.size();
    }
}




