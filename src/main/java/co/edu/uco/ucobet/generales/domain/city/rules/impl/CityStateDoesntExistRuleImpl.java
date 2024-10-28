package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.generales.application.secondaryport.repository.CityRepository;
import co.edu.uco.ucobet.generales.application.secondaryport.repository.StateRepository;
import co.edu.uco.ucobet.generales.domain.city.exceptions.CityIdDoesExistException;
import co.edu.uco.ucobet.generales.domain.city.rules.CityStateDoesntExistRule;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CityStateDoesntExistRuleImpl implements CityStateDoesntExistRule {
    private final CityRepository cityRepository;


    public CityStateDoesntExistRuleImpl(final CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public void validate(final StateDomain data) {
//        if (cityRepository.existsByNameAndState(data.getName(), data.())) {
//
//        }
    }
}

