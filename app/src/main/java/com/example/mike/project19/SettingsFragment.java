package com.example.mike.project19;

import android.os.Bundle;
import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Fragment;

/**
 * Created by mike on 06.02.2018.
 */

public class SettingsFragment extends Fragment{
    private TextView mTextViewSettings1;
    private RadioGroup mRadioGroup;
    private RadioButton mGoogleRB;
    private RadioButton mYandexRB;
    private RadioButton mBingRB;

    //private RadioGroup


    public static SettingsFragment newInstance() {
        Bundle args = new Bundle();

        SettingsFragment fragment = new SettingsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_settings, container, false);
        mTextViewSettings1 = v.findViewById(R.id.tvSettingsFrag1);
        mRadioGroup = v.findViewById(R.id.radioGroup);
        //mRadioGroup.setOnCheckedChangeListener();
        mGoogleRB = v.findViewById(R.id.google1);
        mYandexRB = v.findViewById(R.id.yandex1);
        mBingRB = v.findViewById(R.id.bing1);

        mRadioGroup.clearCheck();

        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case -1:
                        Toast.makeText(getActivity(), "Ничего не выбрано",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.google1:
                        Toast.makeText(getActivity(), "GOOGLE",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.yandex1:
                        Toast.makeText(getActivity(), "YANDEX",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bing1:
                        Toast.makeText(getActivity(), "BING",
                                Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        break;
                }
            }
        });


        return v;


        //return super.onCreateView(name, context, attrs);
    }
}
