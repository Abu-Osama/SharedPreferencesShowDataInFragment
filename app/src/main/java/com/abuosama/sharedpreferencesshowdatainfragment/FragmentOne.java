package com.abuosama.sharedpreferencesshowdatainfragment;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {


       EditText et1,et2;
       Button b1,b2;
    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v= inflater.inflate(R.layout.fragment_fragment_one, container, false);


        et1 = (EditText) v.findViewById(R.id.edittext1);
        et2 = (EditText) v.findViewById(R.id.edittext2);
        b1 = (Button) v.findViewById(R.id.button1);
        b2 = (Button) v.findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences=getActivity().getSharedPreferences("credentials",0);
                SharedPreferences.Editor editor=sharedPreferences.edit();//open editor
                editor.putString("name",et1.getText().toString());
                editor.putString("pw",et2.getText().toString());
                editor.commit();

//                MainActivity mainActivity= (MainActivity) getActivity();
//                mainActivity.catachData(et1.getText().toString(),et2.getText().toString());

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity mainActivity= (MainActivity) getActivity();
               mainActivity.catachData();

            }
        });


        return v;

    }

}
