package com.example.knowyourfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

public class Frag1 extends Fragment {

    Button btnColor;
    LinearLayout linearOne;

    ImageView iv;
    Integer i = 0;

    public Frag1() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag1, container, false);

        btnColor = view.findViewById(R.id.btnColour1);
        linearOne = view.findViewById(R.id.linearOne);

        iv = view.findViewById(R.id.iv);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    linearOne.setBackgroundColor(Color.GRAY);
                    i = 1;
                } else {
                    linearOne.setBackgroundColor(Color.DKGRAY);
                    i = 0;
                }
            }
        });


        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(getActivity()).load(imageUrl).into(iv);

        return view;
    }

}
