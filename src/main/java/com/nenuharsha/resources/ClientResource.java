package com.nenuharsha.resources;

import com.nenuharsha.ErrorHandler;
import com.nenuharsha.representations.IFSC;
import com.nenuharsha.views.InsertIFSC;
import com.nenuharsha.views.InvalidCode;
import com.nenuharsha.views.ViewIFSCDetails;
import io.dropwizard.views.View;

import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

@Path("/ifsc")
@Produces(MediaType.APPLICATION_JSON)
public class ClientResource {
    private Client client;
    Executor executor = Executors.newFixedThreadPool(10);
    public ClientResource(Client client){
        this.client=client;
    }

    @GET
    @Path("/insert")
    @Produces(MediaType.TEXT_HTML)
    public InsertIFSC insertIFSCCode(){
        return new InsertIFSC();
    }

    @GET
    @Path("/{code}")
    @Produces(MediaType.APPLICATION_JSON)
//    In multithreaded environment just for practice
//    public Response viewIFSCDetails(@PathParam("code") String code) throws ExecutionException, InterruptedException {
//        try{
//            CompletableFuture<IFSC> future = CompletableFuture.supplyAsync(new Supplier<IFSC>() {
//                @Override
//                public IFSC get() {
//                    WebTarget webTarget = client.target("https://ifsc.razorpay.com/"+code);
//                    IFSC details = webTarget.request(MediaType.APPLICATION_JSON_TYPE).get(IFSC.class);
//                    System.out.println("####################################"+Thread.currentThread().getName());
//                    return details;
//                }
//            },executor);
//            IFSC result = future.get();
//            return Response.status(Response.Status.OK).entity(result).build();
//        }
//        catch (Exception e){
//            return Response.noContent().build();
//        }
//    }
    public Response viewIFSCDetails(@PathParam("code") String code){
        WebTarget webTarget = client.target("https://ifsc.razorpay.com/"+code);
        IFSC details = webTarget.request(MediaType.APPLICATION_JSON_TYPE).get(IFSC.class);
        return Response.status(Response.Status.OK).entity(details).build();
    }

}
