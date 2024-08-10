package org.example.app1;

import co.elastic.apm.attach.ElasticApmAttacher;

import org.springframework.boot.context.event.ApplicationReadyEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;



@Component
public class StartupListener {

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {


        var config = new HashMap<String, String>();
        config.put("service_name","App1");
        config.put("application_packages","org.example.app1");
        config.put("server_url","http://fleet-service:8200");
        config.put("verify_server_cert","false");
        config.put("use_path_as_transaction_name","true");
        config.put("log_sending","true");

        ElasticApmAttacher.attach(config);





    }

}
