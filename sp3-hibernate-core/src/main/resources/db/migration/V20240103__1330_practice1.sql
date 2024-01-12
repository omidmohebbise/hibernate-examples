create schema IF NOT EXISTS core_hibernate;

CREATE TABLE IF NOT EXISTS core_hibernate.posts
(
    id             bigserial NOT NULL,           -- Unique identifier for each post
    title          VARCHAR(255) NOT NULL,        -- Title of the post (required)
    content        TEXT,                         -- Content of the post
    publish_date   timestamp DEFAULT now(),      -- Date when the post was published (default to the current timestamp)
    is_published   BOOLEAN DEFAULT false,        -- Flag indicating whether the post is published
    views_count    INT DEFAULT 0,                -- Number of views for the post
    PRIMARY KEY (id)
);

insert into core_hibernate.posts VALUES (1, 'title 1', 'content 1', now(), true, random());
insert into core_hibernate.posts VALUES (2, 'title 2', 'content 2', now(), true, random());
insert into core_hibernate.posts VALUES (3, 'title 3', 'content 3', now(), false, random());
insert into core_hibernate.posts VALUES (4, 'title 4', 'content 4', now(), false, random());

