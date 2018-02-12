package com.example.mike.project19;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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



public class SearchFragment extends Fragment {

    private EditText mSearchEditText;
    private Button mButtonSearch;


    private SharedPreferences mSharedPreferencesHelper;

    public static final String MY_SETTINGS = "my_settings";
    public static final String KEY_RADIOBUTTON_INDEX = "KEY_RADIOBUTTON_INDEX";

    public static SearchFragment newInstance() {
        Bundle args = new Bundle();
        SearchFragment fragment = new SearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private View.OnClickListener mOnButtonSearchClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            mSharedPreferencesHelper = getActivity().getSharedPreferences(MY_SETTINGS, Context.MODE_PRIVATE);
            int sIndex = mSharedPreferencesHelper.getInt(KEY_RADIOBUTTON_INDEX,0);
            String s1 = "";
            switch (sIndex){
                case 1:
                    s1 = "http://www.google.com/search?q=";
                    break;
                case 2:
                    s1 = "https://yandex.ru/search/?text=";
                    break;
                case 3:
                    s1 = "https://www.bing.com/search?q=";
                    break;
                default:
                    break;
            }
            Uri address = Uri.parse(s1.concat(mSearchEditText.getText().toString()));
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

    }
}
