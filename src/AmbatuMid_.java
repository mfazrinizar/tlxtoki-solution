import java.io.File;
import javax.sound.midi.*;

public class AmbatuMid_ {
    public static void main(String[] args) {
        try {
            // buka file MIDI
            File midiFile = new File("C:\\Users\\lenovo\\Downloads\\ambatu.mid");
            Sequence sequence = MidiSystem.getSequence(midiFile);
            // buat kode javax.sound.midi dari file MIDI
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
            // mainkan file MIDI
            sequencer.start();
            while (sequencer.isRunning()) {
                Thread.sleep(1000);
            }
            // hentikan file MIDI secara halus
            sequencer.setTempoFactor(0.1f); // kurangi tempo menjadi 10%
            Thread.sleep(5000); // tunggu 5 detik
            sequencer.stop();
            sequencer.close();
        } catch (InvalidMidiDataException | MidiUnavailableException | InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}