package SmartResourceManagement.model;

import SmartResourceManagement.exception.ResourceOverloadException;


interface Resource {
    int getUsage();
    void checkHealth() throws ResourceOverloadException;
}