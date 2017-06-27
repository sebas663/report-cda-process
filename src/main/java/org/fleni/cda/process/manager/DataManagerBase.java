package org.fleni.cda.process.manager;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.fleni.cda.cxf.client.ExternalReportRemotingServiceClient;
import org.fleni.cda.externalreport.remoting.server.ExternalReportInformation;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class DataManagerBase implements IDataManager{
	
	/**
	 * 
	 */
	@Autowired
	private ExternalReportRemotingServiceClient soapClient;
	
	/**
	 * 
	 * @return
	 */
	abstract List<ExternalReportInformation> createListExternalReportInformation(List<String> lstIDs);
	
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.process.manager.IDataManager#processDataAndSend(java.util.List, int)
	 */
	@Override
	public void processDataAndSend(List<String> lstIDs, int chunkSize) {
		List<List<String>> l = getChunkList(lstIDs, chunkSize);
		for(List<String> chunkList : l){
			List<ExternalReportInformation> lstReport = createListExternalReportInformation(chunkList);
			soapClient.sendLstExternalReportInformation(lstReport);
		}
	}
	
	/**
	 * 
	 * @param source
	 * @param length
	 * @return
	 */
    static <T> Stream<List<T>> chunkList(List<T> source, int length) {
		if (length <= 0)
			throw new IllegalArgumentException("length = " + length);
		int size = source.size();
		if (size <= 0)
			return Stream.empty();
		int fullChunks = (size - 1) / length;
		return IntStream.range(0, fullChunks + 1)
				.mapToObj(n -> source.subList(n * length, n == fullChunks ? size : (n + 1) * length));
	}
	
    /**
     * 
     * @param lstIDs
     * @return
     */
	List<List<String>> getChunkList(List<String> lstIDs, int chunkSize){
		Stream<List<String>> f = chunkList(lstIDs, chunkSize);
		List<List<String>> l = f.collect(Collectors.toList());
		return l;
	}
}
