package com.cg.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.example.beans.CreditCard;
import com.cg.example.beans.User;

public interface UserDAO extends JpaRepository<CreditCard, User>{
	

}
