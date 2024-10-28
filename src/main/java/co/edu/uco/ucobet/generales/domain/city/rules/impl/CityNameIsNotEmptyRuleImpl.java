package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.generales.domain.city.exceptions.CityNameIsNotEmptyException;
import co.edu.uco.ucobet.generales.domain.city.exceptions.CityNameIsNotNullException;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameIsNotEmptyRule;
import org.springframework.stereotype.Service;

@Service
public class CityNameIsNotEmptyRuleImpl implements CityNameIsNotEmptyRule {
    @Override
    public void validate(final String data) {
        if (data == null || data.trim().isEmpty()) {
            throw CityNameIsNotEmptyException.create();
        }
    }
}
