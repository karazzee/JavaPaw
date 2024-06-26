-- CREATE DATABASE petmeet;
use petmeet;
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100) NOT NULL
);

use petmeet;
CREATE TABLE event (
    eventId INT AUTO_INCREMENT PRIMARY KEY,
    eventTitle VARCHAR(100) NOT NULL,
    eventDetail VARCHAR(2000) NOT NULL,
    eventPicUrl VARCHAR(500)  NULL,
	date Date NOT NULL,
    timeStart Time  NOT NULL,
    timeEnd Time  NOT NULL,
	place VARCHAR(100)  NULL,	
	sponsorId INT NULL,
	sponsorName VARCHAR(100)   NULL,
	sponsorPetId INT  ,
	sponsorPetName VARCHAR(100)   NULL,
	partNum INT NULL,
	partIdList VARCHAR(500)   NULL,
	partNameList VARCHAR(2000)   NULL,
	partStatusList VARCHAR(500)   NULL,
	likeNum INT NULL,
	unLikeNum INT NULL,
	favoriteNum INT NULL,
	createDate Date   NULL,
	upateDate Date   NULL,
	status VARCHAR(100)  NULL
);



use petmeet;
CREATE TABLE profile 
		(id INT AUTO_INCREMENT PRIMARY KEY, 
 	    name VARCHAR(100) NOT NULL, 
 	    email VARCHAR(100) NOT NULL, 
 	    phone VARCHAR(100)  NULL, 
 	    location VARCHAR(500)  NULL, 
 	    password VARCHAR(100) NOT NULL, 
 	    personPicUrl VARCHAR(2000)  NULL,
		bio VARCHAR(100) NOT NULL, 
 	    petId INT NULL, 
 	    petName VARCHAR(100)  NULL, 
 	    petAge INT NULL, 
 	    petBreed VARCHAR(100)  NULL, 
 	    petPicUrl VARCHAR(2000)  NULL,
 	    status VARCHAR(100)  NULL);
        
        desc event;



INSERT INTO profile (`id`,`name`,`email`,`phone`,`location`,`password`,`personPicUrl`,`bio`,`petId`,`petName`,`petAge`,`petBreed`,`petPicUrl`,`status`) 
VALUES (1,'lao','lao@qq.com','1234567890','san jose','123456',NULL,'',1,'zhuli',2,'Alaskan',NULL,'Active');
INSERT INTO profile (`id`,`name`,`email`,`phone`,`location`,`password`,`personPicUrl`,`bio`,`petId`,`petName`,`petAge`,`petBreed`,`petPicUrl`,`status`) 
VALUES (2,'kara','kara@gmail.com','1234567890','los angels','123456',NULL,'',1,'wagncai',2,'Bulldog',NULL,'Active');
INSERT INTO profile (`id`,`name`,`email`,`phone`,`location`,`password`,`personPicUrl`,`bio`,`petId`,`petName`,`petAge`,`petBreed`,`petPicUrl`,`status`) 
VALUES (3,'andy','andy@gmail.com','1234567890','san jose','123456',NULL,'',1,'xiaohuang',2,'Bulldog',NULL,'Active');


