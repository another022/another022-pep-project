package DAO;

//custom unchecked exception
//DaoException(String message)
//DaoException(String message, Throwable cause)
public class DaoException extends RuntimeException {
    //version control identifier for serialization
    private static final long serialVersionUID = 1L;

    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }
}