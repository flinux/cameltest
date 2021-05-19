package net.internetidee.cameltest.component;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FirstTestRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:///Users/IdeaProjects/cameltest?noop=true&recursive=true")
        .to("jms:queue:my-queue-1");
    }
}
