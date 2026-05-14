package projecttrycatch.model.exceptions;

import java.io.Serial;

public class DomainExceptionAccount3 extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public DomainExceptionAccount3(String msg){
        super(msg);
    }
}
