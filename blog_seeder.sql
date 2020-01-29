use spring_db;

DROP DATABASE IF EXISTS spring_db;

truncate table posts;

# seed posts
insert into posts (title, body) values
('Post 1', 'This is the test ad 1 description'),
('Post 2', 'This is the test ad 2 description'),
('Post 3', 'This is the test ad 3 description'),
('Post 4', 'This is the test ad 4 description'),
('Post 5', 'This is the test ad 5 description');

insert into post_details(history_of_post, is_awesome, topic_description, post_id)
values ('post history test 1', true, 'This is test description 1', 1),
('post history test 1', true, 'This is test description 2', 2),
('post history test 1', true, 'This is test description 3', 3),
('post history test 1', true, 'This is test description 4', 4),
('post history test 1', true, 'This is test description 5', 5);

select * from posts;



SELECT title FROM posts WHERE LENGTH(title) < 10
