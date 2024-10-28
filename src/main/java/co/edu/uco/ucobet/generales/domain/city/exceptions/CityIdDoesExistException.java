package co.edu.uco.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exception.RuleUcobetException;

public final class CityIdDoesExistException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    private CityIdDoesExistException(final String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static final CityIdDoesExistException create() {
        var userMessage = "Ya existe la ciudad con el ID indicado";
        return new CityIdDoesExistException(userMessage);
    }
}
