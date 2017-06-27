package org.fleni.cda.process.manager;

import java.util.List;
/**
 * 
 * @author sebastian
 *
 */
public interface IDataManager {
	
	/**
	 * 
	 * @param lstIDs
	 */
	void processDataAndSend(List<String> lstIDs, int chunkSize);
}
