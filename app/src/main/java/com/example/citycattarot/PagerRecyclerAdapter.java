package com.example.citycattarot;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.citycattarot.model.PagerDTO;

import java.util.ArrayList;

public class PagerRecyclerAdapter extends RecyclerView.Adapter<PagerRecyclerAdapter.PagerViewHolder> {

    private ArrayList<PagerDTO> pagerList;

    PagerRecyclerAdapter(ArrayList<PagerDTO> data) {
        this.pagerList = data;
    }


    @NonNull
    @Override
    public PagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.pager_item_view, parent, false);

        return new PagerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PagerViewHolder holder, int position) {
        if(holder instanceof PagerViewHolder){
            PagerViewHolder viewHolder = (PagerViewHolder) holder;
            viewHolder.onBind(pagerList.get(position));
        }
    }


    @Override
    public int getItemCount() {
        return pagerList.size();
    }

    public static class PagerViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_title;
        private final ConstraintLayout constraint;
        PagerDTO data;

        public PagerViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            constraint = itemView.findViewById(R.id.constraint);
        }

        public void onBind(PagerDTO data) {
            this.data = data;

            tv_title.setText(data.getTitle());
            constraint.setBackgroundResource(data.getColor());
        }
    }
}
