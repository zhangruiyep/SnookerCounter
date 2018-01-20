package com.example.android.snookercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int score_1p;
    private int score_2p;

    private void display_1p_score() {
        TextView textView = findViewById(R.id.score_1p_text);
        textView.setText(String.valueOf(score_1p));
    }

    private void add_1p_score(int value) {
        score_1p += value;
        display_1p_score();
    }

    private void display_2p_score() {
        TextView textView = findViewById(R.id.score_2p_text);
        textView.setText(String.valueOf(score_2p));
    }

    private void add_2p_score(int value) {
        score_2p += value;
        display_2p_score();
    }

    public void red_2p(View view) {
        add_2p_score(1);
    }

    public void yellow_2p(View view) {
        add_2p_score(2);
    }

    public void green_2p(View view) {
        add_2p_score(3);
    }

    public void brown_2p(View view) {
        add_2p_score(4);
    }

    public void blue_2p(View view) {
        add_2p_score(5);
    }

    public void pink_2p(View view) {
        add_2p_score(6);
    }

    public void black_2p(View view) {
        add_2p_score(7);
    }

    public void foul_2p(View view) {
        Spinner sp1 = findViewById(R.id.spinner_2p_foul_value);

        add_1p_score(Integer.parseInt(sp1.getSelectedItem().toString()));
    }

    public void red_1p(View view) {
        add_1p_score(1);
    }

    public void yellow_1p(View view) {
        add_1p_score(2);
    }

    public void green_1p(View view) {
        add_1p_score(3);
    }

    public void brown_1p(View view) {
        add_1p_score(4);
    }

    public void blue_1p(View view) {
        add_1p_score(5);
    }

    public void pink_1p(View view) {
        add_1p_score(6);
    }

    public void black_1p(View view) {
        add_1p_score(7);
    }

    public void foul_1p(View view) {
        Spinner sp1 = findViewById(R.id.spinner_1p_foul_value);

        add_2p_score(Integer.parseInt(sp1.getSelectedItem().toString()));
    }

    public void scoreReset(View view) {
        score_1p = 0;
        score_2p = 0;
        display_1p_score();
        display_2p_score();
    }
}
