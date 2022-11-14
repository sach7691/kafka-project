package com.ab.kafkaconsumerdatabase.models;


import javax.persistence.*;

@Entity
@Table(name="wikimedia_events")
public class WikiData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob //this stores large data
    private String eventData;

    public void setId(Long id) {
        this.id = id;
    }

    public void setEventData(String eventData) {
        this.eventData = eventData;
    }

    public Long getId() {
        return id;
    }

    public String getEventData() {
        return eventData;
    }

    @Override
    public String toString() {
        return "WikiData{" +
                "id=" + id +
                ", eventData='" + eventData + '\'' +
                '}';
    }
}
