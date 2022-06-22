package org.acme;

import io.vertx.core.json.JsonObject;
import io.vertx.mutiny.pgclient.PgPool;
import org.acme.Model.Order1;
import org.jboss.resteasy.reactive.RestResponse;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("order")
public class OrderResource {

    @Inject
    PgPool client;


    @Inject
    Order1 order;




    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RestResponse<JsonObject> addOrder(JsonObject body){

        JsonObject j = new JsonObject();

        client.query("").execute().await().indefinitely();
        return RestResponse.ResponseBuilder.ok(j).build();
    }


}
