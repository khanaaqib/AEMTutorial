package com.adobe.aem.tutorial.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.Required;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderComponentSubNavigationModel {

    @Inject
    private String subNavTitle;

    @Inject
    private String subNavUrl;

    public String getSubNavTitle() {
        return subNavTitle;
    }

    public String getSubNavUrl() {
        return subNavUrl;
    }
}
