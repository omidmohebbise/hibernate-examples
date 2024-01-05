create schema IF NOT EXISTS practice1;

CREATE TABLE IF NOT EXISTS practice1.posts
(
    id             bigserial NOT NULL,
    title          VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS practice1.post_details
(
    post_id     int,
    description Text,
    constraint postFK
        FOREIGN KEY (post_id)
            references practice1.posts (id)
);

