package restservice;



import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path( "message" )
public class MessageResource
{
  @GET
  @Produces( MediaType.TEXT_XML )
  public String message()
  {
    String xml = "<xml> <text> Server at SFitzner </text></xml>";
    return xml;
  }
  
@GET @Produces( MediaType.TEXT_PLAIN )
@Path("double/{value}")
public String message( @PathParam("value") String value )
{
  return (Integer.valueOf(value) * 2)+"";
}

@GET
@Produces( MediaType.TEXT_PLAIN )
@Path("user/{user}/search/{search}")
public String message( @PathParam("user") String user,
                       @PathParam("search") String search )
{
  return String.format( "Benutzer = %s, Suchstring = %s", user, search );
}


@POST
@Path( "user/{user}" )
@Consumes( MediaType.TEXT_PLAIN )
@Produces( MediaType.TEXT_PLAIN )
public String postMessage( @PathParam("user") String user, String message )
{
  return String.format( "%s sendet '%s'%n", user, message );
}
  
}