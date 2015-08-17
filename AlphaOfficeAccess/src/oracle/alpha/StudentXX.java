package oracle.alpha;

import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/AlphaOfficeAccess/StudentXX")
public class StudentXX {
    public StudentXX() {
        super();
    }

    @GET
    @Path("/sayHello")
    @Produces(MediaType.APPLICATION_JSON)

    public String sayHello() {
        String message;
        String firstName = "Mohammad";
        String lastName = "Esad-Djou";
        
        message = new String (firstName + "" + lastName + " - You have deployed a REST api to the Oracle Public Cloud");
        return message;
    }
}
