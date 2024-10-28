package co.edu.uco.ucobet.generales.infrastructure.primaryadapters.controller.rest.city;

import co.edu.uco.ucobet.generales.application.primaryport.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.generales.application.primaryport.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.generales.crosscutting.helpers.UUIDHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("general/api/v1/cities")
public class RegisterNewCityController {

    private final RegisterNewCityInteractor registerNewCityInteractor;

    @Autowired
    public RegisterNewCityController(RegisterNewCityInteractor registerNewCityInteractor) {
        this.registerNewCityInteractor = registerNewCityInteractor;
    }

    @PostMapping
    public RegisterNewCityDTO execute(@RequestBody RegisterNewCityDTO dto) {
        registerNewCityInteractor.execute(dto);
        return dto;
    }

//    @GetMapping
//    public RegisterNewCityDTO executeDummy() {
//        return RegisterNewCityDTO.create(UUIDHelper.generate(), "Rionegro");
//    }

    @GetMapping("/saludar")
    public RegisterNewCityDTO execute() {
        return RegisterNewCityDTO.create(UUIDHelper.generate(), "Rionegro");
    }
}
