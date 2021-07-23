package com.example.listeners;

import org.kie.dmn.api.core.event.AfterEvaluateBKMEvent;
import org.kie.dmn.api.core.event.AfterEvaluateContextEntryEvent;
import org.kie.dmn.api.core.event.AfterEvaluateDecisionServiceEvent;
import org.kie.dmn.api.core.event.AfterEvaluateDecisionTableEvent;
import org.kie.dmn.api.core.event.BeforeEvaluateBKMEvent;
import org.kie.dmn.api.core.event.BeforeEvaluateContextEntryEvent;
import org.kie.dmn.api.core.event.BeforeEvaluateDecisionEvent;
import org.kie.dmn.api.core.event.BeforeEvaluateDecisionServiceEvent;
import org.kie.dmn.api.core.event.BeforeEvaluateDecisionTableEvent;
import org.kie.dmn.api.core.event.DMNRuntimeEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DMNTraceEventListener implements DMNRuntimeEventListener {
    protected static final Logger LOGGER = LoggerFactory.getLogger(DMNTraceEventListener.class);


    public void beforeEvaluateDecision(BeforeEvaluateDecisionEvent event) {
      LOGGER.info("beforeEvaluateDecision: " + event.toString());

    }

    public void beforeEvaluateBKM(BeforeEvaluateBKMEvent event) {
      LOGGER.info("beforeEvaluateBKM: " + event.toString());
    }
    
    public void afterEvaluateBKM(AfterEvaluateBKMEvent event) {
        LOGGER.info("afterEvaluateBKM: " + event.toString());
    }
    
    public void beforeEvaluateContextEntry(BeforeEvaluateContextEntryEvent event) {
        LOGGER.info("beforeEvaluateContextEntry: " + event.toString());
    }
    
    public void afterEvaluateContextEntry(AfterEvaluateContextEntryEvent event) {
        LOGGER.info("afterEvaluateContextEntry: " + event.toString());
    }
    
    public void beforeEvaluateDecisionTable(BeforeEvaluateDecisionTableEvent event) {
      LOGGER.info("beforeEvaluateDecisionTable: " + event.toString());
    }
    
    public void afterEvaluateDecisionTable(AfterEvaluateDecisionTableEvent event) {
        LOGGER.info("afterEvaluateDecisionTable: " + event.toString());
    }
    
    public void beforeEvaluateDecisionService(BeforeEvaluateDecisionServiceEvent event) {
        LOGGER.info("beforeEvaluateDecisionService: " + event.toString());
    }
    
    public void afterEvaluateDecisionService(AfterEvaluateDecisionServiceEvent event) {
        LOGGER.info("afterEvaluateDecisionService: " + event.toString());
    }
}
