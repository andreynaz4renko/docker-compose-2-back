package ru.andreynazarenko.furniture.converter;

import ru.andreynazarenko.furniture.domain.Warehouse;
import ru.andreynazarenko.furniture.entity.WarehouseEntity;

public class WarehouseConverter {

    public static Warehouse toWarehouse(WarehouseEntity entity) {
        return Warehouse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .address(AddressConverter.toAddress(entity.getAddress()))
                .build();
    }

    public static WarehouseEntity toWarehouseEntity(Warehouse warehouse) {
        return WarehouseEntity.builder()
                .id(warehouse.getId())
                .name(warehouse.getName())
                .address(AddressConverter.toAddressEntity(warehouse.getAddress()))
                .build();
    }
}
