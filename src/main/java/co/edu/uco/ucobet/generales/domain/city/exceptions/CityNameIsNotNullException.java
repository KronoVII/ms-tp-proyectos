package co.edu.uco.ucobet.generales.domain.city.exceptions;

public class CityNameIsNotNullException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CityNameIsNotNullException(String userMessage) {
        super(userMessage);
    }

    public static final CityNameIsNotNullException create() {
        var userMessage = "Nombre de ciudad es null";
        return new CityNameIsNotNullException(userMessage);
    }
}
