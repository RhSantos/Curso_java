package secao21.src.db;

public class DBIntegrityException extends RuntimeException{
    public DBIntegrityException(String msg){
        super(msg);
    }
}
