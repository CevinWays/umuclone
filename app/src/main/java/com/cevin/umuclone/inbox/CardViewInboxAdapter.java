package com.cevin.umuclone.inbox;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cevin.umuclone.R;
import com.cevin.umuclone.inbox.model.ModelInbox;

import java.util.ArrayList;

public class CardViewInboxAdapter extends RecyclerView.Adapter<CardViewInboxAdapter.CardViewViewHolder> {
    Context context;
    private ArrayList<ModelInbox> listInbox;

    public ArrayList<ModelInbox> getListInbox() {
        return listInbox;
    }

    public void setListInbox(ArrayList<ModelInbox> listInbox) {
        this.listInbox = listInbox;
    }

    public CardViewInboxAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewInboxAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_inbox, viewGroup, false);

        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewInboxAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        ModelInbox m = getListInbox().get(i);

        cardViewViewHolder.textViewTitle.setText(m.getMessageTitle());
        cardViewViewHolder.textViewDesc.setText(m.getMessageDesc());
    }

    @Override
    public int getItemCount() {
        return getListInbox().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        TextView textViewDesc;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textView_title_inbox_umu);
            textViewDesc = itemView.findViewById(R.id.textView_desc_inbox_umu);
        }
    }
}
