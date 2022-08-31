package com.jhooq.demo.Jhooqdockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JhooqDockerDemoController {

    @GetMapping("/night")
    public String hello() {
        return "Deploying The Server Using Kubernetes using the Jenkins Contineous Integration Tool";
    }
}
