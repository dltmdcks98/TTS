package com.example.tts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SpeakOut extends AppCompatActivity {
    Button btnspeakout;
    EditText edtTexttoSpeak;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speakout);
        btnspeakout = (Button) findViewById(R.id.btnspeakout);
        edtTexttoSpeak = (EditText) findViewById(R.id.edtTexttoSpeak);
        btnspeakout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //접근성 메뉴로 이동
                Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
                startActivity(intent);
            }
        });
    }
}
