package com.example.trafficito.ui.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.trafficito.R;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Find the LinearLayouts for each action
        LinearLayout issueNewCitations = view.findViewById(R.id.issue_new_citations);
        LinearLayout viewAllCitations = view.findViewById(R.id.view_all_citations);

        // Set click listeners for each action
        issueNewCitations.setOnClickListener(v -> {
            // Navigate to the Citation Issuing Fragment or Activity
            NavController navController = Navigation.findNavController(view);
            navController.navigate(R.id.action_homeFragment_to_issueCitationsFragment);
        });

        viewAllCitations.setOnClickListener(v -> {
            // Navigate to the Citations List Fragment or Activity
            NavController navController = Navigation.findNavController(view);
            navController.navigate(R.id.action_homeFragment_to_citationsListFragment);
        });
    }
}
