package com.cevin.umuclone.profile;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cevin.umuclone.R;
import com.cevin.umuclone.components.CustomOnItemClickListener;
import com.cevin.umuclone.profile.model.ModelProfile;

import java.util.ArrayList;

public class CardViewProfileAdapter extends RecyclerView.Adapter<CardViewProfileAdapter.CardViewViewHolder> {
    Context context;
    private ArrayList<ModelProfile> listProfile;

    public ArrayList<ModelProfile> getListProfile() {
        return listProfile;
    }

    public void setListProfile(ArrayList<ModelProfile> listProfile) {
        this.listProfile = listProfile;
    }

    public CardViewProfileAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewProfileAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_profile, viewGroup, false);

        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewProfileAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        ModelProfile m = getListProfile().get(i);

        cardViewViewHolder.textViewSettings.setText(m.getSettingsName());
        cardViewViewHolder.imageViewSettingsDetail.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context,"Ke detail settings " + getListProfile().get(position).getSettingsName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListProfile().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        TextView textViewSettings;
        ImageView imageViewSettingsDetail;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewSettings = itemView.findViewById(R.id.textView_profile_settings);
            imageViewSettingsDetail = itemView.findViewById(R.id.imageView_profile_detail);
        }
    }
}
