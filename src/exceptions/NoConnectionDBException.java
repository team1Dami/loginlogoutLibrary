/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.Serializable;

/**
 *
 * @author saray
 */
public class NoConnectionDBException extends Exception implements Serializable {

    private String message;

    public NoConnectionDBException(String log) {
        this.message = log;
    }

    public NoConnectionDBException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMessage() {
        if (message == null) {
            return "The connection with the DB has failled";
        } else {
            return null;
        }
    }
}
