package com.example.hotelapplicationtest.remote.rest.dto.response;

import java.util.List;

public class HotelsCollectionDTO {

    private List<HotelDTO> hotel;

    public HotelsCollectionDTO() {

    }

    public HotelsCollectionDTO(List<HotelDTO> hotel) {
        this.hotel = hotel;
    }

    public List<HotelDTO> getHotel() {
        return hotel;
    }

    public void setHotel(List<HotelDTO> hotel) {
        this.hotel = hotel;
    }
}
