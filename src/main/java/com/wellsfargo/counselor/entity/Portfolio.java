package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import java.util.Date; // You can use the Date class for creationDate

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @Column(nullable = false)
    private Date creationDate;

    @ManyToOne
    private Client client;

    public Portfolio() {
        // Default constructor
    }

    public Portfolio(Date creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    // No setter for portfolioId is required since it's auto-generated

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}