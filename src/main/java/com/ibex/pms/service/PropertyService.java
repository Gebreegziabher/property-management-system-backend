package com.ibex.pms.service;

import com.ibex.pms.domain.dto.response.OfferResponseDto;
import com.ibex.pms.domain.dto.request.PropertyRequestDto;
import com.ibex.pms.domain.dto.response.PropertyResponseDto;

import java.util.List;

public interface PropertyService {
    List<OfferResponseDto> getAllOffers(long id);
    List<PropertyResponseDto> getAll();

    PropertyResponseDto getById(long id);

    void deleteById(long id);

    void save(PropertyRequestDto property);

    void update(PropertyRequestDto property, long id);

//    public void updateByUserId(PropertyDto property, long userId);

    List<PropertyResponseDto> getByCriteria(double price, int lotSize, int numberOfBedRooms, int numberOfBaths);
}
