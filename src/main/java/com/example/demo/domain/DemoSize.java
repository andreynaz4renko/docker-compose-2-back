package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemoSize {
    private Long id;
    private Integer height; // высота
    private Integer length; // длина
    private Integer depth;  // глубина
}
