package com.demo.api.version.path;

import org.springframework.context.annotation.*;
import org.springframework.http.*;
import org.springframework.web.accept.*;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class QueryParamConfig  implements WebMvcConfigurer {

    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        configurer.addSupportedVersions("V1.0","V2.0")
                .usePathSegment(1).setVersionRequired(true);

   }
}
