package com.nenuharsha;

import com.nenuharsha.ifscCodeConfiguration.IFSCConfig;
import com.nenuharsha.resources.ClientResource;
import io.dropwizard.Application;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

import javax.ws.rs.client.Client;

public class App extends Application<IFSCConfig> {

    @Override
    public void initialize(Bootstrap<IFSCConfig> bootstrap) {
        bootstrap.addBundle(new ViewBundle<IFSCConfig>());
    }

    @Override
    public void run(IFSCConfig ifscConfig, Environment environment) throws Exception {
        final Client client = new JerseyClientBuilder(environment).build("REST Client");
        environment.jersey().register(new ClientResource(client));
    }
    public static void main( String[] args ) throws Exception {
        new App().run(args);
    }
}
