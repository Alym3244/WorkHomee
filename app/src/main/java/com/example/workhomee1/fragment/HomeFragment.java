package com.example.workhomee1.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.workhomee1.R;
import com.example.workhomee1.databinding.FragmentHomeBinding;
import com.example.workhomee1.utils.Constants;

import org.jetbrains.annotations.NotNull;


public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null){
            String s = getArguments().getString(Constants.USER_TASK);
        }
        binding.addFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(requireView()).navigate(R.id.createTaskFragment);
            }

        });

    }
    private void getText(String  userTask,int ololo){

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}