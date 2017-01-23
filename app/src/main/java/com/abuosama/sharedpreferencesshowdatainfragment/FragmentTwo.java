package com.abuosama.sharedpreferencesshowdatainfragment;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

      TextView textView1,textView2;

    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment_two, container, false);

        textView1 = (TextView) v.findViewById(R.id.textview1);
        textView2 = (TextView) v.findViewById(R.id.textview2);
        // we have to read data from preference file here
        SharedPreferences sp=getActivity().getSharedPreferences("credentials",0);
        String v1=sp.getString("name",null);
        String v2=sp.getString("pw",null);
        textView1.setText("name :"+v1);
        textView1.setText("pass :"+v2);

        return v;
    }

}
