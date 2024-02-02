package ru.andreynazarenko.furniture.converter;

import ru.andreynazarenko.furniture.domain.Address;
import ru.andreynazarenko.furniture.entity.AddressEntity;

public class AddressConverter {

    public static Address toAddress(AddressEntity entity) {
        return Address.builder()
                .id(entity.getId())
                .city(entity.getCity())
                .street(entity.getStreet())
                .building(entity.getBuilding())
                .apartment(entity.getApartment())
                .build();
    }

    public static AddressEntity toAddressEntity(Address address) {
        return AddressEntity.builder()
                .id(address.getId())
                .city(address.getCity())
                .street(address.getStreet())
                .building(address.getBuilding())
                .apartment(address.getApartment())
                .build();
    }

}
