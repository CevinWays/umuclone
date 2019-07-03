package com.cevin.umuclone.point;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.cevin.umuclone.components.CustomOnItemClickListener;
import com.cevin.umuclone.R;
import com.cevin.umuclone.point.model.ModelPoint;

import java.util.ArrayList;

public class CardViewPointAdapter extends RecyclerView.Adapter<CardViewPointAdapter.CardViewViewHolder> {
    Context context;
    private ArrayList<ModelPoint> listPoint;

    public ArrayList<ModelPoint> getListPoint() {
        return listPoint;
    }

    public void setListInbox(ArrayList<ModelPoint> listInbox) {
        this.listPoint = listInbox;
    }

    public CardViewPointAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewPointAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_inbox, viewGroup, false);

        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewPointAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        ModelPoint m = getListPoint().get(i);

        cardViewViewHolder.textViewTitle.setText(m.getMessageTitle());
        cardViewViewHolder.textViewDesc.setText(m.getMessageDesc());

        cardViewViewHolder.CardViewPoint.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Ke Detail harusnya" + getListPoint().get(position).getMessageTitle(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListPoint().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        TextView textViewDesc;
        CardView CardViewPoint;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textView_title_inbox_umu);
            textViewDesc = itemView.findViewById(R.id.textView_desc_inbox_umu);
            CardViewPoint = itemView.findViewById(R.id.cardView_point);
        }
    }
}
