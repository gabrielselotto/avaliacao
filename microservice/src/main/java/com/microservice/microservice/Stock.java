package com.microservice.microservice;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Stock
{
    public Stock(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;


    @Column(name="description", nullable = true)
    private String description;

    @Column(name="stockvalue", nullable = true)
    private Integer stockvalue;

    @Column(name="stockdate", nullable = false)
    private Date stockdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStockValue() {
        return stockvalue;
    }

    public void setStockValue(Integer stockValue) {
        this.stockvalue = stockValue;
    }

    public Date getStockDate() {
        return stockdate;
    }

    public void setStockDate(Date stockDate) {
        this.stockdate = stockdate;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", stockValue=" + stockvalue +
                ", stockDate=" + stockdate +
                '}';
    }
}
