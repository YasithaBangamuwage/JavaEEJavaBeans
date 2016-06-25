package com.yas.JavaEEJavaBeans;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJBException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.RemoveException;

/**
 * Session Bean implementation class DataAccessor
 */

public class DataAccessor implements EntityBean {

	private List<String> data;

	/**
	 * Default constructor.
	 */
	public DataAccessor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbLoad() throws EJBException, RemoteException {
		Path p = FileSystems.getDefault().getPath("Datasource.txt");
		Charset c = Charset.defaultCharset();
		try {
			data = Files.readAllLines(p, c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbRemove() throws RemoveException, EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbStore() throws EJBException, RemoteException {
		Path p = FileSystems.getDefault().getPath("Datasource.txt");
		Charset c = Charset.defaultCharset();
		try {
			Files.write(p, data, c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void modifyData(int line, String newData) {
		data.set(line, newData);
	}
	
	@Override
	public void setEntityContext(EntityContext arg0) throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void unsetEntityContext() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

}
