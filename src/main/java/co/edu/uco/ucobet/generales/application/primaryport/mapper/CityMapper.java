package co.edu.uco.ucobet.generales.application.primaryport.mapper;

import co.edu.uco.ucobet.generales.application.primaryport.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mapping(target = "state", expression = "java(new StateDomain(dto.getStateId(), null, null))")
    CityDomain toDomain(RegisterNewCityDTO dto);
}
