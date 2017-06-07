/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Rosita
 */
@Stateless
@Path("/calculadora")
@DeclareRoles({"admins","users","manager"})
public class CalculadoraService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalculadoraService
     */
    public CalculadoraService() {
    }

    /**
     * Retrieves representation of an instance of seguridad.CalculadoraService
     * @return an instance of java.lang.String
     */
    @GET
    @RolesAllowed("users")
    @Produces("application/json")
    @Path("/factorial")
    public String factorial(@QueryParam("base")long base,@QueryParam("altura") long altura) {
        //TODO return proper representation object
        long a=(base*altura)/2;
        return String.valueOf(a);
    }

}
