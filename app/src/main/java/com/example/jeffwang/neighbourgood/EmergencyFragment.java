package com.example.jeffwang.neighbourgood;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jeff Wang on 2015/9/25.
 */
public class EmergencyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.emergency,container,false);
    }

//    public void emergencyDialog(View view) {
//        FragmentManager fragmentManager = getFragmentManager();
//        EmergencyDialog emergencyDialog = new EmergencyDialog();
//        emergencyDialog.show(fragmentManager,"EmergencyDialog");
//    }
}
