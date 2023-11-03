package com.example.springdatajdbcbug;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Import(TestSpringDataJdbcBugApplication.class)
@Transactional
class SpringDataJdbcBugApplicationTests {

    @Autowired
    private AggregateRepository aggregateRepository;

    @Test
    void testSetMappingBug() {
        Aggregate aggregate = new Aggregate("1", Set.of(new ChildEntity("Alice"), new ChildEntity("Bob")));
        aggregateRepository.save(aggregate);
        Aggregate loadedAggregate = aggregateRepository.findById("1").get();
    }

}
