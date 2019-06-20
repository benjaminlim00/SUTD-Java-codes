package com.example.piano;

import javax.sound.midi.MidiUnavailableException;
import com.example.midi.Midi;
import music.Pitch;
import com.example.music.NoteEvent;


import java.util.ArrayList;


public class PianoMachine {

	private Midi midi;
    public int currentOctave = 0;
    public midi.Instrument currentInstrument = Midi.DEFAULT_INSTRUMENT;
    public boolean isRecording = false;
    public ArrayList<NoteEvent> recording = new ArrayList<>();
    private ArrayList<Pitch> isPlaying;

	/**
	 * constructor for PianoMachine.
	 * 
	 * initialize midi device and any other state that we're storing.
	 */


    public PianoMachine() {
        isPlaying = new ArrayList<>();
    	try {
            midi = Midi.getInstance();
        } catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }
    
    //TODO write method spec
    public void beginNote(Pitch rawPitch) {

        if (!isPlaying.contains(rawPitch)) {
            isPlaying.add(rawPitch);
            midi.beginNote(rawPitch.transpose(currentOctave).toMidiFrequency(), currentInstrument);

            if (isRecording) {
                recording.add(new NoteEvent(rawPitch.transpose(currentOctave), System.currentTimeMillis(), currentInstrument, NoteEvent.Kind.start));
            }
        }
    }




    
    //TODO write method spec
    public void endNote(Pitch rawPitch) {
        if (isPlaying.contains(rawPitch)) {
            isPlaying.remove(rawPitch);
            midi.endNote(rawPitch.transpose(currentOctave).toMidiFrequency(), currentInstrument);
            if (isRecording) {
                recording.add(new NoteEvent(rawPitch.transpose(currentOctave), System.currentTimeMillis(), currentInstrument, NoteEvent.Kind.stop));
            }
        }


    }
    
    //TODO write method spec
    public void changeInstrument() {
        if (isPlaying.isEmpty()) {
            currentInstrument = currentInstrument.next();
        }
    }
    
    //TODO write method spec
    public void shiftUp() {
    	if (currentOctave < 24) {
    	    currentOctave += 12;
        }
    }
    
    //TODO write method spec
    public void shiftDown() {
        if (currentOctave > -24) {
            currentOctave -= 12;
        }
    }
    
    //TODO write method spec
    public boolean toggleRecording() {
        if (isRecording) {
            isRecording = false;
        } else {
            recording.clear();
            isRecording = true;
        }
        return isRecording;
    }
    
    //TODO write method spec
    public void playback() {
        if (isRecording) {
            isRecording = false;
        }

        if (recording.isEmpty()) {
            return;//nothing to playback
        }

        long delay = 0;

        for (NoteEvent noteEvent : recording) {
            if (delay != 0) {
                Midi.rest(Math.round((noteEvent.getTime() - delay) / 10));
            }

            delay = noteEvent.getTime();
            if (noteEvent.getKind() == NoteEvent.Kind.start) {
                midi.beginNote(noteEvent.getPitch().toMidiFrequency(), noteEvent.getInstr());
            } else {
                midi.endNote(noteEvent.getPitch().toMidiFrequency(), noteEvent.getInstr());
            }
        }
    }
}
