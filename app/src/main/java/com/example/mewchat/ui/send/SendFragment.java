package com.example.mewchat.ui.send;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mewchat.Home;
import com.example.mewchat.select;

public class SendFragment extends Fragment {


    private SendViewModel sendViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        ((Home) getActivity()).getSupportActionBar().setTitle("Peaky Boys Chat");

        Intent intent = new Intent(SendFragment.this.getActivity(), select.class);
        startActivity(intent);
        return null;
    }
}