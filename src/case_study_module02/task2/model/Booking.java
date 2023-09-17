package case_study_module02.task2.model;

public class Booking {
    private String bookingCode;
    private int bookingDate;
    private int rentalStartDate;
    private int rentalFinishDate;
    private String customerCode;
    private String serviceCode;

    public Booking(String bookingCode, int bookingDate, int rentalStartDate, int rentalFinishDate, String customerCode, String serviceCode) {
        this.bookingCode = bookingCode;
        this.bookingDate = bookingDate;
        this.rentalStartDate = rentalStartDate;
        this.rentalFinishDate = rentalFinishDate;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", bookingDate=" + bookingDate +
                ", rentalStartDate=" + rentalStartDate +
                ", rentalFinishDate=" + rentalFinishDate +
                ", customerCode='" + customerCode + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(int bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(int rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public int getRentalFinishDate() {
        return rentalFinishDate;
    }

    public void setRentalFinishDate(int rentalFinishDate) {
        this.rentalFinishDate = rentalFinishDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
}
