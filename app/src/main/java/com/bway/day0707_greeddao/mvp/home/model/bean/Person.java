package com.bway.day0707_greeddao.mvp.home.model.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

@Entity(nameInDb = "person")
public class Person {

    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "name")
    private String name1;
    private String time;
    @Generated(hash = 2048444458)
    public Person(Long id, String name1, String time) {
        this.id = id;
        this.name1 = name1;
        this.time = time;
    }
    @Generated(hash = 1024547259)
    public Person() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName1() {
        return this.name1;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }
  
}
