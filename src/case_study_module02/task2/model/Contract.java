package case_study_module02.task2.model;

public class Contract {
    private int numberContract;
    private String codeBooking;
    private double advanceDepositAmount;
    private double totalNumber;

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract=" + numberContract +
                ", codeBooking='" + codeBooking + '\'' +
                ", advanceDepositAmount=" + advanceDepositAmount +
                ", totalNumber=" + totalNumber +
                '}';
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(double advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public double getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(double totalNumber) {
        this.totalNumber = totalNumber;
    }
}
