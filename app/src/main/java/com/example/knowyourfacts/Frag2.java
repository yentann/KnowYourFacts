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



public class Frag2 extends Fragment {

    Button btnColor;
    LinearLayout lineartwo;

    ImageView iv;
    Integer i = 0;

    public Frag2() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag2, container,false);

        btnColor = view.findViewById(R.id.btnColourTwo);
        iv = view.findViewById(R.id.ivTwo);
        lineartwo = view.findViewById(R.id.linearTwo);


        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    lineartwo.setBackgroundColor(Color.YELLOW);
                    i = 1;
                } else {
                    lineartwo.setBackgroundColor(Color.GREEN);
                    i = 0;
                }
            }
        });

        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(getActivity()).load(imageUrl).into(iv);

        return view;
    }
    }
