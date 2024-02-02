package ru.andreynazarenko.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.andreynazarenko.furniture.entity.WarehouseEntity;

public interface WarehouseRepository
        extends JpaRepository<WarehouseEntity, Long> {
}
