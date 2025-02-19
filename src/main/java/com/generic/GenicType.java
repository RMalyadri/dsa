package com.generic;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;


public class GenicType<T> {
	private static Logger logger = System.getLogger("GenicType");
    private T t;
    public GenicType(T t) {
    	this.t = t;
    }
    
    public void display() {
    	logger.log(Level.INFO, t);
    }
}
