package spark_batch.basic_projects.verifier;

public class Pan {
    private String panNumber;
    private String aadhaarNumber;
    private String bankNumber;
    private String investments;

    public Pan(String panNumber, String aadhaarNumber, String bankNumber, String investments) {
        this.panNumber = panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.bankNumber = bankNumber;
        this.investments = investments;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getInvestments() {
        return investments;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "panNumber='" + panNumber + '\'' +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", investments='" + investments + '\'' +
                '}';
    }
}
