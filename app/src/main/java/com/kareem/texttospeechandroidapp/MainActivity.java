package com.kareem.texttospeechandroidapp;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kareem.texttospeechandroidapp.utls.ArabicTTS;

public class MainActivity extends AppCompatActivity {

    private ArabicTTS tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(getResources().getString(R.string.main_title_txt));

        // Defining views
        Button read = (Button) findViewById(R.id.read);
        Button clear = (Button) findViewById(R.id.clear);
        final EditText input = (EditText) findViewById(R.id.editText1);

        // Creating a new object of the ArabicTTS librrary
        tts = new ArabicTTS();
        // Preparing the language
        tts.prepare(this);


        // On read click
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ip = input.getText().toString();
                if (ip != null && !ip.equals("")) {
                    // To read the text inserted
                    tts.talk(ip);
                }
            }
        });

        // Clear the EditText
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.header, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.symbols_btn) {
            Intent intent = new Intent(getBaseContext(),SymbolsActivity.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}
