package com.example.ait;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;

public class SettingsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.settings_fragment, container, false);

        requireActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.white, requireActivity().getTheme()));
        Toolbar toolbar = rootView.findViewById(R.id.toolbar);
        toolbar.setTitle("Настройки");

        return rootView;
    }
}