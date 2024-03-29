package com.example.demo.Lot0;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Table(name = "lot_zero")


public class Lot_Zero {

    @Id
    @GeneratedValue
    @Column(name = "spotnum")
    @NotFound(action = NotFoundAction.IGNORE)
    private Integer spotnum;

    @Column(name = "isfilled")
    @NotFound(action = NotFoundAction.IGNORE)
    private boolean filled;

    public Integer getSpotNum(){
        return spotnum;
    }
    public boolean getisFilled(){
        return filled;
    }
    public void setspotNum(Integer spotNum){
        this.spotnum = spotNum;
    }
    public void setisFilled(boolean filled){
        System.out.println("***"+filled);


        this.filled = filled;
    }
}
