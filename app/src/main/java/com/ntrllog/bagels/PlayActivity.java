package com.ntrllog.bagels;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PlayActivity extends AppCompatActivity {

    private int numDigits = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_layout);

        this.numDigits = getIntent().getIntExtra("NUM_DIGITS", 3);

        /* set activity title */
        switch (this.numDigits) {
            case 3:
                getSupportActionBar().setTitle(R.string.easy);
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.easyButton)));
                break;
            case 4:
                getSupportActionBar().setTitle(R.string.medium);
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.mediumButton)));
                break;
            case 5:
                getSupportActionBar().setTitle(R.string.hard);
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.hardButton)));
                break;
            case 6:
                getSupportActionBar().setTitle(R.string.impossible);
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.impossibleButton)));
                break;
        }

        /* display instructions */
        TextView instructionsTextView = findViewById(R.id.instructions);
        String instructions = getString(R.string.instructions, this.numDigits);
        instructionsTextView.setText(instructions);
    }
}