package intro_pt2.Streams.LiteracyComparison;

public class LiteracyData implements Comparable<LiteracyData>
{
    private String country;
    private int reportDate;
    private String gender;
    private double literacyRate;

    public LiteracyData(String country, int reportDate, String gender, double literacyRate) {
        this.country = country;
        this.reportDate = reportDate;
        this.gender = gender.replace(" (%)", "");
        this.literacyRate = literacyRate;
    }

    public String getCountry() {
        return country;
    }

    public int getReportDate() {
        return reportDate;
    }

    public String getGender() {
        return gender;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }


    @Override
    public String toString() {
        return country + " (" + reportDate + "), " + gender + ", " + literacyRate;
    }

    @Override
    public int compareTo(LiteracyData compare) {
        return Double.compare(this.literacyRate, compare.literacyRate);
    }
}
