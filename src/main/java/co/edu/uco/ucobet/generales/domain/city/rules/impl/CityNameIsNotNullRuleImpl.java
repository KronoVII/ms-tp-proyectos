package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.generales.domain.city.exceptions.CityNameIsNotNullException;
import co.edu.uco.ucobet.generales.domain.city.exceptions.CityNameLenghtIsValidException;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameIsNotNullRule;
import org.springframework.stereotype.Service;

@Service
public class CityNameIsNotNullRuleImpl implements CityNameIsNotNullRule {
    @Override
    public void validate(final String data) {
        if (data == null) {
            throw CityNameIsNotNullException.create();
        }
    }
}
