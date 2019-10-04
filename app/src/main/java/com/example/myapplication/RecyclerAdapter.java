package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    List<Person> personList;
    Click click;
RecyclerAdapter(List<Person> person , Click click){
    this.personList = person;
    this.click = click;
}
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new RecyclerViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.onBind(personList.get(position));

    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtItem;
        View itemView;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtItem = itemView.findViewById(R.id.txtItem);
            this.itemView = itemView;

        }

        void onBind(final Person person){
            txtItem.setText(person.getName());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    click.clicked(person.getFamily());
                }
            });

        }

    }
}
