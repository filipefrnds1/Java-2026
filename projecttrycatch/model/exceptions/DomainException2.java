package projecttrycatch.model.exceptions;

import java.io.Serial;

public class DomainException2 extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException2(String msg){
        super(msg);
    }
}
