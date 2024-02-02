package ru.andreynazarenko.furniture.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.andreynazarenko.furniture.domain.Color;
import ru.andreynazarenko.furniture.service.ColorService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/colors")
public class ColorController {

    private final ColorService service;

    @PostMapping
    public Color addColor(@RequestBody Color color) {
        return service.addColor(color);
    }

}
