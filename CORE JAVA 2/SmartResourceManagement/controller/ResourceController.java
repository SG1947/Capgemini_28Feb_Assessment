package SmartResourceManagement.controller;

import SmartResourceManagement.model.Resource;
import SmartResourceManagement.exception.ResourceOverloadException;
import SmartResourceManagement.exception.CriticalFailureException;

public class ResourceController {

    public void monitor(Resource resource) {
        try {
            System.out.println("Current usage: " + resource.getUsage() + "%");
            resource.checkHealth();
            System.out.println("Resource is healthy");

        } catch (ResourceOverloadException e) {
            System.out.println(e.getMessage());

        } catch (CriticalFailureException e) {
            System.out.println( e.getMessage());

        } finally {
            System.out.println("Monitoring cycle completed.\n");
        }
    }
}
