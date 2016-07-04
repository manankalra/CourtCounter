package io.github.manankalra.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA = 0;
    int scoreB = 0;

    public void plusThreeA(View view){
        scoreA += 3;
        displayA(scoreA);
    }
    public void plusTwoA(View view){
        scoreA += 2;
        displayA(scoreA);
    }
    public void plusOneA(View view){
        scoreA += 1;
        displayA(scoreA);
    }
    public void plusThreeB(View view){
        scoreB += 3;
        displayB(scoreB);
    }
    public void plusTwoB(View view){
        scoreB += 2;
        displayB(scoreB);
    }
    public void plusOneB(View view){
        scoreB += 1;
        displayB(scoreB);
    }
    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.zero_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayB(int number) {
        TextView quantityTextViewb = (TextView) findViewById(
                R.id.zero_text_viewb);
        quantityTextViewb.setText("" + number);
    }

}
