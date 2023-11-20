package com.clouder.rest.controller;
import java.util.List;
import service.cloudvendorservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clouder.rest.model.vendors;
 

@RestController
@RequestMapping("/cvendors")
public class vendorController {

    cloudvendorservice Cloudvendorservice;

    public vendorController(cloudvendorservice Cloudvendorservice) {
        this.Cloudvendorservice = Cloudvendorservice;
      }

    @GetMapping("{vendor_id}")
    public vendors getCloudvendorDetails(@PathVariable("vendor_id") String vendor_id) {

        return Cloudvendorservice.getCloudvendor(vendor_id);
    } 
    //all
    @GetMapping()
    public List<vendors> getallcloudvendordetails(){
        return Cloudvendorservice.getallclver(); 
    }

    @PostMapping
    public String createcloudvendordetails(@RequestBody vendors ven) {

        Cloudvendorservice.createCloudvendor(ven);
        return "successfully created cloud vendors";

    }

    @PutMapping
    public String updatecloudvendordetails(@RequestBody vendors ven) {

       Cloudvendorservice.updateCloudvendor(ven);
        return "successfully update cloud vendors";

    }

    @DeleteMapping("{vendor_id}")
    public String deletecloudvendordetails(@PathVariable("vendor_id")String vendor_id) {

    Cloudvendorservice.deleteCloudvendor(vendor_id); 
        return "successfully delete cloud vendors";

    }
}
