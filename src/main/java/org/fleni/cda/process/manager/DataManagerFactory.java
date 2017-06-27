package org.fleni.cda.process.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author sebastian
 *
 */
public class DataManagerFactory {
	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory.getLogger(DataManagerFactory.class);

	/**
	 * 
	 * @param clazz
	 * @return
	 * @throws ClassNotFoundException
	 */
	public IDataManager getManager(String clazz) {
		IDataManager m = null;
		Class<?> c;
		try {
			c = Class.forName(clazz);
			m = (IDataManager) c.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return m;
	}
}
