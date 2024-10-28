package co.edu.uco.ucobet.generales.application.usecase.city.impl;

import co.edu.uco.ucobet.generales.application.secondaryport.entity.CityEntity;
import co.edu.uco.ucobet.generales.application.secondaryport.mapper.CityEntityMapper;
import co.edu.uco.ucobet.generales.application.secondaryport.repository.CityRepository;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCity;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityIdRulesValidator;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityRulesValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewCityImpl implements RegisterNewCity {

    private final CityRepository cityRepository;
    private final RegisterNewCityRulesValidator registerNewCityRulesValidator;

    public RegisterNewCityImpl(final CityRepository cityRepository,
                               final RegisterNewCityRulesValidator registerNewCityRulesValidator
    ) {
        this.cityRepository = cityRepository;
        this.registerNewCityRulesValidator = registerNewCityRulesValidator;
    }

    @Override
    public void execute(final CityDomain domain) {

        // Rules validation
        registerNewCityRulesValidator.validate(domain);

        CityEntity cityEntity = CityEntityMapper.INSTANCE.toEntity(domain);
        cityRepository.save(cityEntity);

        // Notify the admin about the creation of the city
        // TODO: Notification building block
        // 1. Admin's mail is in a parametrized place (parameters building block)
        // 2. Mail subject is in a parametrized place (parameters building block)
        // 3. Mail content is in a parametrized place (parameters building block)
    }
}
