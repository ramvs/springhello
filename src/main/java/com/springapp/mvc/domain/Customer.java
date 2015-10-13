package com.springapp.mvc.domain;

/**
 * Created by Krystian on 2015-10-13.
 */
public class Customer {
    private String customerId;
    private String name;
    private String noOfOrdersMade;

    public Customer(){
        super();
    }
    public Customer(String customerId, String name, String noOfOrdersMade){
        this.setCustomerId(customerId);
        this.setName(name);
        this.setNoOfOrdersMade(noOfOrdersMade);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    public void setNoOfOrdersMade(String noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }
}
