package com.example.springdatajdbcbug;

import java.util.Set;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("aggregate")
@RequiredArgsConstructor
@Getter
public class Aggregate implements Persistable<String> {

    @Id
    private final String id;

    @MappedCollection(idColumn = "aggregate_id")
    private final Set<ChildEntity> children;

    @Override
    public boolean isNew() {
        return true;
    }
}
