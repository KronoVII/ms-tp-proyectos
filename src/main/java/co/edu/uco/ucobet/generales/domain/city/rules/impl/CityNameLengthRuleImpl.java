package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.generales.application.secondaryport.repository.CityRepository;
import co.edu.uco.ucobet.generales.domain.city.exceptions.CityIdDoesntExistException;
import co.edu.uco.ucobet.generales.domain.city.exceptions.CityNameLenghtIsValidException;
import co.edu.uco.ucobet.generales.domain.city.rules.CityIdDoesntExistRule;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameLengthIsValidRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CityNameLengthRuleImpl implements CityNameLengthIsValidRule {


    @Override
    public void validate(final String data) {
        if (data.length()<=0) {
            throw CityNameLenghtIsValidException.create();
        }
    }

}
