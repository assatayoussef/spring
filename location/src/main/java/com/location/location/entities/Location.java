package com.location.location.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
private int id;
private String name;
private String code;
private String type;
@Id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
}
