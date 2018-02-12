package com.example.mike.project19;

import android.os.Bundle;
import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Fragment;
/**
 * Created by mike on 08.02.2018.
 */

public class MainActivFragment extends Fragment {
    private TextView mTextViewMainFrag1;


    public static MainActivFragment newInstance() {
        Bundle args = new Bundle();

        MainActivFragment fragment = new MainActivFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_main, container, false);
        mTextViewMainFrag1 = v.findViewById(R.id.tvMainFrag1);
        return v;

    }
}
