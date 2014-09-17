package ex1;

/**
 * @author KOSTA
 * Document : UserException Created on : 2014. 9. 16, ¿ÀÀü 10:49:41
 */
public class UserException extends Exception{
    private int port = 772;
    public UserException(String message){
        super(message);
    }
    public UserException(String message, int port){
        super(message);
        this.port = port;
        
    }
    public int getPort(){
        return port;
    }
}
