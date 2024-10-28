package co.edu.uco.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exception.RuleUcobetException;

public final class CityNameForStateDoesntExistException extends RuleUcobetException {
    private static final long serialVersionUID = 1L;

    private CityNameForStateDoesntExistException(final String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static final CityNameForStateDoesntExistException create() {
        var userMessage = "No existe la ciudad con el ID indicado";
        return new CityNameForStateDoesntExistException(userMessage);
    }
}
