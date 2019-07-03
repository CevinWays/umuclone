package com.cevin.umuclone.profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cevin.umuclone.R;
import com.cevin.umuclone.profile.model.ModelProfile;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {
    private TextView textViewName;
    private RecyclerView recyclerViewProfile;
    private ArrayList<ModelProfile> list = new ArrayList<>();

    public ProfileFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        textViewName = view.findViewById(R.id.textView_avatar_name);
        recyclerViewProfile = view.findViewById(R.id.recycleView_profile);

        textViewName.setText(getResources().getString(R.string.text_name_user));

        list.addAll(SettingsProfileData.getListData());
        showRecycleCardView();

        return view;
    }

    private void showRecycleCardView() {
        recyclerViewProfile.setLayoutManager(new LinearLayoutManager(this.getContext()));
        CardViewProfileAdapter cardViewProfileAdapter = new CardViewProfileAdapter(this.getContext());
        cardViewProfileAdapter.setListProfile(list);
        recyclerViewProfile.setAdapter(cardViewProfileAdapter);
    }
}
