package jovace.mytube.srvusuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SrvUsuariosApplication extends SpringBootServletInitializer {
	static ConfigurableApplicationContext ctx;

	public static void main(String[] args) {
		try {
			ctx = SpringApplication.run(SrvUsuariosApplication.class, args);
		} catch (Exception ex) {
		}
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SrvUsuariosApplication.class);
    }
}
