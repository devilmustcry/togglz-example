package com.example.toggle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FeatureAspect {

    @Around(value = "@within(featureSwitch) || @annotation(featureSwitch)")
    public Object checkAspect(ProceedingJoinPoint joinPoint, FeatureSwitch featureSwitch) throws Throwable {
        if(featureSwitch.value().isActive()) {
            return joinPoint.proceed();
        } else {
            throw new RuntimeException("Feature is closed");
        }
    }
}
