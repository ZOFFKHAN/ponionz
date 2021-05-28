package fr.formation.ponionz.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.ponionz.domain.dtos.MortageCreate;
import fr.formation.ponionz.domain.dtos.MortageView;
import fr.formation.ponionz.services.MortageService;

@RestController
@RequestMapping("/mortages")
public class MortageController {

    private final MortageService service;

    public MortageController(MortageService service) {
	this.service = service;
    }

    @GetMapping("/{id}")
    public MortageView getById(@PathVariable("id") Long id) {
	System.out.println("call in controller");
	return service.getById(id);

    }

    @PostMapping

    public void create(@Valid @RequestBody MortageCreate dto) {
	service.create(dto);
	System.out.println(dto);
    }

}
