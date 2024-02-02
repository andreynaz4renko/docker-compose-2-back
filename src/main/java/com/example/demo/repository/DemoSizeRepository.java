package com.example.demo.repository;

import com.example.demo.entity.DemoSizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoSizeRepository
        extends JpaRepository<DemoSizeEntity, Long> {
}
