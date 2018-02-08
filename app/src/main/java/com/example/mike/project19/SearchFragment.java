package com.example.mike.project19;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Fragment;

/**
 * Created by mike on 08.02.2018.
 */

//public class SearchFragment {
//}

public class SearchFragment extends Fragment {

    private EditText mSearchEditText;
    private Button mButtonSearch;

    public static SearchFragment newInstance() {
        Bundle args = new Bundle();

        SearchFragment fragment = new SearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private View.OnClickListener mOnButtonSearchClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //button search pressed
            Toast.makeText(getActivity(), "ПоИсК", Toast.LENGTH_LONG).show();
            String s1 = "http://www.google.com/search?q=";
            String url01 = s1.concat(mSearchEditText.getText().toString());
            //showMessage(url01);
            Uri address = Uri.parse(url01);
            Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlinkIntent);


        }
     };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_search, container, false);

        mSearchEditText = v.findViewById(R.id.etSearchFrag1);
        mButtonSearch = v.findViewById(R.id.buttonSearch1);

        mButtonSearch.setOnClickListener(mOnButtonSearchClickListener);
        return v;


        //return super.onCreateView(name, context, attrs);
    }
}
