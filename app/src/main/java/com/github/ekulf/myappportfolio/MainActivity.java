package com.github.ekulf.myappportfolio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotify = (Button) findViewById(R.id.spotify_streamer);
        spotify.setOnClickListener(this);

        Button scores = (Button) findViewById(R.id.scores);
        scores.setOnClickListener(this);

        Button library = (Button) findViewById(R.id.library);
        library.setOnClickListener(this);

        Button bib = (Button) findViewById(R.id.builder_it_bigger);
        bib.setOnClickListener(this);

        Button reader = (Button) findViewById(R.id.reader);
        reader.setOnClickListener(this);

        Button capstone = (Button) findViewById(R.id.capstone);
        capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getTag() instanceof Intent) {
            startActivity((Intent) v.getTag());
        } else {
            showMissingAppToast(v);
        }
    }

    private void showMissingAppToast(View view) {
        if (view instanceof Button) {
            Button button = (Button) view;
            Toast.makeText(
                    this,
                    getString(R.string.taost_missing_app, button.getText()),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
