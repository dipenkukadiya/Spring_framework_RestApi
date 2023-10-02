package com.clouder.rest.controller;

import com.clouder.rest.model.vendors;
import com.clouder.rest.repository.Cloudvendorrepo;

import service.cloudvendorservice;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class cloudvendorimple implements cloudvendorservice {

    Cloudvendorrepo cloudvendorrepo;

    public cloudvendorimple(Cloudvendorrepo cloudvendorrepo) {
        this.cloudvendorrepo = cloudvendorrepo;
    }

    @Override
    public String createCloudvendor(vendors vendors) {
        cloudvendorrepo.save(vendors);
        return "success";
    }

    @Override
    public String deleteCloudvendor(String cloudvendorID) {

        cloudvendorrepo.deleteById(cloudvendorID);
        return "success";
    }

    @Override
    public vendors getCloudvendor(String cloudvendorID) {
        return cloudvendorrepo.findById(cloudvendorID).get();
    }

    @Override
    public String updateCloudvendor(vendors vendors) {
        cloudvendorrepo.save(vendors);
        return "success";
    }

    @Override
    public List<vendors> getallclver() {

        return cloudvendorrepo.findAll();
    }

}
