package co.edu.uco.ucobet.generales.domain.state.rules.impl;

import co.edu.uco.ucobet.generales.application.secondaryport.repository.StateRepository;
import co.edu.uco.ucobet.generales.domain.city.exceptions.CityIdDoesExistException;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;
import co.edu.uco.ucobet.generales.domain.state.exceptions.StateDoesExistException;
import co.edu.uco.ucobet.generales.domain.state.rules.StateDoesExistRule;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class StateDoesExistRuleImpl implements StateDoesExistRule {
    private StateRepository stateRepository;

    public StateDoesExistRuleImpl(final StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }


    @Override
    public void validate(final UUID data) {
        if (!stateRepository.existsById(data)) {
            throw StateDoesExistException.create();
        }
    }
}
