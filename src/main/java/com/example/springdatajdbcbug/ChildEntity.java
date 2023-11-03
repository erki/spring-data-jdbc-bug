package com.example.springdatajdbcbug;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Table("child")
@RequiredArgsConstructor
@Getter
public class ChildEntity {

    private final String name;

}
