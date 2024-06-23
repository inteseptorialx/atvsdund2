package com.caio.servidor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;

@RestController
public class ControladorDNS {
	
    @Autowired
    private DiscoveryClient descobreCliente;

    @GetMapping("/resolve/{nomeAplicacao}")
    public java.util.List<InstanceInfo> resolve(@PathVariable String nomeAplicacao) {
        return this.descobreCliente.getInstancesById(nomeAplicacao);
    }
	
}
