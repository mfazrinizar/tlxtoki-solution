import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.sound.midi.*;

public class Ambatu {
    public static void main(String[] args) {
        try {
            // buka file MIDI
            File midiFile = new File("C:\\Users\\lenovo\\Downloads\\ambatu.mid");
            Sequence sequence = MidiSystem.getSequence(midiFile);
            // buat kode javax.sound.midi dari file MIDI
            StringBuilder sb = new StringBuilder();
            sb.append("import javax.sound.midi.*;\n\n");
            sb.append("public class MusicPlayer {\n");
            sb.append("    public static void main(String[] args) {\n");
            sb.append("        try {\n");
            sb.append("            Synthesizer synth = MidiSystem.getSynthesizer();\n");
            sb.append("            synth.open();\n");
            sb.append("            MidiChannel[] channels = synth.getChannels();\n");
            sb.append("            int volume = 127; // volume maksimum\n");
            sb.append("            int duration = 2000; // durasi setiap not\n");
            Track[] tracks = sequence.getTracks();
            for (int i = 0; i < tracks.length; i++) {
                sb.append("            // track " + i + "\n");
                for (int j = 0; j < tracks[i].size(); j++) {
                    MidiEvent event = tracks[i].get(j);
                    MidiMessage message = event.getMessage();
                    if (message instanceof ShortMessage) {
                        ShortMessage sm = (ShortMessage) message;
                        int channel = sm.getChannel();
                        int command = sm.getCommand();
                        int data1 = sm.getData1();
                        if (command == ShortMessage.PROGRAM_CHANGE) {
                            sb.append("            channels[" + channel + "].programChange(" + data1 + "); // instrumen " + data1 + "\n");
                        }
                        sb.append("            channels[" + channel + "].noteOn(" + data1 + ", volume); // mainkan not " + data1 + "\n");
                        sb.append("            Thread.sleep(duration); // tunggu durasi not\n");
                        sb.append("            channels[" + channel + "].noteOff(" + data1 + "); // hentikan not " + data1 + "\n");
                    } else if (message instanceof MetaMessage) {
                        MetaMessage mm = (MetaMessage) message;
                        byte[] data = mm.getData();
                        sb.append("            // meta message " + mm.getType() + " " + new String(data) + "\n");
                    } else {
                        sb.append("            // other message " + message.getClass() + "\n");
                    }
                }
            }
            sb.append("            synth.close();\n");
            sb.append("        } catch (InvalidMidiDataException | MidiUnavailableException | InterruptedException e) {\n");
            sb.append("            e.printStackTrace();\n");
            sb.append("        }\n"); 
            sb.append("    }\n");
            sb.append("}\n");
            // tulis kode javax.sound.midi ke dalam file Java
            FileWriter writer = new FileWriter("AmbatuMid.java");
            writer.write(sb.toString());
            writer.close();
        } catch (InvalidMidiDataException | IOException e) {
            e.printStackTrace();
        }
    }
}