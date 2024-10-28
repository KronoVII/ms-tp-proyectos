package co.edu.uco.ucobet.generales.domain.city.exceptions;

public class CityNameFormatIsValidException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private CityNameFormatIsValidException(String userMessage) {
        super(userMessage);
    }

    public static final CityNameFormatIsValidException create() {
        var userMessage = "Nombre de ciudad no es en valido formato";
        return new CityNameFormatIsValidException(userMessage);
    }
}
