package com.trykb.infotainmentbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.trykb.infotainmentbook.R;

public class FragmentUnitedKingdom extends Fragment {

    private ImageView imageViewUnitedKingdom;
    private ProgressBar progressBarUnitedKingdom;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_united_kingdom,container,false);

        imageViewUnitedKingdom = view.findViewById(R.id.imageViewUnitedKingdom);
        progressBarUnitedKingdom = view.findViewById(R.id.progressBarUnitedKingdom);

        return view;
    }
}
