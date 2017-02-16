import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;



@Path("/")
public class ExtremeStartupResource {

    @GET
    public Response getResponse() {
        return Response.ok("Hello").build();
    }
}