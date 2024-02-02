package ru.andreynazarenko.furniture.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.andreynazarenko.furniture.domain.Furniture;
import ru.andreynazarenko.furniture.service.FurnitureService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/furniture")
public class FurnitureController {

    private final FurnitureService service;

    @GetMapping
    public List<Furniture> getFurniture() {
        return service.getFurniture();
    }


    @GetMapping("/{id}")
    public Furniture getFurnitureById(@PathVariable Long id) {
        return service.getFurnitureById(id);
    }

    @PostMapping
    public Furniture addFurniture(@RequestBody Furniture furniture) {
        return service.addFurniture(furniture);
    }

    @DeleteMapping("/{id}")
    public void deleteFurnitureById(@PathVariable Long id) {
        service.deleteFurnitureById(id);
    }

}
