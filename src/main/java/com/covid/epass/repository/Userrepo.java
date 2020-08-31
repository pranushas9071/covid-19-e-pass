package com.covid.epass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.epass.model.UserPojo;

import java.util.*;
public interface Userrepo extends JpaRepository<UserPojo,Integer>
{
	//method to find user by status
      List<UserPojo> findByStatus(String status);
      //method to find user by aadhar number
      List<UserPojo> findByProofno(String aadhar);
}
