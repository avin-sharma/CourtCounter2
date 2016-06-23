package com.avinsharma.courtcounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        /**
         * Team A functions for display and updating of score
         */

    public void displayForTeamA(int score) {
        TextView scoreA = (TextView) findViewById(R.id.team_a_score);
        scoreA.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    public void addTwoForTeamA(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void addOneForTeamA(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    /**
     * Team B functions for display and score update
     */

    public void displayForTeamB(int score) {
        TextView scoreB = (TextView) findViewById(R.id.team_b_score);
        scoreB.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void addTwoForTeamB(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void addOneForTeamB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    /**
     * RESET BUTTON
     */
    public void reset(View view) {
        displayForTeamA(0);
        displayForTeamB(0);
        scoreA = 0;
        scoreB = 0;
    }

}
