package com.example.workhomee1.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.workhomee1.R;
import com.example.workhomee1.databinding.FragmentCreateTaskBinding;
import com.example.workhomee1.databinding.FragmentHomeBinding;
import com.example.workhomee1.utils.Constants;


public class CreateTaskFragment extends Fragment {

    FragmentCreateTaskBinding binding;
    String userTask;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentCreateTaskBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userTask = binding.taskEd.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString(Constants.USER_TASK, userTask);
                Navigation.findNavController(requireView()).navigate(R.id.homeFragment,bundle);
                Toast.makeText(getContext(), "" +  bundle.getString(Constants.USER_TASK, userTask), Toast.LENGTH_SHORT).show();
            }
        });

    }

}