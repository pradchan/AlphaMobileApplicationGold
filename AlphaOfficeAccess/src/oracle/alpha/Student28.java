package oracle.alpha;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/AlphaOfficeAccess/Student28")
public class Student28 {
    public Student28() {
        super();
    }

    @GET
    @Path("/sayHello")
    @Produces(MediaType.APPLICATION_JSON)

    public String sayHello() {
        String message;
        String firstName = "Anton";
        String lastName = "Frank";
        
        message = new String (firstName + " " + lastName + " - You have deployed a REST api to the Oracle Public Cloud");
        return message;
    }

}
