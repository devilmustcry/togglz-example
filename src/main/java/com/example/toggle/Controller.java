package com.example.toggle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    public FeatureService featureService;

    @GetMapping("/feature-toggle")
    @FeatureSwitch(MyFeatures.FEATURE_1)
    public String test() {
        return featureService.someFeature();
    }
}
