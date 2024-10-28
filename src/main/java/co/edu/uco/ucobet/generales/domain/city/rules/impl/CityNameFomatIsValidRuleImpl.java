package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.generales.domain.city.exceptions.CityNameFormatIsValidException;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameFormatIsValidRule;
import org.springframework.stereotype.Service;

@Service
public class CityNameFomatIsValidRuleImpl implements CityNameFormatIsValidRule {
    private static final String CITY_NAME_REGEX = "^[a-zA-ZÀ-ÿ\\s]+$";
    @Override
    public void validate(String data) {
        if(!data.matches(CITY_NAME_REGEX)){
            throw CityNameFormatIsValidException.create();
        }
    }
}
