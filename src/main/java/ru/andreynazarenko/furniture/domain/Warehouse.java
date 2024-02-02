package ru.andreynazarenko.furniture.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Warehouse {
    private Long id;
    private String name;
    private Address address;
}
