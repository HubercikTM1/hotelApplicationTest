package com.example.hotelapplicationtest.remote.rest.dto.response;

import java.util.List;

public class ReservationCollectionDTO {
    private List<ReservationDTO> reservation;

    public ReservationCollectionDTO() {

    }

    public ReservationCollectionDTO(List<ReservationDTO> orders) {
        this.reservation = reservation;
    }

    public List<ReservationDTO> getReservation() {
        return reservation;
    }

    public void setReservation(List<ReservationDTO> reservation) {
        this.reservation = reservation;
    }
}
