package com.juandiego.eventosgarzon.fragments;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.juandiego.eventosgarzon.R;
import com.juandiego.eventosgarzon.LoginActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConfigFragment extends Fragment {

    Button b1;

    public ConfigFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V = inflater.inflate(R.layout.fragment_config, container, false);
        b1=V.findViewById(R.id.fcBtnAdmin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LoginActivity.class));
            }
        });
        return V;
    }


    public interface OnFragmentInteractionListener {
    }
}
