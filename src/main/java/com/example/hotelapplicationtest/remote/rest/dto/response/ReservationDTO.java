package com.example.hotelapplicationtest.remote.rest.dto.response;

import com.example.hotelapplicationtest.domain.model.ReservationStatusType;
import com.example.hotelapplicationtest.remote.rest.dto.request.PersonReservationDTO;
import com.example.hotelapplicationtest.remote.rest.dto.request.RoomReservationDTO;
import java.util.List;

public class ReservationDTO {
    private Integer id;
    private ReservationStatusType status;
    private List<RoomReservationDTO> rooms;
    private PersonReservationDTO person;

    public ReservationDTO() {
    }

    public ReservationDTO(Integer id, ReservationStatusType status, List<RoomReservationDTO> rooms, PersonReservationDTO person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomReservationDTO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomReservationDTO> rooms) {
        this.rooms = rooms;
    }

    public PersonReservationDTO getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDTO person) {
        this.person = person;
    }
}
