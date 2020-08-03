
/**
 * CLASS: FastTrack
 * Controller class for FastTrack MR2 DB interface
 *
 * @author Alex Ramil Aguel
 * @date   04/04/2017
 */

package com.elisharedservices.mims.core;

import com.mims.cds.FastTrackDSM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FastTrack {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${mims.password}")
	private String password;
	
	@Value("${mims.db}")
	private String database;

	
	/**
	 * Send request to FastTrack SDK and get response
	 * Added 04/05/2017 - Alex Ramil Aguel
	 */
	
	public String getResult(String xml) {
		FastTrackDSM ft = new FastTrackDSM();
		logger.info(xml);
		
		String result = "<error>Unable to open data file</error>";
        if (ft.open(database, password)) {
        	result = ft.requestXml(xml);
        }
        ft.release();
        
	    return result;
	}
	

}
