package SmartResourceManagement.model;

import SmartResourceManagement.exception.ResourceOverloadException;

public class MemoryResource extends AbstractResource{
	MemoryResource(int usage) {
        setUsage(usage);
    }

    public void checkHealth() throws ResourceOverloadException {
        if (getUsage() > 75) {
            throw new ResourceOverloadException("Memory overloaded");
        }
    }
}

