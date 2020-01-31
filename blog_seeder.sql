use spring_db;

DROP DATABASE IF EXISTS spring_db;

truncate table posts;

# seed users
insert into users (email, password, username)
values ('chris@email.com', 'cheezburgers', 'christopher'),
('amber@email.com', 'chickennugz', 'amberthon'),
('ethan@email.com', 'hotdogs', 'champion');

select * from users;

# seed posts
insert into posts (title, body, user_id) values
('Post 1', 'This is the test ad 1 description', 1),
('Post 2', 'This is the test ad 2 description', 1),
('Post 3', 'This is the test ad 3 description', 2),
('Post 4', 'This is the test ad 4 description', 2),
('Post 5', 'This is the test ad 5 description', 3),
('Cat Blog', 'Check out these kitty cats', 3);

select * from posts;

# seed post_details
insert into post_details(is_awesome,history_of_post, topic_description, post_id) values
(true,'post history test 1', 'This is test description 1', 1),
(true,'post history test 2', 'This is test description 2', 2),
(true,'post history test 3', 'This is test description 3', 3),
(true,'post history test 4', 'This is test description 4', 4),
(true,'post history test 5', 'This is test description 5', 5),
(true,'post history test  cats', 'This is test description about these cool cats', 6);

select * from post_details;

# seed post_images
insert into post_images (image_title, url, post_id)
values ('galaxy glasses kitty', 'https://store.playstation.com/store/api/chihiro/00_09_000/container/US/en/999/UP2538-CUSA05620_00-AV00000000000074/1579307804000/image?w=240&h=240&bg_color=000000&opacity=100&_version=00_09_000', 6),
('smiley kitty', 'https://img.favpng.com/3/11/25/avatar-youtube-cat-png-favpng-PRA6iZsrgWAqXFqmjMsfSvuPG.jpg', 6),
('silly kitty', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-e4mETHmzO2gVeZl8FDbn6RSR0gVZN_3HA186_DHAmLQ8_jGQ&s', 6);

select * from post_images;






describe posts;
describe post_details;
describe post_images;



SELECT title FROM posts WHERE LENGTH(title) < 10
