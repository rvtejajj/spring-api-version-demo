package com.spring.api.version.media.type;

import org.springframework.context.annotation.*;
import org.springframework.http.*;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class QueryParamConfig  implements WebMvcConfigurer {

    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        configurer.addSupportedVersions("1.0","2.0")
                .setDefaultVersion("1.0")
                .useMediaTypeParameter(MediaType.APPLICATION_JSON,"version");
    }
}
