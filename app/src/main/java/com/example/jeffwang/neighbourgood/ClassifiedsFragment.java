package com.example.jeffwang.neighbourgood;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Jeff Wang on 2015/9/25.
 */
public class ClassifiedsFragment extends Fragment {
//    Spinner spinner;
//    ArrayAdapter<CharSequence> arrayAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.classifieds,container,false);
//        spinner = (Spinner) findViewById(R.id.spinner);
//        arrayAdapter = ArrayAdapter.createFromResource(this,R.array.Category,android.R.layout.simple_spinner_item);
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(arrayAdapter);
    }
}
