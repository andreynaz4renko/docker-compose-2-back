package ru.andreynazarenko.furniture.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Color {
    private Long id;
    private String name;
    private String hex;
}
