package service;

import java.util.List;



import com.clouder.rest.model.vendors;

public interface cloudvendorservice {
    public String createCloudvendor(vendors vendors);
    public String updateCloudvendor(vendors vendors);
    public String deleteCloudvendor(String cloudvendorID);
    public vendors getCloudvendor(String cloudvendorID);
    public List<vendors> getallclver();

}
