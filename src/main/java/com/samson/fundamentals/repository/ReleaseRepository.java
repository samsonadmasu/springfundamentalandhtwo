package com.samson.fundamentals.repository;

import com.samson.fundamentals.entity.Release;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release,Integer> {
}