INSERT INTO event (`eventId`,`eventTitle`,`eventDetail`,`eventPicUrl`,`date`,`timeStart`,`timeEnd`,`place`,`sponsorId`,`sponsorName`,`sponsorPetId`,`sponsorPetName`,`partNum`,`partIdList`,`partNameList`,`partStatusList`,`likeNum`,`unLikeNum`,`favoriteNum`,`createDate`,`upateDate`,`status`) VALUES (1,'zhuli pet happy@moutain view park--','zhuli pet happy  @moutain view park-- ahahahahahahahahahahahahahahahahahahahahahaha--','','2024-03-10','11:30:00','14:30:00','Mountain View Park--',1,'kara',1,'Wangcai',10,'2,3,5','stein,yuga,andy','Active,Active,Cancel',200,10,2,'2024-03-10','2024-03-12','Active');
INSERT INTO event (`eventId`,`eventTitle`,`eventDetail`,`eventPicUrl`,`date`,`timeStart`,`timeEnd`,`place`,`sponsorId`,`sponsorName`,`sponsorPetId`,`sponsorPetName`,`partNum`,`partIdList`,`partNameList`,`partStatusList`,`likeNum`,`unLikeNum`,`favoriteNum`,`createDate`,`upateDate`,`status`) VALUES (2,'zhuli222 pet happy@moutain view park','zhuli222 pet happy  @moutain view park ahahahahahahahahahahahahahahahahahahahahahaha','','2024-03-10','11:00:00','14:00:00','Mountain View Park',1,'kara',1,'Wangcai',10,'2,3','stein,yuga','Active,Active',200,10,2,'2024-03-15','2024-03-18','Active');
INSERT INTO event (`eventId`,`eventTitle`,`eventDetail`,`eventPicUrl`,`date`,`timeStart`,`timeEnd`,`place`,`sponsorId`,`sponsorName`,`sponsorPetId`,`sponsorPetName`,`partNum`,`partIdList`,`partNameList`,`partStatusList`,`likeNum`,`unLikeNum`,`favoriteNum`,`createDate`,`upateDate`,`status`) VALUES (3,'zhuli222 pet happy@moutain view park','zhuli222 pet happy  @moutain view park ahahahahahahahahahahahahahahahahahahahahahaha','','2024-03-10','11:00:00','14:00:00','Mountain View Park',1,'kara',1,'Wangcai',10,'2,3','stein,yuga','Active,Active',200,10,2,'2024-03-15','2024-03-18','Active');
INSERT INTO event (`eventId`,`eventTitle`,`eventDetail`,`eventPicUrl`,`date`,`timeStart`,`timeEnd`,`place`,`sponsorId`,`sponsorName`,`sponsorPetId`,`sponsorPetName`,`partNum`,`partIdList`,`partNameList`,`partStatusList`,`likeNum`,`unLikeNum`,`favoriteNum`,`createDate`,`upateDate`,`status`) VALUES (4,'zhuli222 pet happy@moutain view park','zhuli222 pet happy  @moutain view park ahahahahahahahahahahahahahahahahahahahahahaha','','2024-03-10','11:00:00','14:00:00','Mountain View Park',1,'kara',1,'Wangcai',10,'2,3','stein,yuga','Active,Active',200,10,2,'2024-03-15','2024-03-18','Active');
INSERT INTO event (`eventId`,`eventTitle`,`eventDetail`,`eventPicUrl`,`date`,`timeStart`,`timeEnd`,`place`,`sponsorId`,`sponsorName`,`sponsorPetId`,`sponsorPetName`,`partNum`,`partIdList`,`partNameList`,`partStatusList`,`likeNum`,`unLikeNum`,`favoriteNum`,`createDate`,`upateDate`,`status`) VALUES (5,'kara\'s happy time @moutain view!','On March 20th, Mountain View will host an enchanting gathering where our four-legged friends come together for a special doggy date. Set against the scenic backdrop of the city\'s parks and green spaces, this event promises a day of tail-wagging excitement and furry camaraderie. From playful pups to wise old souls, dogs of all ages and breeds will converge to socialize, sniff, and strut their stuff. As their human companions mingle, dogs will romp and frolic, exchanging playful barks and friendly sniffs. Attendees can look forward to a variety of activities, including dog-friendly games, agility courses, and perhaps even a doggy fashion show. Throughout the event, local shelters and rescue organizations will be on hand, showcasing adoptable dogs in search of loving forever homes. It\'s a chance for dog lovers to connect, share stories, and celebrate the unconditional love and joy that our canine companions bring into our lives. So mark your calendars, grab your leashes, and join us for a day filled with laughter, tail wags, and unforgettable moments in the heart of Mountain View.\r\n','','2024-03-10','11:30:00','14:30:00','Mountain View Park',1,'kara2',1,'Wangcai2',1,'2,3,5','stein,yuga,andy','Draft,Active,Cancel',200,10,2,'2024-03-10','2024-03-12','Active');		