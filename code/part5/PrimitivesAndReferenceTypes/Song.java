package code.part5.PrimitivesAndReferenceTypes;

public class Song
{
    private String songName;
    private String songWriter;
    private int bpm;

    public Song(String songName, String songWriter, int bpm) {
        this.songName = songName;
        this.songWriter = songWriter;
        this.bpm = bpm;
    }

    public boolean isEqual(Object compare) {
        if (this == compare) {
            return true;
        }
        if (!(compare instanceof Song)) {
            return false;
        }

        Song compareSong = (Song) compare;
        return compareSong.songWriter.equals(this.songWriter) &&
                compareSong.songName.equals(this.songName) &&
                compareSong.bpm == this.bpm;
    }

    @Override
        public String toString() {
        return this.songName + " | " + this.songWriter + " | " + this.bpm;
    }
}
