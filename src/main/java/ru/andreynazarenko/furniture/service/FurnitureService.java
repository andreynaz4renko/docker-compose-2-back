package ru.andreynazarenko.furniture.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.andreynazarenko.furniture.converter.FurnitureConverter;
import ru.andreynazarenko.furniture.domain.Furniture;
import ru.andreynazarenko.furniture.repository.FurnitureRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FurnitureService {

    private final FurnitureRepository repository;

    public List<Furniture> getFurniture() {
        return repository.findAll().stream()
                .map(FurnitureConverter::toFurniture).toList();
    }

    public Furniture getFurnitureById(Long id) {
        return repository.findById(id)
                .map(FurnitureConverter::toFurniture).orElse(null);
    }

    public Furniture addFurniture(Furniture furniture) {
        return FurnitureConverter.toFurniture(
                repository.save(
                        FurnitureConverter.toFurnitureEntity(furniture)
                )
        );
    }

    public void deleteFurnitureById(Long id) {
        repository.deleteById(id);
    }

}
