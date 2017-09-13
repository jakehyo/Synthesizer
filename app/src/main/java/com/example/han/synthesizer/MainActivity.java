package com.example.han.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

import java.util.ArrayList;

/**
 *
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int WHOLE_NOTE = 1000;

    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton, haButton, hasButton, hbButton, hcButton, hcsButton, hdButton, hdsButton, heButton, music, repeat;
    private ArrayList<MediaPlayer> notes =new ArrayList<MediaPlayer>();
    private NumberPicker notePicker;
    private NumberPicker repeatPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setPickers();
        setListeners();
        createMediaPlayers();
    }

    private void setPickers() {
        notePicker.setMinValue(0);
        notePicker.setMaxValue(19);
        notePicker.setDisplayedValues(new String[]{"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "High A", "High A#", "High B", "High C", "High C#", "High D", "High D#", "High E"});
        repeatPicker.setMinValue(1);
        repeatPicker.setMaxValue(20);


    }

    private void delay(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }


    private void createMediaPlayers() {
        MediaPlayer aNote = MediaPlayer.create(this, R.raw.scalea);
        MediaPlayer asNote = MediaPlayer.create(this, R.raw.scalebb);
        MediaPlayer bNote = MediaPlayer.create(this, R.raw.scaleb);
        MediaPlayer cNote = MediaPlayer.create(this, R.raw.scalec);
        MediaPlayer csNote = MediaPlayer.create(this, R.raw.scalecs);
        MediaPlayer dNote = MediaPlayer.create(this, R.raw.scaled);
        MediaPlayer dsNote = MediaPlayer.create(this, R.raw.scaleds);
        MediaPlayer eNote = MediaPlayer.create(this, R.raw.scalee);
        MediaPlayer fNote = MediaPlayer.create(this, R.raw.scalef);
        MediaPlayer fsNote = MediaPlayer.create(this, R.raw.scalefs);
        MediaPlayer gNote = MediaPlayer.create(this, R.raw.scaleg);
        MediaPlayer gsNote = MediaPlayer.create(this, R.raw.scalegs);
        MediaPlayer haNote = MediaPlayer.create(this, R.raw.scalehigha);
        MediaPlayer hasNote = MediaPlayer.create(this, R.raw.scalehighbb);
        MediaPlayer hbNote = MediaPlayer.create(this, R.raw.scalehighb);
        MediaPlayer hcNote = MediaPlayer.create(this, R.raw.scalehighc);
        MediaPlayer hcsNote = MediaPlayer.create(this, R.raw.scalehighcs);
        MediaPlayer hdNote = MediaPlayer.create(this, R.raw.scalehighd);
        MediaPlayer hdsNote = MediaPlayer.create(this, R.raw.scalehighds);
        MediaPlayer heNote = MediaPlayer.create(this, R.raw.scalehighe);
        notes.add(aNote);
        notes.add(asNote);
        notes.add(bNote);
        notes.add(cNote);
        notes.add(csNote);
        notes.add(dNote);
        notes.add(dsNote);
        notes.add(eNote);
        notes.add(fNote);
        notes.add(fsNote);
        notes.add(gNote);
        notes.add(gsNote);
        notes.add(haNote);
        notes.add(hasNote);
        notes.add(hbNote);
        notes.add(hcNote);
        notes.add(hcsNote);
        notes.add(hdNote);
        notes.add(hdsNote);
        notes.add(heNote);
    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        haButton.setOnClickListener(this);
        hasButton.setOnClickListener(this);
        hbButton.setOnClickListener(this);
        hcButton.setOnClickListener(this);
        hcsButton.setOnClickListener(this);
        hdButton.setOnClickListener(this);
        hdsButton.setOnClickListener(this);
        heButton.setOnClickListener(this);
        music.setOnClickListener(this);
        repeat.setOnClickListener(this);

    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a2);
        asButton = (Button) findViewById(R.id.button_as2);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        haButton = (Button) findViewById(R.id.button_ha);
        hasButton = (Button) findViewById(R.id.button_has);
        hbButton = (Button) findViewById(R.id.button_hb);
        hcButton = (Button) findViewById(R.id.button_hc);
        hcsButton = (Button) findViewById(R.id.button_hcs);
        hdButton = (Button) findViewById(R.id.button_hd);
        hdsButton = (Button) findViewById(R.id.button_hds);
        heButton = (Button) findViewById(R.id.button_he);
        music = (Button) findViewById(R.id.button_music);
        repeat = (Button) findViewById(R.id.button_rep);
        notePicker = (NumberPicker) findViewById(R.id.picker_note);
        repeatPicker = (NumberPicker) findViewById(R.id.picker_rep);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_a2:
                notes.get(0).seekTo(0); //restarts note to the beginning
                notes.get(0).start();
                break;
            case R.id.button_as2:
                notes.get(1).seekTo(0); //restarts note to the beginning
                notes.get(1).start();
                break;
            case R.id.button_b:
                notes.get(2).seekTo(0); //restarts note to the beginning
                notes.get(2).start();
                break;
            case R.id.button_c:
                notes.get(3).seekTo(0); //restarts note to the beginning
                notes.get(3).start();
                break;
            case R.id.button_cs:
                notes.get(4).seekTo(0); //restarts note to the beginning
                notes.get(4).start();
                break;
            case R.id.button_d:
                notes.get(5).seekTo(0); //restarts note to the beginning
                notes.get(5).start();
                break;
            case R.id.button_ds:
                notes.get(6).seekTo(0); //restarts note to the beginning
                notes.get(6).start();
                break;
            case R.id.button_e:
                notes.get(7).seekTo(0); //restarts note to the beginning
                notes.get(7).start();
                break;
            case R.id.button_f:
                notes.get(8).seekTo(0); //restarts note to the beginning
                notes.get(8).start();
                break;
            case R.id.button_fs:
                notes.get(9).seekTo(0); //restarts note to the beginning
                notes.get(9).start();
                break;
            case R.id.button_g:
                notes.get(10).seekTo(0); //restarts note to the beginning
                notes.get(10).start();
                break;
            case R.id.button_gs:
                notes.get(11).seekTo(0); //restarts note to the beginning
                notes.get(11).start();
                break;
            case R.id.button_ha:
                notes.get(12).seekTo(0); //restarts note to the beginning
                notes.get(12).start();
                break;
            case R.id.button_has:
                notes.get(13).seekTo(0); //restarts note to the beginning
                notes.get(13).start();
                break;
            case R.id.button_hb:
                notes.get(14).seekTo(0); //restarts note to the beginning
                notes.get(14).start();
                break;
            case R.id.button_hc:
                notes.get(15).seekTo(0); //restarts note to the beginning
                notes.get(15).start();
                break;
            case R.id.button_hcs:
                notes.get(16).seekTo(0); //restarts note to the beginning
                notes.get(16).start();
                break;
            case R.id.button_hd:
                notes.get(17).seekTo(0); //restarts note to the beginning
                notes.get(17).start();
                break;
            case R.id.button_hds:
                notes.get(18).seekTo(0); //restarts note to the beginning
                notes.get(18).start();
                break;
            case R.id.button_he:
                notes.get(19).seekTo(0); //restarts note to the beginning
                notes.get(19).start();
                break;
            case R.id.button_music:
                notes.get(0).seekTo(0);
                notes.get(0).start();
                delay(WHOLE_NOTE);

                notes.get(0).seekTo(0);
                notes.get(0).start();
                delay(WHOLE_NOTE);

                notes.get(7).seekTo(0);
                notes.get(7).start();
                delay(WHOLE_NOTE);

                notes.get(7).seekTo(0);
                notes.get(7).start();
                delay(WHOLE_NOTE);

                notes.get(9).seekTo(0);
                notes.get(9).start();
                delay(WHOLE_NOTE);

                notes.get(9).seekTo(0);
                notes.get(9).start();
                delay(WHOLE_NOTE);

                notes.get(7).seekTo(0);
                notes.get(7).start();
                delay(WHOLE_NOTE*2);

                notes.get(5).seekTo(0);
                notes.get(5).start();
                delay(WHOLE_NOTE);

                notes.get(5).seekTo(0);
                notes.get(5).start();
                delay(WHOLE_NOTE);

                notes.get(4).seekTo(0);
                notes.get(4).start();
                delay(WHOLE_NOTE);

                notes.get(4).seekTo(0);
                notes.get(4).start();
                delay(WHOLE_NOTE);

                notes.get(2).seekTo(0);
                notes.get(2).start();
                delay(WHOLE_NOTE);

                notes.get(2).seekTo(0);
                notes.get(2).start();
                delay(WHOLE_NOTE);

                notes.get(0).seekTo(0);
                notes.get(0).start();
                delay(WHOLE_NOTE*2);
                break;
            case R.id.button_rep:
                playNote();
                break;

            //the else statement basically
        }
    }

    private void playNote() {
        int x = repeatPicker.getValue();
        int i = 0;
        MediaPlayer note = notes.get(notePicker.getValue());
        while (i < x)
        {
            note.seekTo(0);
            note.start();
            delay(WHOLE_NOTE/2);
            i++;
        }



    }

    private void note(String note, int time){

    }


}
