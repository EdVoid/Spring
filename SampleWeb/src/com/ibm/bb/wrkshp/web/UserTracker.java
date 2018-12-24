package com.ibm.bb.wrkshp.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class UserTracker
 *
 */
@WebListener
public class UserTracker implements HttpSessionListener {
	static int users = 0;
    /**
     * Default constructor. 
     */
    public UserTracker() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         users++;
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         users--;
    }
	
    public static int getUsers() {
    	return users;
    }
}
