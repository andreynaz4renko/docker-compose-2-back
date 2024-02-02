package ru.andreynazarenko.furniture.converter;

import ru.andreynazarenko.furniture.domain.Furniture;
import ru.andreynazarenko.furniture.entity.FurnitureEntity;

public class FurnitureConverter {

    public static Furniture toFurniture(FurnitureEntity entity) {
        return Furniture.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .color(ColorConverter.toColor(entity.getColor()))
                .build();
    }

    public static FurnitureEntity toFurnitureEntity(Furniture furniture) {
        return FurnitureEntity.builder()
                .id(furniture.getId())
                .name(furniture.getName())
                .description(furniture.getDescription())
                .color(ColorConverter.toEntity(furniture.getColor()))
                .build();
    }

}
