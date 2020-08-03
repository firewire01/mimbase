
/**
 * CLASS: HealthIssueController
 * REST API Controller for handling health issue request
 *
 * @author Alex Ramil Aguel
 * @date   04/04/2017
 */

package com.elisharedservices.mims.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elisharedservices.mims.core.FastTrack;
import com.elisharedservices.mims.core.Utility;

@CrossOrigin
@RestController
@RequestMapping("/mims/health")
public class HealthIssueController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FastTrack ft;
	
	/**
	 * Returns the list of health issues
	 * Added 04/05/2017 - Alex Ramil Aguel
	 */
	
	@RequestMapping(produces = { "application/xml", "text/xml" })
	public String getHealthIssues() {	
		String xml = Utility.generateRequest("List", Utility.addElement("HealthIssue", "ByName", ""));
		logger.info(xml);
		return ft.getResult(xml);
	}
	
	/**
	 * Search health issue by name 
	 * Added 04/05/2017 - Alex Ramil Aguel
	 */
	
	@RequestMapping(value = "/searchByName/{name}", produces = { "application/xml", "text/xml" })
	public String searchByName(@PathVariable String name) {		
		String xml = Utility.generateRequest("List", Utility.addElement("HealthIssue", "ByName", "%"+name+"%"));
		logger.info(xml);
		return ft.getResult(xml);
	}	
	
	
	/**
	 * Search health issue by reference GUID 
	 * Added 04/05/2017 - Alex Ramil Aguel
	 */
	
	@RequestMapping(value = "/searchByReference/{reference}", produces = { "application/xml", "text/xml" })
	public String searchByReference(@PathVariable String reference) {		
		String xml = Utility.generateRequest("List", Utility.addAttribute("HealthIssue", "ByReference", "reference", reference));
		logger.info(xml);
		return ft.getResult(xml);
	}		
	
	
}
