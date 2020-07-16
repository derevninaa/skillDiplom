CREATE TABLE `users` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `is_moderator` tinyint NOT NULL,
  `reg_time` datetime NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `photo` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `posts` (
  `id` int  PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `is_active` tinyint NOT NULL,
  `moderation_status` enum('NEW','ACCEPTED','DECLINED') NOT NULL,
  `moderator_id` int DEFAULT NULL,
  `user_id` int NOT NULL,
  `time` datetime NOT NULL,
  `title` varchar(255) NOT NULL,
  `text` text NOT NULL,
  `view_count` int NOT NULL,
  FOREIGN KEY(`user_id`) REFERENCES `users`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `post_votes` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `user_id` int NOT NULL,
    `post_id` int NOT NULL,
    `time` datetime NOT NULL,
    `value` tinyint NOT NULL,
    FOREIGN KEY(`user_id`) REFERENCES `users`(`id`),
    FOREIGN KEY(`post_id`) REFERENCES `posts`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tags` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tag2post` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `post_id` int NOT NULL,
    `tag_id` int NOT NULL,
    FOREIGN KEY(`post_id`) REFERENCES `posts`(`id`),
    FOREIGN KEY(`tag_id`) REFERENCES `tags`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `post_comments` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `parent_id` int,
    `post_id` int NOT NULL,
    `user_id` int NOT NULL,
    `time` datetime NOT NULL,
    `text` text NOT NULL,
    FOREIGN KEY(`parent_id`) REFERENCES `post_comments`(`id`),
    FOREIGN KEY(`post_id`) REFERENCES `posts`(`id`),
    FOREIGN KEY(`user_id`) REFERENCES `users`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `captcha_codes` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `time` datetime NOT NULL,
    `code` tinytext NOT NULL,
    `secret_code` tinytext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `global_settings` (
    `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `code` varchar(255) NOT NULL,
    `name` varchar(255) NOT NULL,
    `value` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;