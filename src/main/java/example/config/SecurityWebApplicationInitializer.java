package example.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.security.web.session.HttpSessionEventPublisher;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    @Override
    protected boolean enableHttpSessionEventPublisher() {
        return true;
    }
}
