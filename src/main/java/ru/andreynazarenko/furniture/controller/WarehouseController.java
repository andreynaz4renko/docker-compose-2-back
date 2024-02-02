package ru.andreynazarenko.furniture.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.andreynazarenko.furniture.domain.Warehouse;
import ru.andreynazarenko.furniture.service.WarehouseService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/warehouses")
public class WarehouseController {

    private final WarehouseService service;

    @GetMapping
    public List<Warehouse> get() {
        return service.get();
    }

    @GetMapping("/{id}")
    public Warehouse getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Warehouse add(@RequestBody Warehouse warehouse) {
        return service.add(warehouse);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
