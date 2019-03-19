package com.example.viewmodels;

import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String TEAM_A = "teamA";
    static final String TEAM_B = "teamB";

    TextView scoreTextForA;
    TextView scoreTextForB;

    private ScoreViewModel mViewModel;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTextForA = findViewById(R.id.textview_team_a);
        scoreTextForB = findViewById(R.id.textview_team_b);

        mViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        // Check whether we're recreating a previously destroyed instance


        displayForTeamA(mViewModel.scoreTeamA);
        displayForTeamB(mViewModel.scoreTeamB);

        Intent intent = getIntent();
        String country = intent.getStringExtra("country");
        TextView titleTextView = findViewById(R.id.textview_title);
        titleTextView.setText(country.toString());






    }

    private void displayForTeamB(int scoreTeamB) {
        scoreTextForB.setText(scoreTeamB +"");

    }

    private void displayForTeamA(int scoreTeamA) {
        scoreTextForA.setText(scoreTeamA +"");
    }


    public void addThreeForTeamA(View view) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA +3;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA +2;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addOneForTeamA(View view) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA +1;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addThreeForTeamB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB +3;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB +2;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB +1;
        displayForTeamB(mViewModel.scoreTeamB);
    }
}
