package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Doctor;

public interface IDoctorrepo extends CrudRepository<Doctor, Integer> {

}
