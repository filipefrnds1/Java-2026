package projecttrycatch.model.exceptions;

import java.io.Serial;

public class DomainExceptionAccount2 extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;
    
    public DomainExceptionAccount2(String msg){
        super(msg);
    }
}
