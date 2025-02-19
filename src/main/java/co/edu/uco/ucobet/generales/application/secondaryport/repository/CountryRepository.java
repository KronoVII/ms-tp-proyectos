package co.edu.uco.ucobet.generales.application.secondaryport.repository;

import co.edu.uco.ucobet.generales.application.secondaryport.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, UUID> {
}
