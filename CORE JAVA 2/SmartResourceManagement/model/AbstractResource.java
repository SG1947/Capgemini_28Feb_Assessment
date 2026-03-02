package SmartResourceManagement.model;

import SmartResourceManagement.exception.CriticalFailureException;
import SmartResourceManagement.Driver;
import SmartResourceManagement.Driver.Resource;


abstract class AbstractResource implements Resource {
    private int usage;

    protected void setUsage(int usage) {
        if (usage < 0 || usage > 100) {
            throw new CriticalFailureException("Invalid resource usage");
        }
        this.usage = usage;
    }

    public int getUsage() {
        return usage;
    }
}