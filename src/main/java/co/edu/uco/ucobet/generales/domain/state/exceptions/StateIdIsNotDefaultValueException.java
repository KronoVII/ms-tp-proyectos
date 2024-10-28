package co.edu.uco.ucobet.generales.domain.state.exceptions;

public class StateIdIsNotDefaultValueException extends RuntimeException{


    private static final long serialVersionUID = 1L;
    private StateIdIsNotDefaultValueException(String userMessage) {
        super(userMessage);
    }

    public static final StateIdIsNotDefaultValueException create() {
        var userMessage = "El id del estado es default";
        return new StateIdIsNotDefaultValueException(userMessage);
    }
}
