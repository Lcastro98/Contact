package com.sofka.util;

/**
 * Clase para encapsular errores
 *
 * @version 1.00.00 2022-03-13 la clase corresponde a la versión 1 del sistema.
 *
 * @author Lorena Castro <lcastro0398@gmail.com>
 */
public class Response {
    public Boolean error = false;
    public String message = "";
    public String status = "OK";
    public Object data;
}
