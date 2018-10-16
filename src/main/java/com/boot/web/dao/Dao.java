package com.boot.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.web.model.Model;




public interface Dao extends JpaRepository<Model, Integer> {

}
