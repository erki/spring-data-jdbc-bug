package com.example.springdatajdbcbug;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AggregateRepository extends CrudRepository<Aggregate, String> {
}
