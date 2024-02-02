package ru.andreynazarenko.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.andreynazarenko.furniture.entity.FurnitureEntity;

public interface FurnitureRepository
        extends JpaRepository<FurnitureEntity, Long> {
}
