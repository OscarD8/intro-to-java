package intro_pt1.part5.PrimitivesAndReferenceTypes;

public class Song
{
    private final String songName;
    private final String songWriter;
    private final int bpm;

    public Song(String songName, String songWriter, int bpm) {
        this.songName = songName;
        this.songWriter = songWriter;
        this.bpm = bpm;
    }

    public boolean isEqual(Object compare) {
        if (this == compare) {
            return true;
        }
        if (!(compare instanceof Song compareSong)) {
            return false;
        }

        return compareSong.songWriter.equals(this.songWriter) &&
                compareSong.songName.equals(this.songName) &&
                compareSong.bpm == this.bpm;
    }

    @Override
        public String toString() {
        return this.songName + " | " + this.songWriter + " | " + this.bpm;
    }
}
