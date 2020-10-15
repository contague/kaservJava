package Model.SpringConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
                WebAppConfig.class
        };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebAppConfig.class
        };
    }

    protected String[] getServletMappings() {
        return new String[]{"/status", "/infoBlock", "/menu"};
    }
}
