package prac19_INN;

import java.math.BigInteger;

public class InnNotValidException extends Exception {

    private final BigInteger innNum;

    public InnNotValidException(BigInteger inn){
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}
