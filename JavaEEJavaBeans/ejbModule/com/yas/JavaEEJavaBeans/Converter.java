package com.yas.JavaEEJavaBeans;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.LocalBean;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Converter
 */
@Stateless
@LocalBean
public class Converter implements SessionBean {

	/**
	 * Default constructor.
	 */
	public Converter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	public double conversion(double celsius) {
		return celsius * 1.8 + 32;
	}

}
