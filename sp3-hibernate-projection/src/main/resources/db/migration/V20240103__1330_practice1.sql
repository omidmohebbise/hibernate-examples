create schema IF NOT EXISTS practice_projection;

CREATE TABLE IF NOT EXISTS practice_projection.posts
(
    id             bigserial NOT NULL,           -- Unique identifier for each post
    title          VARCHAR(255) NOT NULL,        -- Title of the post (required)
    content        TEXT,                         -- Content of the post
    publish_date   timestamp DEFAULT now(),      -- Date when the post was published (default to the current timestamp)
    is_published   BOOLEAN DEFAULT false,        -- Flag indicating whether the post is published
    views_count    INT DEFAULT 0,                -- Number of views for the post
    PRIMARY KEY (id)
);

