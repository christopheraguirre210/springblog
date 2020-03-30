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

insert into post_details(is_awesome,history_of_post, topic_description, post_id) values
(true,'post history test 1', 'This is test description 1', 1),
(true,'post history test 2', 'This is test description 2', 2),
(true,'post history test 3', 'This is test description 3', 3),
(true,'post history test 4', 'This is test description 4', 4),
(true,'post history test 5', 'This is test description 5', 5);

select * from posts;
select * from post_details;

describe posts;
describe post_details;



SELECT title FROM posts WHERE LENGTH(title) < 10
