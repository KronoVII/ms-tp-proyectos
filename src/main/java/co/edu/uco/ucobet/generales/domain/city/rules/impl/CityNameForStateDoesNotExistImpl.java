package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.generales.application.secondaryport.repository.CityRepository;
import co.edu.uco.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.city.exceptions.CityNameForStateDoesntExistException;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameForStateDoesntExistRule;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;
import org.springframework.stereotype.Service;


@Service
public final class CityNameForStateDoesNotExistImpl implements CityNameForStateDoesntExistRule {

    public CityRepository cityRepository;

    public CityNameForStateDoesNotExistImpl(final CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public void validate(CityDomain data) {
        if (ObjectHelper.isNull(data.getState())){
            throw CityNameForStateDoesntExistException.create();
        }
    }
}
