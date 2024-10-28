package co.edu.uco.ucobet.generales.domain.city.exceptions;

public class CityNameLenghtIsValidException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CityNameLenghtIsValidException(String userMessage) {
        super(userMessage);
    }

    public static final CityNameLenghtIsValidException create() {
        var userMessage = "Nombre de ciudad esta vacio";
        return new CityNameLenghtIsValidException(userMessage);
    }
}
