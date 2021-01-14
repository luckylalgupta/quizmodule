INSERT INTO USER (name, email, active, role) values
('Lucky', 'luckylalgupta@gmail.com', true, 1),
('Suraj', 'surajlalgupta@gmail.com', true, 0);

INSERT INTO OPTION(value,choice) values
('Infinite',0),('Zero',1),('Undefined',2),('None of these',3);

INSERT INTO OPTION(value,choice) values
('20',0),('30',1),('40',2),('5',3);

INSERT INTO OPTION(value,choice) values
('15',0),('17',1),('18',2),('18',3);

INSERT INTO QUESTION(description) values('What is the result when we divide 2 by 0');
INSERT INTO QUESTION(description) values('what is the result of 2 + 3');
INSERT INTO QUESTION(description) values('what is the result of 20 - 3');

INSERT INTO QUESTION_OPTIONS (question_id,options_id) values ( 1,1 ),(1,2),(1,3),(1,4);
INSERT INTO QUESTION_OPTIONS (question_id,options_id) values ( 2,5 ),(2,6),(2,7),(2,8);
INSERT INTO QUESTION_OPTIONS (question_id,options_id) values ( 3,9 ),(3,10),(3,11),(3,12);

INSERT INTO QUESTION_ANSWERS (question_id,answers_id) values ( 1,1 ),(2,8) ,(3,10);

--INSERT INTO QUIZ (name,start_Date,end_Date,num_Of_Question) values ('Math Quiz','2021-03-21 05:30:00','2021-05-21 05:30:00',3);
--INSERT INTO QUIZ_QUESTIONS values (1,1),(1,2),(1,3);


