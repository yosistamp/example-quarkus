package org.acme.getting.started;

import org.jboss.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    private static final Logger LOG = Logger.getLogger(GreetingService.class);

    public String greeting(String name) {
        LOG.info("start GreetingService greeting");
        return "hello " + name;
    }

}
