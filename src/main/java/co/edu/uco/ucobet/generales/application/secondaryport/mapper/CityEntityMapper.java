package co.edu.uco.ucobet.generales.application.secondaryport.mapper;

import co.edu.uco.ucobet.generales.application.secondaryport.entity.CityEntity;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CityEntityMapper {

    CityEntityMapper INSTANCE = Mappers.getMapper(CityEntityMapper.class);

    @Mapping(target = "state", expression = "java(new StateEntity(domain.getState().getId(), null, null))")
    CityEntity toEntity(CityDomain domain);
}
