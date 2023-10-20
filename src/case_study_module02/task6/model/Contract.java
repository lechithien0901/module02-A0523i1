package case_study_module02.task6.model;

import java.util.Objects;

public class Contract {
    private String numberContracts;
    private  String bookingCode;
    private double advanceDeposit;
    private double totalPayment;

    public Contract(String numberContracts, String bookingCode, double advanceDeposit, double totalPayment) {
        this.numberContracts = numberContracts;
        this.bookingCode = bookingCode;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return Objects.equals(numberContracts, contract.numberContracts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberContracts);
    }

    @Override
    public String toString() {
        return "ServiceBooking{" +
                "numberContracts='" + numberContracts + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", advanceDeposit=" + advanceDeposit +
                ", totalPayment=" + totalPayment +
                '}';
    }

    public Contract() {
    }

    public String getNumberContracts() {
        return numberContracts;
    }

    public void setNumberContracts(String numberContracts) {
        this.numberContracts = numberContracts;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getAdvanceDeposit() {
        return advanceDeposit;
    }

    public void setAdvanceDeposit(double advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
}
