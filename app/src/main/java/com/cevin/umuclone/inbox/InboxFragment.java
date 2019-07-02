package com.cevin.umuclone.inbox;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cevin.umuclone.R;
import com.cevin.umuclone.inbox.model.ModelInbox;

import java.util.ArrayList;

public class InboxFragment extends Fragment {

    TextView textViewToolbar;
    private RecyclerView recyclerViewInbox;
    private ArrayList<ModelInbox> list = new ArrayList<>();

    public InboxFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inbox, container, false);

        textViewToolbar = view.findViewById(R.id.textView_toolbar);
        recyclerViewInbox = view.findViewById(R.id.recycleView_inbox);

        textViewToolbar.setText("Inbox");

        list.addAll(InboxData.getListData());
        showRecycleCardView();

        Log.d("inboxfrag", String.valueOf(list));

        return view;
    }

    private void showRecycleCardView() {
        recyclerViewInbox.setLayoutManager(new LinearLayoutManager(this.getContext()));
        CardViewInboxAdapter cardViewInboxAdapter = new CardViewInboxAdapter(this.getContext());
        cardViewInboxAdapter.setListInbox(list);
        recyclerViewInbox.setAdapter(cardViewInboxAdapter);

    }
}
