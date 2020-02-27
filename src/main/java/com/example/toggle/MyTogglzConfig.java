package com.example.toggle;

import org.springframework.context.annotation.Configuration;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.user.UserProvider;
import org.togglz.spring.security.SpringSecurityUserProvider;

@Configuration
public class MyTogglzConfig implements TogglzConfig {


    @Override
    public Class<? extends Feature> getFeatureClass() {
        return null;
    }

    @Override
    public StateRepository getStateRepository() {
        return null;
    }

    @Override
    public UserProvider getUserProvider() {
        return new SpringSecurityUserProvider("ADMIN_AUTHORITY");
    }
}
