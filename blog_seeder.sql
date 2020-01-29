use spring_db;

truncate table posts;

# seed posts
insert into posts (title, body) values
('Post 1', 'This is the test ad 1 description'),
('Post 2', 'This is the test ad 2 description'),
('Post 3', 'This is the test ad 3 description'),
('Post 4', 'This is the test ad 4 description'),
('Post 5', 'This is the test ad 5 description');

SELECT title FROM posts WHERE LENGTH(title) < 10