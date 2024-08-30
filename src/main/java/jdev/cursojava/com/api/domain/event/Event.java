package jdev.cursojava.com.api.domain.event;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;

@Table(name = "event")
@Entity
public class Event {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String description;
    private String imgUrl;
    private String eventUrl;
    private Boolean remote;
    private Date date;


    public void setTitle(String title) {
    }

    public void setDescription(String description) {
    }

    public void setEventUrl(String s) {
    }

    public void setDate(Date date) {
    }

    public void setImgUrl(String imgUrl) {
    }

    public void setRemote(Boolean remote) {

    }
}
