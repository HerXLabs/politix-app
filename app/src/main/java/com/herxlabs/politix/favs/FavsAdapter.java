package com.herxlabs.politix.favs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.herxlabs.politix.Politico;
import com.herxlabs.politix.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by HX on 06/05/2017.
 */

public class FavsAdapter extends RecyclerView.Adapter<FavsAdapter.MyViewHolder>{
    private List<Politico> favsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
//        public TextView title, year, genre;
        @BindView(R.id.nombre) TextView nombre;
        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
//            title = (TextView) view.findViewById(R.id.title);
//            genre = (TextView) view.findViewById(R.id.genre);
//            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public FavsAdapter(List<Politico> favs) {
        this.favsList = favs;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Politico politico = favsList.get(position);
        holder.nombre.setText(politico.getNombre());
//        holder.genre.setText(movie.getGenre());
//        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return favsList.size();
    }
}