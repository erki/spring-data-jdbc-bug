CREATE TABLE aggregate (id TEXT primary key);

CREATE TABLE child(aggregate_id TEXT REFERENCES aggregate (id), name text);