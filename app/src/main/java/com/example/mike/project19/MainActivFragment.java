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

//public class MainActivFragment {
//}

public class MainActivFragment extends Fragment {
    private TextView mTextViewMainFrag1;
    //private Button mButtonSearch;

    public static MainActivFragment newInstance() {
        Bundle args = new Bundle();

        MainActivFragment fragment = new MainActivFragment();
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
        View v = inflater.inflate(R.layout.fr_main, container, false);
        mTextViewMainFrag1 = v.findViewById(R.id.tvMainFrag1);
        // mButtonSearch = v.findViewById(R.id.buttonSearch1);

        //mButtonSearch.setOnClickListener(mOnButtonSearchClickListener);
        return v;


        //return super.onCreateView(name, context, attrs);
    }
}
