package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeToTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoToTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneToTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeToTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoToTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneToTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        Button scoreResetButton = findViewById(R.id.score_reset_btn);
        TextView finalScoreTextView = findViewById(R.id.final_score_textView);

        String scoreResetBtn = scoreResetButton.getText().toString();

        if (scoreResetBtn.equals("Score")) {
            finalScoreTextView.setVisibility(View.VISIBLE);
            scoreResetButton.setText("Reset");

            if (scoreTeamA > scoreTeamB) {
                finalScoreTextView.setText("Pobjednik je\nTEAM A");

            } else if (scoreTeamB > scoreTeamA) {

                finalScoreTextView.setText("Pobjednik je\nTEAM B");

            } else
                finalScoreTextView.setText("NEMA\nPOBJEDNIKA");

            return;
        }
        if (scoreResetBtn.equals("Reset")) {

            finalScoreTextView.setVisibility(View.INVISIBLE);
            finalScoreTextView.setText("");
            scoreResetButton.setText("Score");

            scoreTeamB = 0;
            scoreTeamA = 0;

            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
    }
}
