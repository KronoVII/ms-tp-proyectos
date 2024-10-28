package co.edu.uco.ucobet.generales.application.usecase.city.impl;

import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityStateRulesValidator;
import co.edu.uco.ucobet.generales.domain.city.rules.CityStateDoesntExistRule;
import co.edu.uco.ucobet.generales.domain.state.rules.StateDoesExistRule;
import co.edu.uco.ucobet.generales.domain.state.rules.StateIdIsNotDefaultValueRule;
import co.edu.uco.ucobet.generales.domain.state.rules.StateIdIsNotNullRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegisterNewCityStateRulesValidatorImpl implements RegisterNewCityStateRulesValidator {
    private CityStateDoesntExistRule cityStateDoesntExistRule;
    private StateDoesExistRule stateDoesExistRule;
    private StateIdIsNotDefaultValueRule stateIdIsNotDefaultValueRule;
    private StateIdIsNotNullRule stateIdIsNotNullRule;

    public RegisterNewCityStateRulesValidatorImpl(final CityStateDoesntExistRule cityStateDoesntExistRule,
                                                   final StateDoesExistRule stateDoesExistRule,
                                                   final StateIdIsNotDefaultValueRule stateIdIsNotDefaultValueRule,
                                                   final StateIdIsNotNullRule stateIdIsNotNullRule) {
        this.cityStateDoesntExistRule = cityStateDoesntExistRule;
        this.stateDoesExistRule = stateDoesExistRule;
        this.stateIdIsNotDefaultValueRule = stateIdIsNotDefaultValueRule;
        this.stateIdIsNotNullRule = stateIdIsNotNullRule;
    }

    @Override
    public void validate(final UUID data) {
        stateIdIsNotNullRule.validate(data);
        stateIdIsNotDefaultValueRule.validate(data);
        stateDoesExistRule.validate(data);
    }
}
