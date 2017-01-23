package com.abuosama.sharedpreferencesshowdatainfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


   public void catachData(){

       FragmentTwo two=new FragmentTwo();

       FragmentManager manager=getSupportFragmentManager();
       FragmentTransaction transaction=manager.beginTransaction();
       transaction.replace(R.id.container1,two);
       transaction.addToBackStack(null);
       transaction.commit();

//
//        Bundle bundle=new Bundle();
//        bundle.putString("name",name);
//        bundle.putString("pass",pass);
//        FragmentTwo two=new FragmentTwo();
//        two.setArguments(bundle);
//
//
//
//
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentOne fragmentOne=new FragmentOne();
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.container1,fragmentOne);
        transaction.commit();

    }
}
