package co.edu.uco.ucobet.generales.domain.city.exceptions;

public class CityNameIsNotEmptyException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private CityNameIsNotEmptyException(String userMessage) {
        super(userMessage);
    }

    public static final CityNameIsNotEmptyException create() {
        var userMessage = "Nombre de ciudad es null";
        return new CityNameIsNotEmptyException(userMessage);
    }
}
