package uk.co.bbc.config;



        import org.springframework.context.annotation.*;
        import org.springframework.web.servlet.config.annotation.EnableWebMvc;
        import org.springframework.web.servlet.view.JstlView;
        import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan(value = "uk.co.bbc")
@Import(WebConfig.class)
public class AppConfig {

}