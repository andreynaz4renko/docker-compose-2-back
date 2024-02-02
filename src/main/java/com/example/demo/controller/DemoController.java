package com.example.demo.controller;

import com.example.demo.entity.DemoEntity;
import com.example.demo.entity.DemoSizeEntity;
import com.example.demo.repository.DemoRepository;
import com.example.demo.repository.DemoSizeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/demos")
public class DemoController {

    private final DemoRepository repository;
    private final DemoSizeRepository sizeRepository;

    @GetMapping
    public List<DemoEntity> getDemos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public DemoEntity getDemoById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public DemoEntity addDemo(@RequestBody DemoEntity demo) {
        return repository.save(demo);
    }

    @DeleteMapping("/{id}")
    public void deleteDemoById(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping
    public DemoEntity updateDemo(@RequestBody DemoEntity demo) {
        Optional<DemoEntity> repositoryDemo =
                repository.findById(demo.getId());
        repositoryDemo.ifPresent(repoDemo -> {
            repoDemo.setName(demo.getName());
            repository.save(repoDemo);
        });
        return repositoryDemo.orElse(null);
    }


    @GetMapping("/test")
    @Transactional
    public DemoEntity test() {
        DemoSizeEntity size = sizeRepository.save(
                DemoSizeEntity.builder()
                        .id(0L)
                        .height(100)
                        .depth(100)
                        .length(100)
                        .build()
        );
        return repository.save(
                DemoEntity.builder()
                        .id(0L)
                        .name("Test 1")
                        .size(
                                DemoSizeEntity.builder()
                                        .id(0L)
                                        .height(200)
                                        .depth(200)
                                        .length(100)
                                        .build()
                        )
                        .build()
        );
    }

}
