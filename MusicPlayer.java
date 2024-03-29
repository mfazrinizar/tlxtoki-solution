import javax.sound.midi.*;

public class MusicPlayer {
    public static void main(String[] args) {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            int volume = 127; // volume maksimum
            int duration = 2000; // durasi setiap not
            // track 0
            // meta message 3 Flute 1
            // meta message 88 
            // meta message 89  
            // meta message 81 � 
            channels[0].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(121); // hentikan not 121
            channels[0].programChange(73); // instrumen 73
            channels[0].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(73); // hentikan not 73
            channels[0].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(7); // hentikan not 7
            channels[0].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(10); // hentikan not 10
            channels[0].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(91); // hentikan not 91
            channels[0].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[0].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(71); // hentikan not 71
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(71); // hentikan not 71
            channels[0].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(72); // hentikan not 72
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(72); // hentikan not 72
            channels[0].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(73); // hentikan not 73
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(73); // hentikan not 73
            channels[0].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(74); // hentikan not 74
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(74); // hentikan not 74
            channels[0].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(83); // hentikan not 83
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(83); // hentikan not 83
            channels[0].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(75); // hentikan not 75
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(75); // hentikan not 75
            channels[0].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(76); // hentikan not 76
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(76); // hentikan not 76
            channels[0].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(75); // hentikan not 75
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(75); // hentikan not 75
            channels[0].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(83); // hentikan not 83
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(83); // hentikan not 83
            channels[0].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(74); // hentikan not 74
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(74); // hentikan not 74
            // meta message 47 
            // track 1
            // meta message 3 Flute 2
            // meta message 89  
            channels[1].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(121); // hentikan not 121
            channels[1].programChange(73); // instrumen 73
            channels[1].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(73); // hentikan not 73
            channels[1].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(7); // hentikan not 7
            channels[1].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(10); // hentikan not 10
            channels[1].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(91); // hentikan not 91
            channels[1].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[1].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(71); // hentikan not 71
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(71); // hentikan not 71
            channels[1].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(72); // hentikan not 72
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(72); // hentikan not 72
            channels[1].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(73); // hentikan not 73
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(73); // hentikan not 73
            channels[1].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(74); // hentikan not 74
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(74); // hentikan not 74
            channels[1].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(83); // hentikan not 83
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(83); // hentikan not 83
            channels[1].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(75); // hentikan not 75
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(75); // hentikan not 75
            channels[1].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(76); // hentikan not 76
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(76); // hentikan not 76
            channels[1].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(75); // hentikan not 75
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(75); // hentikan not 75
            channels[1].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(83); // hentikan not 83
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(83); // hentikan not 83
            channels[1].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(74); // hentikan not 74
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(2); // hentikan not 2
            channels[1].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(74); // hentikan not 74
            // meta message 47 
            // track 2
            // meta message 3 Oboe 1
            // meta message 89  
            channels[2].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(121); // hentikan not 121
            channels[2].programChange(68); // instrumen 68
            channels[2].noteOn(68, volume); // mainkan not 68
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(68); // hentikan not 68
            channels[2].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(7); // hentikan not 7
            channels[2].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(10); // hentikan not 10
            channels[2].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(91); // hentikan not 91
            channels[2].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[2].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(71); // hentikan not 71
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(71); // hentikan not 71
            channels[2].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(72); // hentikan not 72
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(72); // hentikan not 72
            channels[2].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(73); // hentikan not 73
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(73); // hentikan not 73
            channels[2].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(74); // hentikan not 74
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(74); // hentikan not 74
            channels[2].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(83); // hentikan not 83
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(83); // hentikan not 83
            channels[2].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(75); // hentikan not 75
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(75); // hentikan not 75
            channels[2].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(76); // hentikan not 76
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(76); // hentikan not 76
            channels[2].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(75); // hentikan not 75
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(75); // hentikan not 75
            channels[2].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(83); // hentikan not 83
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(83); // hentikan not 83
            channels[2].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(74); // hentikan not 74
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(74); // hentikan not 74
            // meta message 47 
            // track 3
            // meta message 3 Oboe 2
            // meta message 89  
            channels[3].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(121); // hentikan not 121
            channels[3].programChange(68); // instrumen 68
            channels[3].noteOn(68, volume); // mainkan not 68
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(68); // hentikan not 68
            channels[3].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(7); // hentikan not 7
            channels[3].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(10); // hentikan not 10
            channels[3].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(91); // hentikan not 91
            channels[3].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[3].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(71); // hentikan not 71
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(71); // hentikan not 71
            channels[3].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(72); // hentikan not 72
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(72); // hentikan not 72
            channels[3].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(73); // hentikan not 73
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(73); // hentikan not 73
            channels[3].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(74); // hentikan not 74
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(74); // hentikan not 74
            channels[3].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(83); // hentikan not 83
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(83); // hentikan not 83
            channels[3].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(75); // hentikan not 75
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(75); // hentikan not 75
            channels[3].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(76); // hentikan not 76
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(76); // hentikan not 76
            channels[3].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(75); // hentikan not 75
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(75); // hentikan not 75
            channels[3].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(83); // hentikan not 83
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(83); // hentikan not 83
            channels[3].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(74); // hentikan not 74
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(74); // hentikan not 74
            // meta message 47 
            // track 4
            // meta message 3 B♭ Clarinet 1
            // meta message 89  
            channels[4].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(121); // hentikan not 121
            channels[4].programChange(71); // instrumen 71
            channels[4].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(71); // hentikan not 71
            channels[4].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(7); // hentikan not 7
            channels[4].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(10); // hentikan not 10
            channels[4].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(91); // hentikan not 91
            channels[4].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[4].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(71); // hentikan not 71
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(71); // hentikan not 71
            channels[4].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(72); // hentikan not 72
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(72); // hentikan not 72
            channels[4].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(73); // hentikan not 73
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(73); // hentikan not 73
            channels[4].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(74); // hentikan not 74
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(74); // hentikan not 74
            channels[4].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(83); // hentikan not 83
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(83); // hentikan not 83
            channels[4].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(75); // hentikan not 75
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(75); // hentikan not 75
            channels[4].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(76); // hentikan not 76
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(76); // hentikan not 76
            channels[4].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(75); // hentikan not 75
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(75); // hentikan not 75
            channels[4].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(83); // hentikan not 83
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(83); // hentikan not 83
            channels[4].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(74); // hentikan not 74
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(2); // hentikan not 2
            channels[4].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(74); // hentikan not 74
            // meta message 47 
            // track 5
            // meta message 3 B♭ Clarinet 2
            // meta message 89  
            channels[5].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(121); // hentikan not 121
            channels[5].programChange(71); // instrumen 71
            channels[5].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(71); // hentikan not 71
            channels[5].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(7); // hentikan not 7
            channels[5].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(10); // hentikan not 10
            channels[5].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(91); // hentikan not 91
            channels[5].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[5].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(71); // hentikan not 71
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(71); // hentikan not 71
            channels[5].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(72); // hentikan not 72
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(72); // hentikan not 72
            channels[5].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(73); // hentikan not 73
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(73); // hentikan not 73
            channels[5].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(74); // hentikan not 74
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(74); // hentikan not 74
            channels[5].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(83); // hentikan not 83
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(83); // hentikan not 83
            channels[5].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(75); // hentikan not 75
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(75); // hentikan not 75
            channels[5].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(76); // hentikan not 76
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(76); // hentikan not 76
            channels[5].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(75); // hentikan not 75
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(75); // hentikan not 75
            channels[5].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(83); // hentikan not 83
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(83); // hentikan not 83
            channels[5].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(74); // hentikan not 74
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(2); // hentikan not 2
            channels[5].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(74); // hentikan not 74
            // meta message 47 
            // track 6
            // meta message 3 Bassoon 1
            // meta message 89  
            channels[6].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(121); // hentikan not 121
            channels[6].programChange(70); // instrumen 70
            channels[6].noteOn(70, volume); // mainkan not 70
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(70); // hentikan not 70
            channels[6].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(7); // hentikan not 7
            channels[6].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(10); // hentikan not 10
            channels[6].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(91); // hentikan not 91
            channels[6].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[6].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(47); // hentikan not 47
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(47); // hentikan not 47
            channels[6].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(48); // hentikan not 48
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(48); // hentikan not 48
            channels[6].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(49); // hentikan not 49
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(49); // hentikan not 49
            channels[6].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(50); // hentikan not 50
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(50); // hentikan not 50
            channels[6].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(59); // hentikan not 59
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(59); // hentikan not 59
            channels[6].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(51); // hentikan not 51
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(51); // hentikan not 51
            channels[6].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(52); // hentikan not 52
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(52); // hentikan not 52
            channels[6].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(51); // hentikan not 51
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(51); // hentikan not 51
            channels[6].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(59); // hentikan not 59
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(59); // hentikan not 59
            channels[6].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(50); // hentikan not 50
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(50); // hentikan not 50
            // meta message 47 
            // track 7
            // meta message 3 Bassoon 2
            // meta message 89  
            channels[7].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(121); // hentikan not 121
            channels[7].programChange(70); // instrumen 70
            channels[7].noteOn(70, volume); // mainkan not 70
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(70); // hentikan not 70
            channels[7].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(7); // hentikan not 7
            channels[7].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(10); // hentikan not 10
            channels[7].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(91); // hentikan not 91
            channels[7].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[7].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(47); // hentikan not 47
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(47); // hentikan not 47
            channels[7].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(48); // hentikan not 48
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(48); // hentikan not 48
            channels[7].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(49); // hentikan not 49
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(49); // hentikan not 49
            channels[7].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(50); // hentikan not 50
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(50); // hentikan not 50
            channels[7].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(59); // hentikan not 59
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(59); // hentikan not 59
            channels[7].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(51); // hentikan not 51
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(51); // hentikan not 51
            channels[7].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(52); // hentikan not 52
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(52); // hentikan not 52
            channels[7].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(51); // hentikan not 51
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(51); // hentikan not 51
            channels[7].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(59); // hentikan not 59
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(59); // hentikan not 59
            channels[7].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(50); // hentikan not 50
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(2); // hentikan not 2
            channels[7].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(50); // hentikan not 50
            // meta message 47 
            // track 8
            // meta message 3 Contrabassoon 1
            // meta message 89  
            channels[10].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(121); // hentikan not 121
            channels[10].programChange(70); // instrumen 70
            channels[10].noteOn(70, volume); // mainkan not 70
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(70); // hentikan not 70
            channels[10].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(7); // hentikan not 7
            channels[10].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(10); // hentikan not 10
            channels[10].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(91); // hentikan not 91
            channels[10].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[10].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(35); // hentikan not 35
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(35); // hentikan not 35
            channels[10].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(36); // hentikan not 36
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(36); // hentikan not 36
            channels[10].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(37); // hentikan not 37
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(37); // hentikan not 37
            channels[10].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(38); // hentikan not 38
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(38); // hentikan not 38
            channels[10].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(47); // hentikan not 47
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(47); // hentikan not 47
            channels[10].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(39); // hentikan not 39
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(39); // hentikan not 39
            channels[10].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(40); // hentikan not 40
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(40); // hentikan not 40
            channels[10].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(39); // hentikan not 39
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(39); // hentikan not 39
            channels[10].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(47); // hentikan not 47
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(47); // hentikan not 47
            channels[10].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(38); // hentikan not 38
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(38); // hentikan not 38
            // meta message 47 
            // track 9
            // meta message 3 Contrabassoon 2
            // meta message 89  
            channels[11].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(121); // hentikan not 121
            channels[11].programChange(70); // instrumen 70
            channels[11].noteOn(70, volume); // mainkan not 70
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(70); // hentikan not 70
            channels[11].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(7); // hentikan not 7
            channels[11].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(10); // hentikan not 10
            channels[11].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(91); // hentikan not 91
            channels[11].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[11].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(35); // hentikan not 35
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(35); // hentikan not 35
            channels[11].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(36); // hentikan not 36
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(36); // hentikan not 36
            channels[11].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(37); // hentikan not 37
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(37); // hentikan not 37
            channels[11].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(38); // hentikan not 38
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(38); // hentikan not 38
            channels[11].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(47); // hentikan not 47
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(47); // hentikan not 47
            channels[11].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(39); // hentikan not 39
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(39); // hentikan not 39
            channels[11].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(40); // hentikan not 40
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(40); // hentikan not 40
            channels[11].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(39); // hentikan not 39
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(39); // hentikan not 39
            channels[11].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(47); // hentikan not 47
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(47); // hentikan not 47
            channels[11].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(38); // hentikan not 38
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(38); // hentikan not 38
            // meta message 47 
            // track 10
            // meta message 3 F Horn 1 & 3
            // meta message 89  
            channels[8].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(121); // hentikan not 121
            channels[8].programChange(60); // instrumen 60
            channels[8].noteOn(60, volume); // mainkan not 60
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(60); // hentikan not 60
            channels[8].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(7); // hentikan not 7
            channels[8].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(10); // hentikan not 10
            channels[8].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(91); // hentikan not 91
            channels[8].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[6].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(121); // hentikan not 121
            channels[6].programChange(59); // instrumen 59
            channels[6].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(59); // hentikan not 59
            channels[6].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(7); // hentikan not 7
            channels[6].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(10); // hentikan not 10
            channels[6].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(91); // hentikan not 91
            channels[6].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[8].noteOn(63, volume); // mainkan not 63
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(63); // hentikan not 63
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(63, volume); // mainkan not 63
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(63); // hentikan not 63
            channels[8].noteOn(64, volume); // mainkan not 64
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(64); // hentikan not 64
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(64, volume); // mainkan not 64
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(64); // hentikan not 64
            channels[8].noteOn(65, volume); // mainkan not 65
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(65); // hentikan not 65
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(65, volume); // mainkan not 65
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(65); // hentikan not 65
            channels[8].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(66); // hentikan not 66
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(66); // hentikan not 66
            channels[8].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(75); // hentikan not 75
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(75); // hentikan not 75
            channels[8].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(67); // hentikan not 67
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(67); // hentikan not 67
            channels[8].noteOn(68, volume); // mainkan not 68
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(68); // hentikan not 68
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(68, volume); // mainkan not 68
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(68); // hentikan not 68
            channels[8].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(67); // hentikan not 67
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(67); // hentikan not 67
            channels[8].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(75); // hentikan not 75
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(75); // hentikan not 75
            channels[8].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(66); // hentikan not 66
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(2); // hentikan not 2
            channels[8].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(66); // hentikan not 66
            // meta message 47 
            // track 11
            // meta message 3 F Horn 2 & 4
            // meta message 89  
            channels[10].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(121); // hentikan not 121
            channels[10].programChange(60); // instrumen 60
            channels[10].noteOn(60, volume); // mainkan not 60
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(60); // hentikan not 60
            channels[10].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(7); // hentikan not 7
            channels[10].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(10); // hentikan not 10
            channels[10].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(91); // hentikan not 91
            channels[10].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[7].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(121); // hentikan not 121
            channels[7].programChange(59); // instrumen 59
            channels[7].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(59); // hentikan not 59
            channels[7].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(7); // hentikan not 7
            channels[7].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(10); // hentikan not 10
            channels[7].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(91); // hentikan not 91
            channels[7].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[10].noteOn(63, volume); // mainkan not 63
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(63); // hentikan not 63
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(63, volume); // mainkan not 63
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(63); // hentikan not 63
            channels[10].noteOn(64, volume); // mainkan not 64
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(64); // hentikan not 64
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(64, volume); // mainkan not 64
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(64); // hentikan not 64
            channels[10].noteOn(65, volume); // mainkan not 65
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(65); // hentikan not 65
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(65, volume); // mainkan not 65
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(65); // hentikan not 65
            channels[10].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(66); // hentikan not 66
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(66); // hentikan not 66
            channels[10].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(75); // hentikan not 75
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(75); // hentikan not 75
            channels[10].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(67); // hentikan not 67
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(67); // hentikan not 67
            channels[10].noteOn(68, volume); // mainkan not 68
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(68); // hentikan not 68
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(68, volume); // mainkan not 68
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(68); // hentikan not 68
            channels[10].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(67); // hentikan not 67
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(67); // hentikan not 67
            channels[10].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(75); // hentikan not 75
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(75); // hentikan not 75
            channels[10].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(66); // hentikan not 66
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(66); // hentikan not 66
            // meta message 47 
            // track 12
            // meta message 3 B♭ Trumpet 1
            // meta message 89  
            channels[11].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(121); // hentikan not 121
            channels[11].programChange(56); // instrumen 56
            channels[11].noteOn(56, volume); // mainkan not 56
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(56); // hentikan not 56
            channels[11].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(7); // hentikan not 7
            channels[11].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(10); // hentikan not 10
            channels[11].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(91); // hentikan not 91
            channels[11].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[12].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(121); // hentikan not 121
            channels[12].programChange(59); // instrumen 59
            channels[12].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(59); // hentikan not 59
            channels[12].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(7); // hentikan not 7
            channels[12].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(10); // hentikan not 10
            channels[12].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(91); // hentikan not 91
            channels[12].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[11].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(71); // hentikan not 71
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(71); // hentikan not 71
            channels[11].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(72); // hentikan not 72
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(72); // hentikan not 72
            channels[11].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(73); // hentikan not 73
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(73); // hentikan not 73
            channels[11].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(74); // hentikan not 74
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(74); // hentikan not 74
            channels[11].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(83); // hentikan not 83
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(83); // hentikan not 83
            channels[11].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(75); // hentikan not 75
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(75); // hentikan not 75
            channels[11].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(76); // hentikan not 76
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(76); // hentikan not 76
            channels[11].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(75); // hentikan not 75
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(75); // hentikan not 75
            channels[11].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(83); // hentikan not 83
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(83); // hentikan not 83
            channels[11].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(74); // hentikan not 74
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(2); // hentikan not 2
            channels[11].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(74); // hentikan not 74
            // meta message 47 
            // track 13
            // meta message 3 B♭ Trumpet 2
            // meta message 89  
            channels[13].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(121); // hentikan not 121
            channels[13].programChange(56); // instrumen 56
            channels[13].noteOn(56, volume); // mainkan not 56
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(56); // hentikan not 56
            channels[13].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(7); // hentikan not 7
            channels[13].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(10); // hentikan not 10
            channels[13].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(91); // hentikan not 91
            channels[13].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[14].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(121); // hentikan not 121
            channels[14].programChange(59); // instrumen 59
            channels[14].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(59); // hentikan not 59
            channels[14].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(7); // hentikan not 7
            channels[14].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(10); // hentikan not 10
            channels[14].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(91); // hentikan not 91
            channels[14].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[13].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(71); // hentikan not 71
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(71); // hentikan not 71
            channels[13].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(72); // hentikan not 72
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(72); // hentikan not 72
            channels[13].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(73); // hentikan not 73
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(73); // hentikan not 73
            channels[13].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(74); // hentikan not 74
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(74); // hentikan not 74
            channels[13].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(83); // hentikan not 83
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(83); // hentikan not 83
            channels[13].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(75); // hentikan not 75
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(75); // hentikan not 75
            channels[13].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(76); // hentikan not 76
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(76); // hentikan not 76
            channels[13].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(75); // hentikan not 75
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(75); // hentikan not 75
            channels[13].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(83); // hentikan not 83
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(83); // hentikan not 83
            channels[13].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(74); // hentikan not 74
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(2); // hentikan not 2
            channels[13].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(74); // hentikan not 74
            // meta message 47 
            // track 14
            // meta message 3 Trombone 1
            // meta message 89  
            channels[15].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(121); // hentikan not 121
            channels[15].programChange(57); // instrumen 57
            channels[15].noteOn(57, volume); // mainkan not 57
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(57); // hentikan not 57
            channels[15].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(7); // hentikan not 7
            channels[15].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(10); // hentikan not 10
            channels[15].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(91); // hentikan not 91
            channels[15].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[1].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(121); // hentikan not 121
            channels[1].programChange(59); // instrumen 59
            channels[1].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(59); // hentikan not 59
            channels[1].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(7); // hentikan not 7
            channels[1].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(10); // hentikan not 10
            channels[1].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(91); // hentikan not 91
            channels[1].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(93); // hentikan not 93
            // meta message 33  
            channels[15].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(47); // hentikan not 47
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(47); // hentikan not 47
            channels[15].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(48); // hentikan not 48
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(48); // hentikan not 48
            channels[15].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(49); // hentikan not 49
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(49); // hentikan not 49
            channels[15].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(50); // hentikan not 50
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(50); // hentikan not 50
            channels[15].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(59); // hentikan not 59
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(59); // hentikan not 59
            channels[15].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(51); // hentikan not 51
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(51); // hentikan not 51
            channels[15].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(52); // hentikan not 52
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(52); // hentikan not 52
            channels[15].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(51); // hentikan not 51
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(51); // hentikan not 51
            channels[15].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(59); // hentikan not 59
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(59); // hentikan not 59
            channels[15].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(50); // hentikan not 50
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(2); // hentikan not 2
            channels[15].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(50); // hentikan not 50
            // meta message 47 
            // track 15
            // meta message 3 Trombone 2
            // meta message 89  
            channels[0].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(121); // hentikan not 121
            channels[0].programChange(57); // instrumen 57
            channels[0].noteOn(57, volume); // mainkan not 57
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(57); // hentikan not 57
            channels[0].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(7); // hentikan not 7
            channels[0].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(10); // hentikan not 10
            channels[0].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(91); // hentikan not 91
            channels[0].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[8].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(121); // hentikan not 121
            channels[8].programChange(59); // instrumen 59
            channels[8].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(59); // hentikan not 59
            channels[8].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(7); // hentikan not 7
            channels[8].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(10); // hentikan not 10
            channels[8].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(91); // hentikan not 91
            channels[8].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[0].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(47); // hentikan not 47
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(47); // hentikan not 47
            channels[0].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(48); // hentikan not 48
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(48); // hentikan not 48
            channels[0].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(49); // hentikan not 49
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(49); // hentikan not 49
            channels[0].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(50); // hentikan not 50
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(50); // hentikan not 50
            channels[0].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(59); // hentikan not 59
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(59); // hentikan not 59
            channels[0].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(51); // hentikan not 51
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(51); // hentikan not 51
            channels[0].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(52); // hentikan not 52
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(52); // hentikan not 52
            channels[0].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(51); // hentikan not 51
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(51); // hentikan not 51
            channels[0].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(59); // hentikan not 59
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(59); // hentikan not 59
            channels[0].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(50); // hentikan not 50
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(50); // hentikan not 50
            // meta message 47 
            // track 16
            // meta message 3 Tuba
            // meta message 89  
            channels[2].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(121); // hentikan not 121
            channels[2].programChange(58); // instrumen 58
            channels[2].noteOn(58, volume); // mainkan not 58
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(58); // hentikan not 58
            channels[2].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(7); // hentikan not 7
            channels[2].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(10); // hentikan not 10
            channels[2].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(91); // hentikan not 91
            channels[2].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[2].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(35); // hentikan not 35
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(35); // hentikan not 35
            channels[2].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(36); // hentikan not 36
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(36); // hentikan not 36
            channels[2].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(37); // hentikan not 37
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(37); // hentikan not 37
            channels[2].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(38); // hentikan not 38
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(38); // hentikan not 38
            channels[2].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(47); // hentikan not 47
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(47); // hentikan not 47
            channels[2].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(39); // hentikan not 39
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(39); // hentikan not 39
            channels[2].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(40); // hentikan not 40
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(40); // hentikan not 40
            channels[2].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(39); // hentikan not 39
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(39); // hentikan not 39
            channels[2].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(47); // hentikan not 47
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(47); // hentikan not 47
            channels[2].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(38); // hentikan not 38
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(2); // hentikan not 2
            channels[2].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(38); // hentikan not 38
            // meta message 47 
            // track 17
            // meta message 3 Timpani
            // meta message 89  
            channels[3].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(121); // hentikan not 121
            channels[3].programChange(47); // instrumen 47
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(7); // hentikan not 7
            channels[3].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(10); // hentikan not 10
            channels[3].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(91); // hentikan not 91
            channels[3].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(48); // hentikan not 48
            channels[3].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(48); // hentikan not 48
            channels[3].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(49); // hentikan not 49
            channels[3].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(49); // hentikan not 49
            channels[3].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(50); // hentikan not 50
            channels[3].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(50); // hentikan not 50
            channels[3].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(59); // hentikan not 59
            channels[3].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(59); // hentikan not 59
            channels[3].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(51); // hentikan not 51
            channels[3].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(51); // hentikan not 51
            channels[3].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(52); // hentikan not 52
            channels[3].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(52); // hentikan not 52
            channels[3].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(51); // hentikan not 51
            channels[3].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(51); // hentikan not 51
            channels[3].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(59); // hentikan not 59
            channels[3].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(59); // hentikan not 59
            channels[3].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(50); // hentikan not 50
            channels[3].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(50); // hentikan not 50
            // meta message 47 
            // track 18
            // meta message 3 Snare Drum
            // meta message 89   
            channels[9].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(121); // hentikan not 121
            channels[9].programChange(48); // instrumen 48
            channels[9].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(48); // hentikan not 48
            channels[9].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(7); // hentikan not 7
            channels[9].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(10); // hentikan not 10
            channels[9].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(91); // hentikan not 91
            channels[9].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(93); // hentikan not 93
            // meta message 33  
            // meta message 47 
            // track 19
            // meta message 3 Bass Drum
            // meta message 89   
            channels[9].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(121); // hentikan not 121
            channels[9].programChange(48); // instrumen 48
            channels[9].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(48); // hentikan not 48
            channels[9].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(7); // hentikan not 7
            channels[9].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(10); // hentikan not 10
            channels[9].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(91); // hentikan not 91
            channels[9].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[9].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(35); // hentikan not 35
            channels[9].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(35); // hentikan not 35
            // meta message 47 
            // track 20
            // meta message 3 Cymbal
            // meta message 89   
            channels[9].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(121); // hentikan not 121
            channels[9].programChange(48); // instrumen 48
            channels[9].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(48); // hentikan not 48
            channels[9].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(7); // hentikan not 7
            channels[9].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(10); // hentikan not 10
            channels[9].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(91); // hentikan not 91
            channels[9].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[9].noteOn(57, volume); // mainkan not 57
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(57); // hentikan not 57
            channels[9].noteOn(57, volume); // mainkan not 57
            Thread.sleep(duration); // tunggu durasi not
            channels[9].noteOff(57); // hentikan not 57
            // meta message 47 
            // track 21
            // meta message 3 Harp
            // meta message 89  
            channels[3].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(121); // hentikan not 121
            channels[3].programChange(46); // instrumen 46
            channels[3].noteOn(46, volume); // mainkan not 46
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(46); // hentikan not 46
            channels[3].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(7); // hentikan not 7
            channels[3].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(10); // hentikan not 10
            channels[3].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(91); // hentikan not 91
            channels[3].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[4].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(121); // hentikan not 121
            channels[4].programChange(45); // instrumen 45
            channels[4].noteOn(45, volume); // mainkan not 45
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(45); // hentikan not 45
            channels[4].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(7); // hentikan not 7
            channels[4].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(10); // hentikan not 10
            channels[4].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(91); // hentikan not 91
            channels[4].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[5].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(121); // hentikan not 121
            channels[5].programChange(11); // instrumen 11
            channels[5].noteOn(11, volume); // mainkan not 11
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(11); // hentikan not 11
            channels[5].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(7); // hentikan not 7
            channels[5].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(10); // hentikan not 10
            channels[5].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(91); // hentikan not 91
            channels[5].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[3].noteOn(60, volume); // mainkan not 60
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(60); // hentikan not 60
            channels[3].noteOn(60, volume); // mainkan not 60
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(60); // hentikan not 60
            channels[3].noteOn(61, volume); // mainkan not 61
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(61); // hentikan not 61
            channels[3].noteOn(61, volume); // mainkan not 61
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(61); // hentikan not 61
            channels[3].noteOn(62, volume); // mainkan not 62
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(62); // hentikan not 62
            channels[3].noteOn(62, volume); // mainkan not 62
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(62); // hentikan not 62
            channels[3].noteOn(63, volume); // mainkan not 63
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(63); // hentikan not 63
            channels[3].noteOn(63, volume); // mainkan not 63
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(63); // hentikan not 63
            channels[3].noteOn(65, volume); // mainkan not 65
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(65); // hentikan not 65
            channels[3].noteOn(65, volume); // mainkan not 65
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(65); // hentikan not 65
            channels[3].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(66); // hentikan not 66
            channels[3].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(66); // hentikan not 66
            channels[3].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(67); // hentikan not 67
            channels[3].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(67); // hentikan not 67
            channels[3].noteOn(68, volume); // mainkan not 68
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(68); // hentikan not 68
            channels[3].noteOn(68, volume); // mainkan not 68
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(68); // hentikan not 68
            channels[3].noteOn(69, volume); // mainkan not 69
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(69); // hentikan not 69
            channels[3].noteOn(69, volume); // mainkan not 69
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(69); // hentikan not 69
            channels[3].noteOn(70, volume); // mainkan not 70
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(70); // hentikan not 70
            channels[3].noteOn(70, volume); // mainkan not 70
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(70); // hentikan not 70
            channels[3].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(71); // hentikan not 71
            channels[3].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(71); // hentikan not 71
            channels[3].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(72); // hentikan not 72
            channels[3].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(72); // hentikan not 72
            channels[3].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(72); // hentikan not 72
            channels[3].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(72); // hentikan not 72
            channels[3].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(73); // hentikan not 73
            channels[3].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(73); // hentikan not 73
            channels[3].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(74); // hentikan not 74
            channels[3].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(74); // hentikan not 74
            channels[3].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(75); // hentikan not 75
            channels[3].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(75); // hentikan not 75
            channels[3].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(76); // hentikan not 76
            channels[3].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(76); // hentikan not 76
            channels[3].noteOn(77, volume); // mainkan not 77
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(77); // hentikan not 77
            channels[3].noteOn(77, volume); // mainkan not 77
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(77); // hentikan not 77
            channels[3].noteOn(78, volume); // mainkan not 78
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(78); // hentikan not 78
            channels[3].noteOn(78, volume); // mainkan not 78
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(78); // hentikan not 78
            channels[3].noteOn(79, volume); // mainkan not 79
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(79); // hentikan not 79
            channels[3].noteOn(79, volume); // mainkan not 79
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(79); // hentikan not 79
            channels[3].noteOn(80, volume); // mainkan not 80
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(80); // hentikan not 80
            channels[3].noteOn(80, volume); // mainkan not 80
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(80); // hentikan not 80
            channels[3].noteOn(81, volume); // mainkan not 81
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(81); // hentikan not 81
            channels[3].noteOn(81, volume); // mainkan not 81
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(81); // hentikan not 81
            channels[3].noteOn(82, volume); // mainkan not 82
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(82); // hentikan not 82
            channels[3].noteOn(82, volume); // mainkan not 82
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(82); // hentikan not 82
            channels[3].noteOn(60, volume); // mainkan not 60
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(60); // hentikan not 60
            channels[3].noteOn(60, volume); // mainkan not 60
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(60); // hentikan not 60
            channels[3].noteOn(61, volume); // mainkan not 61
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(61); // hentikan not 61
            channels[3].noteOn(61, volume); // mainkan not 61
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(61); // hentikan not 61
            channels[3].noteOn(62, volume); // mainkan not 62
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(62); // hentikan not 62
            channels[3].noteOn(62, volume); // mainkan not 62
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(62); // hentikan not 62
            channels[3].noteOn(63, volume); // mainkan not 63
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(63); // hentikan not 63
            channels[3].noteOn(63, volume); // mainkan not 63
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(63); // hentikan not 63
            channels[3].noteOn(65, volume); // mainkan not 65
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(65); // hentikan not 65
            channels[3].noteOn(65, volume); // mainkan not 65
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(65); // hentikan not 65
            channels[3].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(66); // hentikan not 66
            channels[3].noteOn(66, volume); // mainkan not 66
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(66); // hentikan not 66
            channels[3].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(67); // hentikan not 67
            channels[3].noteOn(67, volume); // mainkan not 67
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(67); // hentikan not 67
            channels[3].noteOn(68, volume); // mainkan not 68
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(68); // hentikan not 68
            channels[3].noteOn(68, volume); // mainkan not 68
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(68); // hentikan not 68
            channels[3].noteOn(69, volume); // mainkan not 69
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(69); // hentikan not 69
            channels[3].noteOn(69, volume); // mainkan not 69
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(69); // hentikan not 69
            channels[3].noteOn(70, volume); // mainkan not 70
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(70); // hentikan not 70
            channels[3].noteOn(70, volume); // mainkan not 70
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(70); // hentikan not 70
            channels[3].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(71); // hentikan not 71
            channels[3].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(71); // hentikan not 71
            channels[3].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(72); // hentikan not 72
            channels[3].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(72); // hentikan not 72
            channels[3].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(72); // hentikan not 72
            channels[3].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(72); // hentikan not 72
            channels[3].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(73); // hentikan not 73
            channels[3].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(73); // hentikan not 73
            channels[3].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(74); // hentikan not 74
            channels[3].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(74); // hentikan not 74
            channels[3].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(75); // hentikan not 75
            channels[3].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(75); // hentikan not 75
            channels[3].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(76); // hentikan not 76
            channels[3].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(76); // hentikan not 76
            channels[3].noteOn(77, volume); // mainkan not 77
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(77); // hentikan not 77
            channels[3].noteOn(77, volume); // mainkan not 77
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(77); // hentikan not 77
            channels[3].noteOn(78, volume); // mainkan not 78
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(78); // hentikan not 78
            channels[3].noteOn(78, volume); // mainkan not 78
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(78); // hentikan not 78
            channels[3].noteOn(79, volume); // mainkan not 79
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(79); // hentikan not 79
            channels[3].noteOn(79, volume); // mainkan not 79
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(79); // hentikan not 79
            channels[3].noteOn(80, volume); // mainkan not 80
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(80); // hentikan not 80
            channels[3].noteOn(80, volume); // mainkan not 80
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(80); // hentikan not 80
            channels[3].noteOn(81, volume); // mainkan not 81
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(81); // hentikan not 81
            channels[3].noteOn(81, volume); // mainkan not 81
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(81); // hentikan not 81
            channels[3].noteOn(82, volume); // mainkan not 82
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(82); // hentikan not 82
            channels[3].noteOn(82, volume); // mainkan not 82
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(82); // hentikan not 82
            // meta message 47 
            // track 22
            // meta message 3 Harp
            // meta message 89  
            // meta message 33 
            // meta message 33 
            // meta message 33 
            channels[3].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(35); // hentikan not 35
            channels[3].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(35); // hentikan not 35
            channels[3].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(36); // hentikan not 36
            channels[3].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(36); // hentikan not 36
            channels[3].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(37); // hentikan not 37
            channels[3].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(37); // hentikan not 37
            channels[3].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(38); // hentikan not 38
            channels[3].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(38); // hentikan not 38
            channels[3].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(39); // hentikan not 39
            channels[3].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(39); // hentikan not 39
            channels[3].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(40); // hentikan not 40
            channels[3].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(40); // hentikan not 40
            channels[3].noteOn(41, volume); // mainkan not 41
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(41); // hentikan not 41
            channels[3].noteOn(41, volume); // mainkan not 41
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(41); // hentikan not 41
            channels[3].noteOn(42, volume); // mainkan not 42
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(42); // hentikan not 42
            channels[3].noteOn(42, volume); // mainkan not 42
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(42); // hentikan not 42
            channels[3].noteOn(43, volume); // mainkan not 43
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(43); // hentikan not 43
            channels[3].noteOn(43, volume); // mainkan not 43
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(43); // hentikan not 43
            channels[3].noteOn(44, volume); // mainkan not 44
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(44); // hentikan not 44
            channels[3].noteOn(44, volume); // mainkan not 44
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(44); // hentikan not 44
            channels[3].noteOn(45, volume); // mainkan not 45
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(45); // hentikan not 45
            channels[3].noteOn(45, volume); // mainkan not 45
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(45); // hentikan not 45
            channels[3].noteOn(46, volume); // mainkan not 46
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(46); // hentikan not 46
            channels[3].noteOn(46, volume); // mainkan not 46
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(46); // hentikan not 46
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(48); // hentikan not 48
            channels[3].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(48); // hentikan not 48
            channels[3].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(49); // hentikan not 49
            channels[3].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(49); // hentikan not 49
            channels[3].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(50); // hentikan not 50
            channels[3].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(50); // hentikan not 50
            channels[3].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(51); // hentikan not 51
            channels[3].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(51); // hentikan not 51
            channels[3].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(52); // hentikan not 52
            channels[3].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(52); // hentikan not 52
            channels[3].noteOn(53, volume); // mainkan not 53
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(53); // hentikan not 53
            channels[3].noteOn(53, volume); // mainkan not 53
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(53); // hentikan not 53
            channels[3].noteOn(54, volume); // mainkan not 54
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(54); // hentikan not 54
            channels[3].noteOn(54, volume); // mainkan not 54
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(54); // hentikan not 54
            channels[3].noteOn(55, volume); // mainkan not 55
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(55); // hentikan not 55
            channels[3].noteOn(55, volume); // mainkan not 55
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(55); // hentikan not 55
            channels[3].noteOn(56, volume); // mainkan not 56
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(56); // hentikan not 56
            channels[3].noteOn(56, volume); // mainkan not 56
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(56); // hentikan not 56
            channels[3].noteOn(57, volume); // mainkan not 57
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(57); // hentikan not 57
            channels[3].noteOn(57, volume); // mainkan not 57
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(57); // hentikan not 57
            channels[3].noteOn(58, volume); // mainkan not 58
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(58); // hentikan not 58
            channels[3].noteOn(58, volume); // mainkan not 58
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(58); // hentikan not 58
            channels[3].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(59); // hentikan not 59
            channels[3].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(59); // hentikan not 59
            channels[3].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(35); // hentikan not 35
            channels[3].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(35); // hentikan not 35
            channels[3].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(36); // hentikan not 36
            channels[3].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(36); // hentikan not 36
            channels[3].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(37); // hentikan not 37
            channels[3].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(37); // hentikan not 37
            channels[3].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(38); // hentikan not 38
            channels[3].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(38); // hentikan not 38
            channels[3].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(39); // hentikan not 39
            channels[3].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(39); // hentikan not 39
            channels[3].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(40); // hentikan not 40
            channels[3].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(40); // hentikan not 40
            channels[3].noteOn(41, volume); // mainkan not 41
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(41); // hentikan not 41
            channels[3].noteOn(41, volume); // mainkan not 41
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(41); // hentikan not 41
            channels[3].noteOn(42, volume); // mainkan not 42
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(42); // hentikan not 42
            channels[3].noteOn(42, volume); // mainkan not 42
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(42); // hentikan not 42
            channels[3].noteOn(43, volume); // mainkan not 43
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(43); // hentikan not 43
            channels[3].noteOn(43, volume); // mainkan not 43
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(43); // hentikan not 43
            channels[3].noteOn(44, volume); // mainkan not 44
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(44); // hentikan not 44
            channels[3].noteOn(44, volume); // mainkan not 44
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(44); // hentikan not 44
            channels[3].noteOn(45, volume); // mainkan not 45
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(45); // hentikan not 45
            channels[3].noteOn(45, volume); // mainkan not 45
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(45); // hentikan not 45
            channels[3].noteOn(46, volume); // mainkan not 46
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(46); // hentikan not 46
            channels[3].noteOn(46, volume); // mainkan not 46
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(46); // hentikan not 46
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(48); // hentikan not 48
            channels[3].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(48); // hentikan not 48
            channels[3].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(49); // hentikan not 49
            channels[3].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(49); // hentikan not 49
            channels[3].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(50); // hentikan not 50
            channels[3].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(50); // hentikan not 50
            channels[3].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(51); // hentikan not 51
            channels[3].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(51); // hentikan not 51
            channels[3].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(52); // hentikan not 52
            channels[3].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(52); // hentikan not 52
            channels[3].noteOn(53, volume); // mainkan not 53
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(53); // hentikan not 53
            channels[3].noteOn(53, volume); // mainkan not 53
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(53); // hentikan not 53
            channels[3].noteOn(54, volume); // mainkan not 54
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(54); // hentikan not 54
            channels[3].noteOn(54, volume); // mainkan not 54
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(54); // hentikan not 54
            channels[3].noteOn(55, volume); // mainkan not 55
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(55); // hentikan not 55
            channels[3].noteOn(55, volume); // mainkan not 55
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(55); // hentikan not 55
            channels[3].noteOn(56, volume); // mainkan not 56
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(56); // hentikan not 56
            channels[3].noteOn(56, volume); // mainkan not 56
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(56); // hentikan not 56
            channels[3].noteOn(57, volume); // mainkan not 57
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(57); // hentikan not 57
            channels[3].noteOn(57, volume); // mainkan not 57
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(57); // hentikan not 57
            channels[3].noteOn(58, volume); // mainkan not 58
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(58); // hentikan not 58
            channels[3].noteOn(58, volume); // mainkan not 58
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(58); // hentikan not 58
            channels[3].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(59); // hentikan not 59
            channels[3].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(59); // hentikan not 59
            // meta message 47 
            // track 23
            // meta message 3 Violins 1
            // meta message 89  
            channels[10].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(121); // hentikan not 121
            channels[10].programChange(48); // instrumen 48
            channels[10].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(48); // hentikan not 48
            channels[10].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(7); // hentikan not 7
            channels[10].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(10); // hentikan not 10
            channels[10].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(91); // hentikan not 91
            channels[10].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[11].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(121); // hentikan not 121
            channels[11].programChange(45); // instrumen 45
            channels[11].noteOn(45, volume); // mainkan not 45
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(45); // hentikan not 45
            channels[11].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(7); // hentikan not 7
            channels[11].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(10); // hentikan not 10
            channels[11].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(91); // hentikan not 91
            channels[11].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[11].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[12].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(121); // hentikan not 121
            channels[12].programChange(44); // instrumen 44
            channels[12].noteOn(44, volume); // mainkan not 44
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(44); // hentikan not 44
            channels[12].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(7); // hentikan not 7
            channels[12].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(10); // hentikan not 10
            channels[12].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(91); // hentikan not 91
            channels[12].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[12].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[10].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(71); // hentikan not 71
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(71); // hentikan not 71
            channels[10].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(72); // hentikan not 72
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(72); // hentikan not 72
            channels[10].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(73); // hentikan not 73
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(73); // hentikan not 73
            channels[10].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(74); // hentikan not 74
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(74); // hentikan not 74
            channels[10].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(83); // hentikan not 83
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(83); // hentikan not 83
            channels[10].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(75); // hentikan not 75
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(75); // hentikan not 75
            channels[10].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(76); // hentikan not 76
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(76); // hentikan not 76
            channels[10].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(75); // hentikan not 75
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(75); // hentikan not 75
            channels[10].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(83); // hentikan not 83
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(83); // hentikan not 83
            channels[10].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(74); // hentikan not 74
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(2); // hentikan not 2
            channels[10].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[10].noteOff(74); // hentikan not 74
            // meta message 47 
            // track 24
            // meta message 3 Violins 2
            // meta message 89  
            channels[6].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(121); // hentikan not 121
            channels[6].programChange(48); // instrumen 48
            channels[6].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(48); // hentikan not 48
            channels[6].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(7); // hentikan not 7
            channels[6].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(10); // hentikan not 10
            channels[6].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(91); // hentikan not 91
            channels[6].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[7].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(121); // hentikan not 121
            channels[7].programChange(45); // instrumen 45
            channels[7].noteOn(45, volume); // mainkan not 45
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(45); // hentikan not 45
            channels[7].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(7); // hentikan not 7
            channels[7].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(10); // hentikan not 10
            channels[7].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(91); // hentikan not 91
            channels[7].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[7].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[8].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(121); // hentikan not 121
            channels[8].programChange(44); // instrumen 44
            channels[8].noteOn(44, volume); // mainkan not 44
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(44); // hentikan not 44
            channels[8].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(7); // hentikan not 7
            channels[8].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(10); // hentikan not 10
            channels[8].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(91); // hentikan not 91
            channels[8].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[8].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[6].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(71); // hentikan not 71
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(71, volume); // mainkan not 71
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(71); // hentikan not 71
            channels[6].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(72); // hentikan not 72
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(72, volume); // mainkan not 72
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(72); // hentikan not 72
            channels[6].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(73); // hentikan not 73
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(73, volume); // mainkan not 73
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(73); // hentikan not 73
            channels[6].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(74); // hentikan not 74
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(74); // hentikan not 74
            channels[6].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(83); // hentikan not 83
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(83); // hentikan not 83
            channels[6].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(75); // hentikan not 75
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(75); // hentikan not 75
            channels[6].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(76); // hentikan not 76
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(76, volume); // mainkan not 76
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(76); // hentikan not 76
            channels[6].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(75); // hentikan not 75
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(75, volume); // mainkan not 75
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(75); // hentikan not 75
            channels[6].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(83); // hentikan not 83
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(83, volume); // mainkan not 83
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(83); // hentikan not 83
            channels[6].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(74); // hentikan not 74
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(2); // hentikan not 2
            channels[6].noteOn(74, volume); // mainkan not 74
            Thread.sleep(duration); // tunggu durasi not
            channels[6].noteOff(74); // hentikan not 74
            // meta message 47 
            // track 25
            // meta message 3 Violas
            // meta message 89  
            channels[13].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(121); // hentikan not 121
            channels[13].programChange(48); // instrumen 48
            channels[13].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(48); // hentikan not 48
            channels[13].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(7); // hentikan not 7
            channels[13].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(10); // hentikan not 10
            channels[13].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(91); // hentikan not 91
            channels[13].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[13].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[14].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(121); // hentikan not 121
            channels[14].programChange(45); // instrumen 45
            channels[14].noteOn(45, volume); // mainkan not 45
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(45); // hentikan not 45
            channels[14].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(7); // hentikan not 7
            channels[14].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(10); // hentikan not 10
            channels[14].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(91); // hentikan not 91
            channels[14].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[14].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[15].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(121); // hentikan not 121
            channels[15].programChange(44); // instrumen 44
            channels[15].noteOn(44, volume); // mainkan not 44
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(44); // hentikan not 44
            channels[15].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(7); // hentikan not 7
            channels[15].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(10); // hentikan not 10
            channels[15].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(91); // hentikan not 91
            channels[15].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[15].noteOff(93); // hentikan not 93
            // meta message 33 
            // meta message 47 
            // track 26
            // meta message 3 Violoncellos
            // meta message 89  
            channels[0].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(121); // hentikan not 121
            channels[0].programChange(48); // instrumen 48
            channels[0].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(48); // hentikan not 48
            channels[0].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(7); // hentikan not 7
            channels[0].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(10); // hentikan not 10
            channels[0].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(91); // hentikan not 91
            channels[0].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[1].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(121); // hentikan not 121
            channels[1].programChange(45); // instrumen 45
            channels[1].noteOn(45, volume); // mainkan not 45
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(45); // hentikan not 45
            channels[1].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(7); // hentikan not 7
            channels[1].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(10); // hentikan not 10
            channels[1].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(91); // hentikan not 91
            channels[1].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[1].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[2].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(121); // hentikan not 121
            channels[2].programChange(44); // instrumen 44
            channels[2].noteOn(44, volume); // mainkan not 44
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(44); // hentikan not 44
            channels[2].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(7); // hentikan not 7
            channels[2].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(10); // hentikan not 10
            channels[2].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(91); // hentikan not 91
            channels[2].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[2].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[0].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(47); // hentikan not 47
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(47); // hentikan not 47
            channels[0].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(48); // hentikan not 48
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(48); // hentikan not 48
            channels[0].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(49); // hentikan not 49
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(49, volume); // mainkan not 49
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(49); // hentikan not 49
            channels[0].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(50); // hentikan not 50
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(50); // hentikan not 50
            channels[0].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(59); // hentikan not 59
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(59); // hentikan not 59
            channels[0].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(51); // hentikan not 51
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(51); // hentikan not 51
            channels[0].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(52); // hentikan not 52
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(52, volume); // mainkan not 52
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(52); // hentikan not 52
            channels[0].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(51); // hentikan not 51
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(51, volume); // mainkan not 51
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(51); // hentikan not 51
            channels[0].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(59); // hentikan not 59
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(59, volume); // mainkan not 59
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(59); // hentikan not 59
            channels[0].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(50); // hentikan not 50
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(2); // hentikan not 2
            channels[0].noteOn(50, volume); // mainkan not 50
            Thread.sleep(duration); // tunggu durasi not
            channels[0].noteOff(50); // hentikan not 50
            // meta message 47 
            // track 27
            // meta message 3 Contrabasses
            // meta message 89  
            channels[3].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(121); // hentikan not 121
            channels[3].programChange(48); // instrumen 48
            channels[3].noteOn(48, volume); // mainkan not 48
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(48); // hentikan not 48
            channels[3].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(7); // hentikan not 7
            channels[3].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(10); // hentikan not 10
            channels[3].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(91); // hentikan not 91
            channels[3].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[4].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(121); // hentikan not 121
            channels[4].programChange(45); // instrumen 45
            channels[4].noteOn(45, volume); // mainkan not 45
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(45); // hentikan not 45
            channels[4].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(7); // hentikan not 7
            channels[4].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(10); // hentikan not 10
            channels[4].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(91); // hentikan not 91
            channels[4].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[4].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[5].noteOn(121, volume); // mainkan not 121
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(121); // hentikan not 121
            channels[5].programChange(44); // instrumen 44
            channels[5].noteOn(44, volume); // mainkan not 44
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(44); // hentikan not 44
            channels[5].noteOn(7, volume); // mainkan not 7
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(7); // hentikan not 7
            channels[5].noteOn(10, volume); // mainkan not 10
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(10); // hentikan not 10
            channels[5].noteOn(91, volume); // mainkan not 91
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(91); // hentikan not 91
            channels[5].noteOn(93, volume); // mainkan not 93
            Thread.sleep(duration); // tunggu durasi not
            channels[5].noteOff(93); // hentikan not 93
            // meta message 33 
            channels[3].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(35); // hentikan not 35
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(35, volume); // mainkan not 35
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(35); // hentikan not 35
            channels[3].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(36); // hentikan not 36
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(36, volume); // mainkan not 36
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(36); // hentikan not 36
            channels[3].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(37); // hentikan not 37
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(37, volume); // mainkan not 37
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(37); // hentikan not 37
            channels[3].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(38); // hentikan not 38
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(38); // hentikan not 38
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(39); // hentikan not 39
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(39); // hentikan not 39
            channels[3].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(40); // hentikan not 40
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(40, volume); // mainkan not 40
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(40); // hentikan not 40
            channels[3].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(39); // hentikan not 39
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(39, volume); // mainkan not 39
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(39); // hentikan not 39
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(47, volume); // mainkan not 47
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(47); // hentikan not 47
            channels[3].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(38); // hentikan not 38
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(2, volume); // mainkan not 2
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(2); // hentikan not 2
            channels[3].noteOn(38, volume); // mainkan not 38
            Thread.sleep(duration); // tunggu durasi not
            channels[3].noteOff(38); // hentikan not 38
            // meta message 47 
            synth.close();
        } catch (InvalidMidiDataException | MidiUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
