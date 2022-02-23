package com.example.hotelapplicationtest.remote.rest.dto.response;

import java.math.BigDecimal;

public class RoomDTO {
    private Integer id;
    private Integer noOfBeds;
    private BigDecimal price;

    public RoomDTO() {
    }

    public RoomDTO(Integer id, Integer noOfBeds, BigDecimal price) {
        this.id = id;
        this.noOfBeds = noOfBeds;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(Integer noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
