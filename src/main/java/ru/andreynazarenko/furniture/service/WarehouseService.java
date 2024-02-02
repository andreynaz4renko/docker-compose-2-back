package ru.andreynazarenko.furniture.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.andreynazarenko.furniture.converter.WarehouseConverter;
import ru.andreynazarenko.furniture.domain.Warehouse;
import ru.andreynazarenko.furniture.repository.WarehouseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WarehouseService {

    private final WarehouseRepository repository;

    public List<Warehouse> get() {
        return repository.findAll().stream()
                .map(WarehouseConverter::toWarehouse).toList();
    }

    public Warehouse getById(Long id) {
        return repository.findById(id)
                .map(WarehouseConverter::toWarehouse).orElse(null);
    }

    public Warehouse add(Warehouse warehouse) {
        return WarehouseConverter.toWarehouse(
                repository.save(
                        WarehouseConverter.toWarehouseEntity(warehouse)
                )
        );
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
