package org.practice.bean;

public enum BookingStatus {

    NOT_BOOKED(0),
    BOOKED(1);

    int bookingStatusId;
    BookingStatus(int bookingStatusId) {
        this.bookingStatusId = bookingStatusId;
    }
}
