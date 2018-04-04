package psc;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import psc.db.MySQL.MySQL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class PSCApplication extends Application<PSCConfiguration> {

    public static void main(final String[] args) throws Exception {
        new PSCApplication().run(args);
    }

    @Override
    public String getName() {
        return "com.psc";
    }


    @Override
    public void initialize(final Bootstrap<PSCConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final PSCConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }



    @GET
    @Path("/get/{psc}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getObec(@PathParam("psc") String psc) throws Exception {

        MySQL result1 = new MySQL() {
            @Override
            public int getStatus() {
                return 0;
            }

            @Override
            public StatusType getStatusInfo() {
                return null;
            }

            @Override
            public Object getEntity() {
                return null;
            }

            @Override
            public <T> T readEntity(Class<T> aClass) {
                return null;
            }

            @Override
            public <T> T readEntity(GenericType<T> genericType) {
                return null;
            }

            @Override
            public <T> T readEntity(Class<T> aClass, Annotation[] annotations) {
                return null;
            }

            @Override
            public <T> T readEntity(GenericType<T> genericType, Annotation[] annotations) {
                return null;
            }

            @Override
            public boolean hasEntity() {
                return false;
            }

            @Override
            public boolean bufferEntity() {
                return false;
            }

            @Override
            public void close() {

            }

            @Override
            public MediaType getMediaType() {
                return null;
            }

            @Override
            public Locale getLanguage() {
                return null;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public Set<String> getAllowedMethods() {
                return null;
            }

            @Override
            public Map<String, NewCookie> getCookies() {
                return null;
            }

            @Override
            public EntityTag getEntityTag() {
                return null;
            }

            @Override
            public Date getDate() {
                return null;
            }

            @Override
            public Date getLastModified() {
                return null;
            }

            @Override
            public URI getLocation() {
                return null;
            }

            @Override
            public Set<Link> getLinks() {
                return null;
            }

            @Override
            public boolean hasLink(String s) {
                return false;
            }

            @Override
            public Link getLink(String s) {
                return null;
            }

            @Override
            public Link.Builder getLinkBuilder(String s) {
                return null;
            }

            @Override
            public MultivaluedMap<String, Object> getMetadata() {
                return null;
            }

            @Override
            public MultivaluedMap<String, String> getStringHeaders() {
                return null;
            }

            @Override
            public String getHeaderString(String s) {
                return null;
            }
        };
        result1.getPscByObec( psc);

        return result1;
    }

}
