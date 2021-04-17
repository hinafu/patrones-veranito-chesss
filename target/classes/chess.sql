CREATE DATABASE chess;

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int NOT NULL,
  `handle` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `users` (`user_id`, `handle`, `password`, `name`) VALUES
(1, 'braulio', 'e10adc3949ba59abbe56e057f20f883e', 'Braulio'),
(2, 'christian', 'c33367701511b4f6020ec61ded352059', 'Christian Barrón');
COMMIT;
