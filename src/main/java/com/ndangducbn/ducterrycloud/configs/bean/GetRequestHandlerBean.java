package com.ndangducbn.ducterrycloud.configs.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetRequestHandlerBean {
    private final RequestMappingHandlerMapping handlerMapping;
    private List<String> patterns;

    public GetRequestHandlerBean(RequestMappingHandlerMapping handlerMapping) {
        this.handlerMapping = handlerMapping;
    }

    public List<String> getPatterns() {
        if (this.patterns == null) {
            patterns = new ArrayList<>();
            for (RequestMappingInfo requestMappingInfo : this.handlerMapping.getHandlerMethods().keySet()) {
                for (String pattern : requestMappingInfo.getPatternsCondition().getPatterns()) {
                    patterns.add(pattern);
                }
            }
            return patterns;
        } else {
            return patterns;
        }
    }
}
