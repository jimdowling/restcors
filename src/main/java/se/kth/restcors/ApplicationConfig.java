/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.restcors;

import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Application;

/**
 *
 * @author jdowling
 */
@javax.ws.rs.ApplicationPath("/resources")
public class ApplicationConfig extends Application {

    @PersistenceContext(unitName = "myPU")
    private EntityManager entityManager;
    
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(person.PersonResource.class);
        resources.add(se.kth.restcors.ItemResource.class);
        resources.add(se.kth.restcors.ItemsResource.class);
        resources.add(se.kth.restcors.RESTCorsDemoRequestFilter.class);
        resources.add(se.kth.restcors.RESTCorsDemoResource.class);
        resources.add(se.kth.restcors.RESTCorsDemoResponseFilter.class);
    }
    
}
