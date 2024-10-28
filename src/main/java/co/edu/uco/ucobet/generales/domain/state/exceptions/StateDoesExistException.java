package co.edu.uco.ucobet.generales.domain.state.exceptions;

import co.edu.uco.ucobet.generales.domain.city.exceptions.CityNameFormatIsValidException;

public class StateDoesExistException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private StateDoesExistException(String userMessage) {
        super(userMessage);
    }

    public static final StateDoesExistException create() {
        var userMessage = "El state no existe";
        return new StateDoesExistException(userMessage);
    }
}
