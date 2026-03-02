package SmartResourceManagement.model;

import SmartResourceManagement.exception.ResourceOverloadException;
import SmartResourceManagement.model.AbstractResource;

public class DiskResource extends AbstractResource {
	DiskResource(int usage) {
        setUsage(usage);
    }

    public void checkHealth() throws ResourceOverloadException {
        if (getUsage() > 90) {
            throw new ResourceOverloadException("Disk overloaded");
        }
    }
}
