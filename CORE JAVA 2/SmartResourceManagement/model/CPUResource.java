package SmartResourceManagement.model;

import SmartResourceManagement.model.AbstractResource;
import SmartResourceManagement.exception.ResourceOverloadException;

public class CPUResource extends AbstractResource{
	public CPUResource(int usage) {
        setUsage(usage);
    }

    public void checkHealth() throws ResourceOverloadException {
        if (getUsage() > 80) {
            throw new ResourceOverloadException("CPU overloaded");
        }
    }
}



