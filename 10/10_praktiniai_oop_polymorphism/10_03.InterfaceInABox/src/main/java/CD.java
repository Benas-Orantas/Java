public class CD implements Packable{

    private String artist;
    private String cd;
    private int year;
//    private double weight = 0.1;

    public CD(String artist, String cd, int year) {
        this.artist = artist;
        this.cd = cd;
        this.year = year;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    public String toString() {
        return artist + ": " + cd + " (" + year + ")";
    }
}
