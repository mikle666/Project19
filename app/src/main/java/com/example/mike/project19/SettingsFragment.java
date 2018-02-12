package com.example.mike.project19;

import android.content.Context;
import android.content.SharedPreferences;
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

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by mike on 06.02.2018.
 */

public class SettingsFragment extends Fragment{
    private TextView mTextViewSettings1;
    private RadioGroup mRadioGroup;
    private RadioButton mGoogleRB;
    private RadioButton mYandexRB;
    private RadioButton mBingRB;


    public static final String MY_SETTINGS = "my_settings";
    public static final String KEY_RADIOBUTTON_INDEX = "KEY_RADIOBUTTON_INDEX";

    private SharedPreferences mSharedPreferencesHelper;

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
        mGoogleRB = v.findViewById(R.id.google1);
        mYandexRB = v.findViewById(R.id.yandex1);
        mBingRB = v.findViewById(R.id.bing1);

        mSharedPreferencesHelper = getActivity().getSharedPreferences(MY_SETTINGS, Context.MODE_PRIVATE);
        int sIndex = mSharedPreferencesHelper.getInt(MainActivity.KEY_RADIOBUTTON_INDEX,0);
        //Toast.makeText(getActivity(),Integer.toString(sIndex) , Toast.LENGTH_LONG).show();
        switch (sIndex){
            case 0:
                mRadioGroup.clearCheck();
                break;
            case 1:
                mRadioGroup.check(mGoogleRB.getId());
                break;
            case 2:
                mRadioGroup.check(mYandexRB.getId());
                break;
            case 3:
                mRadioGroup.check(mBingRB.getId());
                break;
            default:
                break;
        }
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case -1:
                        Toast.makeText(getActivity(), "Ничего не выбрано", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.google1:
                       // Toast.makeText(getActivity(), "GOOGLE", Toast.LENGTH_SHORT).show();
                        mSharedPreferencesHelper.edit().putInt(KEY_RADIOBUTTON_INDEX,1).commit();
                        break;
                    case R.id.yandex1:
                        //Toast.makeText(getActivity(), "YANDEX", Toast.LENGTH_SHORT).show();
                        mSharedPreferencesHelper.edit().putInt(MainActivity.KEY_RADIOBUTTON_INDEX,2).commit();
                        break;
                    case R.id.bing1:
                        //Toast.makeText(getActivity(), "BING", Toast.LENGTH_SHORT).show();
                        mSharedPreferencesHelper.edit().putInt(MainActivity.KEY_RADIOBUTTON_INDEX,3).commit();
                        break;

                    default:
                        break;
                }
            }
        });
        return v;
    }
}
