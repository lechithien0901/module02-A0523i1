package case_study_module02.task1.model;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking>{
    private String bookingCode;
    private LocalDate bookingDate;
    private LocalDate  startDate;
    private LocalDate  endDate;
    private  String customerCode;
    private String serviceCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(serviceCode, booking.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCode);
    }

    @Override
    public int compareTo( Booking other) {
        int startDate=this.startDate.compareTo(other.startDate);
        if (startDate!=0){
            return startDate;
        }else {
            return this.endDate.compareTo(other.endDate);
        }

    }

    public Booking(String bookingCode,LocalDate  bookingDate, LocalDate  startDate,LocalDate  endDate, String customerCode, String serviceCode) {
        this.bookingCode = bookingCode;
        this.bookingDate = bookingDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
    }

    public Booking() {
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public LocalDate  getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate  bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate  getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate  startDate) {
        this.startDate = startDate;
    }

    public LocalDate  getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate  endDate) {
        this.endDate = endDate;
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

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", bookingDate=" + bookingDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", customerCode='" + customerCode + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }
}
