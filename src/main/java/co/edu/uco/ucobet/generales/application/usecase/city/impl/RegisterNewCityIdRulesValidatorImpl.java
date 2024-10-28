package co.edu.uco.ucobet.generales.application.usecase.city.impl;

import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityIdRulesValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.city.exceptions.CityIdDoesntExistException;
import co.edu.uco.ucobet.generales.domain.city.rules.*;
import co.edu.uco.ucobet.generales.domain.state.rules.StateDoesExistRule;
import co.edu.uco.ucobet.generales.domain.state.rules.StateIdIsNotDefaultValueRule;
import co.edu.uco.ucobet.generales.domain.state.rules.StateIdIsNotNullRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class RegisterNewCityIdRulesValidatorImpl implements RegisterNewCityIdRulesValidator {

    private final CityIdDoesExistRule cityIdDoesExistRule;

    public RegisterNewCityIdRulesValidatorImpl(final CityIdDoesExistRule cityIdDoesExistRule) {
        this.cityIdDoesExistRule = cityIdDoesExistRule;
    }

    @Override
    public void validate(final CityDomain data) {
        data.generateId();
        cityIdDoesExistRule.validate(data.getId());
    }
}
