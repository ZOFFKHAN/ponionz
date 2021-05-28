package fr.formation.ponionz.services;

import javax.validation.Valid;

import fr.formation.ponionz.domain.dtos.MortageCreate;
import fr.formation.ponionz.domain.dtos.MortageView;

public interface MortageService {

    MortageView getById(Long id);

    void create(@Valid MortageCreate dto);

}
