package ru.andreynazarenko.furniture.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.andreynazarenko.furniture.converter.ColorConverter;
import ru.andreynazarenko.furniture.domain.Color;
import ru.andreynazarenko.furniture.repository.ColorRepository;

@Service
@RequiredArgsConstructor
public class ColorService {

    private final ColorRepository repository;

    public Color addColor(Color color) {
        return ColorConverter.toColor(
                repository.save(
                        ColorConverter.toEntity(color)
                )
        );
    }

}
