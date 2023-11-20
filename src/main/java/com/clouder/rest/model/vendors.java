package com.clouder.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info")
public class vendors {
    @Id
    private String vendor_id;
    private String vendor_name;
    private String vendor_Address;
    private String vendor_mnum;
    private String vendor_age ;

    
    
    public String getVendor_age() {
        return vendor_age;
    }

    public void setVendor_age(String vendor_age) {
        this.vendor_age = vendor_age;
    }

    public vendors() {
    }

    @Override
    public String toString() {
        return "vendors [vendor_id=" + vendor_id + ", vendor_name=" + vendor_name + ", vendor_Address=" + vendor_Address
                + ", vendor_mnum=" + vendor_mnum + "]";
    }

    public vendors(String vendor_id, String vendor_name, String vendor_Address, String vendor_mnum) {
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_name;
        this.vendor_Address = vendor_Address;
        this.vendor_mnum = vendor_mnum;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_Address() {
        return vendor_Address;
    }

    public void setVendor_Address(String vendor_Address) {
        this.vendor_Address = vendor_Address;
    }

    public String getVendor_mnum() {
        return vendor_mnum;
    }

    public void setVendor_mnum(String vendor_mnum) {
        this.vendor_mnum = vendor_mnum;
    }

}
