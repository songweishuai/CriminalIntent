package com.sws.criminalintent;


import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//public class CrimeActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//
//        FragmentManager fm=getFragmentManager();
//        Fragment fragment=fm.findFragmentById(R.id.fragment_container);
//        if(fragment==null){
//            fragment=new CrimeFragment();
//            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
//        }
//
//    }
//}

public class CrimeActivity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
