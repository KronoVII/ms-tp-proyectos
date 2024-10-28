package co.edu.uco.ucobet.generales.application.primaryport.interactor.city.impl;

import co.edu.uco.ucobet.generales.application.primaryport.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.generales.application.primaryport.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCity;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.application.primaryport.mapper.CityMapper;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewCityInteractorImpl implements RegisterNewCityInteractor {

    private final RegisterNewCity registerNewCity;

    public RegisterNewCityInteractorImpl(final RegisterNewCity registerNewCity) {
        this.registerNewCity = registerNewCity;
    }

    @Override
    public void execute(final RegisterNewCityDTO data) {
        CityDomain cityDomain = CityMapper.INSTANCE.toDomain(data);
        registerNewCity.execute(cityDomain);
    }
}
