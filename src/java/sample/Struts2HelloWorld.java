/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;

/**
 *
 * @author Santiago
 */


public class Struts2HelloWorld extends ActionSupport{
    
    public static final String MESSAGE = "Struts 2 Hello Wold Tutorial";
    
    public String execute() throws Exception{
        setMessage(MESSAGE);
        return SUCCESS;
    }
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getCurrentTime(){
        return new Date().toString();
    }
    
}
