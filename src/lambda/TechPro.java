package lambda;

public class TechPro {
    //public TechPro engGece;
    private String batch;
    private String batchName;
    private  int batchOrt;
    private  int ogrSayi;
    public TechPro(String batch, String batchName, int batchOrt, int ogrcSayisi) {
        this.batch = batch;
        this.batchName = batchName;
        this.batchOrt = batchOrt;
        this.ogrSayi = ogrSayi;
    }
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public  int getBatchOrt() {
        return batchOrt;
    }

    public void setBatchOrt(int batchOrt) {
        this.batchOrt = batchOrt;
    }

    public int getOgrSayi() {
        return ogrSayi;
    }

    public void setOgrSayi(int ogrSayi) {
        this.ogrSayi = ogrSayi;
    }
    public String toString() {
        return "TechPro{" +
                "batch='" + batch + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchOrt=" + batchOrt +
                ", ogrcSayisi=" + ogrSayi +
                '}';

    }
}
