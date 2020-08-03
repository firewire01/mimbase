/**
 * CLASS: InteractionController
 * REST API Controller for handling interaction request
 *
 * @author Alex Ramil Aguel
 * @date   04/04/2017
 */

package com.elisharedservices.mims.controller;

import com.elisharedservices.mims.core.FastTrack;
import com.elisharedservices.mims.model.*;
import com.elisharedservices.mims.service.InteractionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/mims/interaction")
public class InteractionController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FastTrack ft;

    @Autowired
    private InteractionService interactionService;

    @RequestMapping(method = RequestMethod.POST, headers="Accept=application/json", value = "/prescribing-prescribe", produces = { "application/xml", "text/xml" })
    public String getPrescribingAndPrescribed(@RequestBody InteractionRequestBody requestBody) {
        if(requestBody.getPrescribing() == null){
            throw new IllegalStateException("Prescribing is required.");
        }
        String xml = interactionService.getRequest(requestBody.getPrescribing(), requestBody.getPrescribed());
        logger.info(xml);
        return ft.getResult(xml);
    }

    @RequestMapping(method = RequestMethod.POST, headers="Accept=application/json", value = "/allergies", produces = { "application/xml", "text/xml" })
    public String getAllergies(@RequestBody InteractionRequestBody requestBody) {
        if(requestBody.getPrescribing() == null){
            throw new IllegalStateException("Prescribing is required.");
        }
        String xml = interactionService.getRequest(requestBody.getPrescribing(), requestBody.getAllergies());
        logger.info(xml);
        return ft.getResult(xml);
    }

    @RequestMapping(method = RequestMethod.POST, headers="Accept=application/json", value = "/health-issues", produces = { "application/xml", "text/xml" })
    public String getHealthIssue(@RequestBody InteractionRequestBody requestBody) {
        if(requestBody.getPrescribing() == null){
            throw new IllegalStateException("Prescribing is required.");
        }
        String xml = interactionService.getRequest(requestBody.getPrescribing(), requestBody.getHealthIssue());
        logger.info(xml);
        return ft.getResult(xml);
    }

    @RequestMapping(method = RequestMethod.POST, headers="Accept=application/json", value = "/health-issue-codes", produces = { "application/xml", "text/xml" })
    public String getHealthIssueCodes(@RequestBody InteractionRequestBody requestBody) {
        if(requestBody.getPrescribing() == null){
            throw new IllegalStateException("Prescribing is required.");
        }
        String xml = interactionService.getRequest(requestBody.getPrescribing(), requestBody.getHealthIssueCodes());
        logger.info(xml);
        return ft.getResult(xml);
    }

    @RequestMapping(method = RequestMethod.POST,  headers="Accept=application/json", value = "/type/{type}", produces = { "application/xml", "text/xml" })
    public String getRequestByType(@RequestBody Prescribing prescribing,
                                @PathVariable("type") String interactionType) {
        if(prescribing == null){
            throw new IllegalStateException("Prescribing is required.");
        }
        String xml = interactionService.getRequestByType(prescribing, InteractionTypeEnum.valueOf(interactionType.toUpperCase()));
        logger.info(xml);
        return ft.getResult(xml);
    }

    @RequestMapping(method = RequestMethod.POST, headers="Accept=application/json", value = "/prescribing", produces = { "application/xml", "text/xml" })
    public String getRequestByType(@RequestBody Prescribing prescribing) {
        if(prescribing == null){
            throw new IllegalStateException("Prescribing is required.");
        }
        String xml = interactionService.getRequest(prescribing);
        logger.info(xml);
        return ft.getResult(xml);
    }

    @RequestMapping(method = RequestMethod.POST, headers="Accept=application/json", value = "/request", produces = { "application/xml", "text/xml" })
    public String getRequest(@RequestBody InteractionRequestBody requestBody) {

        if(requestBody.getPrescribing() == null){
            throw new IllegalStateException("Prescribing is required.");
        }

        String xml = interactionService.getRequest(requestBody.getPrescribing(),requestBody.getPrescribed(),
                requestBody.getAllergies(),requestBody.getHealthIssue(), requestBody.getHealthIssueCodes());
        logger.info(xml);
        return ft.getResult(xml);
    }

    @RequestMapping(method = RequestMethod.POST, headers="Accept=application/json", value = "/request/xml", produces = { "application/xml", "text/xml" })
    public String getRequest(@RequestBody String xml) {

        if(xml == null){
            throw new IllegalStateException("xml request should not be empty.");
        }

        logger.info(xml);
        return ft.getResult(xml);
    }
}
