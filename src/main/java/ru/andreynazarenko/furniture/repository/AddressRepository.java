package ru.andreynazarenko.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.andreynazarenko.furniture.entity.AddressEntity;

public interface AddressRepository
        extends JpaRepository<AddressEntity, Long> {
}
