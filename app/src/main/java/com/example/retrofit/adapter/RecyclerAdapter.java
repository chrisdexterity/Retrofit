package com.example.retrofit.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.retrofit.R;
import com.example.retrofit.model.Data;

import java.util.List;

public class RecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter <RecyclerAdapter.MyViewHolder>{

    private List<Data>data;

    public RecyclerAdapter(List<Data>data){
        this.data=data;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view =LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_view,viewGroup,
                false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        viewHolder.Id.setText(data.get(i).getId());
        viewHolder.Title.setText(data.get(i).getTitle());
        viewHolder.Body.setText(data.get(i).getBody());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public class MyViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        TextView Id,Title,Body;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Id=(TextView) itemView.findViewById(R.id.id);
            Title=(TextView) itemView.findViewById(R.id.yes);
            Body=(TextView)itemView.findViewById(R.id.body);
        }
    }

}
