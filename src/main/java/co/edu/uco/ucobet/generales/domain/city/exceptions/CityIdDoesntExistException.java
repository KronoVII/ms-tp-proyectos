package co.edu.uco.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exception.RuleUcobetException;

public final class CityIdDoesntExistException extends RuleUcobetException {
    private static final long serialVersionUID = 1L;

    private CityIdDoesntExistException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static final CityIdDoesntExistException create() {
        var userMessage = "No existe la ciudad con el ID indicado";
        return new CityIdDoesntExistException(userMessage);
    }
}
