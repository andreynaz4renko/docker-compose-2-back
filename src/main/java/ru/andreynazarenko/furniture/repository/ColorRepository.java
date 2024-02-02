package ru.andreynazarenko.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.andreynazarenko.furniture.entity.ColorEntity;

public interface ColorRepository
        extends JpaRepository<ColorEntity, Long> {
}
