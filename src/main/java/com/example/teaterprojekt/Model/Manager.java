package com.example.teaterprojekt.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.thymeleaf.model.IStandaloneElementTag;

@Entity
public class Manager {
 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 private String name;

}
