/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.restcors;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;

/**
 * REST Web Service
 *
 * @author jdowling
 */
public class ItemResource {

    private String id;

    /**
     * Creates a new instance of ItemResource
     */
    private ItemResource(String id) {
        this.id = id;
    }

    /**
     * Get instance of the ItemResource
     */
    public static ItemResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of ItemResource class.
        return new ItemResource(id);
    }

    /**
     * Retrieves representation of an instance of se.kth.restcors.ItemResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        
//try{
//       JsonReader jsonReader = Json.createReader(new FileReader("book.json"));
//       JsonObject jsonObject = jsonReader.readObject();
//       jsonObject = jsonObject.getJsonObject("book");
//}catch(FileNotFoundException ex){}
        
        
//JsonGeneratorFactory factory = Json.createGeneratorFactory(null);
//JsonGenerator generator = factory.createGenerator(System.out);
//generator.writeStartObject()
//      .write("isbn","12356789")
//      .write("title","Algorithm")
//      .writeStartArray("author")
//            .write("Cormen")
//            .write("Rivest")
//            .write("Stein")
//      .writeEnd()
//      .write("price","45.78")      
//.writeEnd();
        return new BookJsonBuilder().buildBook().toString();
    }

    /**
     * PUT method for updating or creating an instance of ItemResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putJson(String content) {
    }

    /**
     * DELETE method for resource ItemResource
     */
    @DELETE
    public void delete() {
    }
}
