/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.restcors;

import javax.json.Json;
import javax.json.JsonObject;

public class BookJsonBuilder {  
       public JsonObject buildBook(){        
             return Json.createObjectBuilder()
                           .add("book", Json.createObjectBuilder()
                           .add("isbn", "12356789")
                           .add("title", "Algorithm")
                           .add("author", Json.createArrayBuilder()
                                        .add("Cormen")
                                        .add("Rivest")
                                        .add("Stein"))                                        
                           .add("price",45.78)).build();
       }
}