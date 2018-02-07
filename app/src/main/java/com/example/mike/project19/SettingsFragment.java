package com.example.mike.project19;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by mike on 06.02.2018.
 */

public class SettingsFragment extends Fragment{
    private TextView mTextViewSettings1;
    //private Button mButtonSearch;

    public static SearchFragment newInstance() {
        Bundle args = new Bundle();

        SearchFragment fragment = new SearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    //private View.OnClickListener mOnButtonSearchClickListener = new View.OnClickListener() {
    //    @Override
    //    public void onClick(View v) {
    //        //button search pressed
    //    }
   // };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_search, container, false);
        mTextViewSettings1 = v.findViewById(R.id.tvSettingsFrag1);
       // mButtonSearch = v.findViewById(R.id.buttonSearch1);

        //mButtonSearch.setOnClickListener(mOnButtonSearchClickListener);
        return v;


        //return super.onCreateView(name, context, attrs);
    }
}
