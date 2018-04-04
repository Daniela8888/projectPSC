package psc.resources;



import psc.Obec;
import psc.db.MySQL.MySQL;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;


@Path("/obec/")
    public class Service {
        @GET
        @Path("/get/{obec}")
        @Produces(MediaType.APPLICATION_JSON)
        public Response getPsc(@PathParam("obec") String obec) throws Exception {
            MySQL result = new MySQL() {
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
            result.getPscByObec(obec);
            return result;

        }






    }

