package co.edu.uco.ucobet.generales.domain.city.exceptions;

public class CityStateDoesntExistException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private CityStateDoesntExistException(String userMessage) {
        super(userMessage);
    }

    public static final CityStateDoesntExistException create() {
        var userMessage = "El estado no existe";
        return new CityStateDoesntExistException(userMessage);
    }
}
