package ru.andreynazarenko.furniture.converter;

import ru.andreynazarenko.furniture.domain.Color;
import ru.andreynazarenko.furniture.entity.ColorEntity;

public class ColorConverter {

    public static Color toColor(ColorEntity entity) {
        return Color.builder()
                .id(entity.getId())
                .name(entity.getName())
                .hex(entity.getHex())
                .build();
    }

    public static ColorEntity toEntity(Color color) {
        return ColorEntity.builder()
                .id(color.getId())
                .name(color.getName())
                .hex(color.getHex())
                .build();
    }

}
