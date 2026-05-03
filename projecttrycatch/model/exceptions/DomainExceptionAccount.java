package projecttrycatch.model.exceptions;

import java.io.Serial;

public class DomainExceptionAccount extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public DomainExceptionAccount(String msg){
        super(msg);
    }
}
