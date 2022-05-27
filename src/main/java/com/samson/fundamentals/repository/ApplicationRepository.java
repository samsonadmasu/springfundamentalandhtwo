package com.samson.fundamentals.repository;

import com.samson.fundamentals.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application,Integer> {
}
