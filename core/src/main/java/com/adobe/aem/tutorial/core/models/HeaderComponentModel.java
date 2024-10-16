package com.adobe.aem.tutorial.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderComponentModel {

    @Inject
    private String homePage;

    @Inject
    private String homePageUrl;

    @Inject
    private String aboutPage;

    @Inject
    private String signupUrl;

    @Inject
    private String signupPage;

    @Inject
    private String loginPagePath;

    @Inject
    private String logintitle;

    @Inject
    private String myaccountPagePath;

    @Inject
    private String myaccountTitle;

    @Inject
    private  String logoImage;

    @Inject
    private List<HeaderComponentSubNavigationModel> aboutUsSubNavigation;

    public String getHomePage() {
        return homePage;
    }

    public String getHomePageUrl() {
        return homePageUrl;
    }

    public String getAboutPage() {
        return aboutPage;
    }

    public String getSignupUrl() {
        return signupUrl;
    }

    public String getSignupPage() {
        return signupPage;
    }

    public String getLoginPagePath() {
        return loginPagePath;
    }

    public String getLogintitle() {
        return logintitle;
    }

    public String getMyaccountPagePath() {
        return myaccountPagePath;
    }

    public String getMyaccountTitle() {
        return myaccountTitle;
    }

    public String getLogoImage() {
        return logoImage;
    }

    public List<HeaderComponentSubNavigationModel> getAboutUsSubNavigation() {
        return aboutUsSubNavigation;
    }
}
