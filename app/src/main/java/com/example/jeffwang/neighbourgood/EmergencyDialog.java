package com.example.jeffwang.neighbourgood;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jeff Wang on 2015/9/26.
 */
public class EmergencyDialog extends DialogFragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.emergency_dialog,container,false);
    }
}
