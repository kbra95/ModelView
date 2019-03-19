package com.example.viewmodels;

import android.arch.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    int scoreTeamA =0;
    int scoreTeamB =0;

    String title ="";
    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }
}
