--liquibase formatted sql

--changeset mpianello:1
CREATE TABLE rooms (
	id          INTEGER PRIMARY KEY,
	floor       INTEGER NOT NULL,
	nro         INTEGER NOT NULL,
	type        VARCHAR2(10) NOT NULL
);

--changeset mpianello:2
INSERT INTO rooms VALUES (1, 1, 1, 'ESTANDAR');
INSERT INTO rooms VALUES (2, 1, 2, 'ESTANDAR');
INSERT INTO rooms VALUES (3, 1, 3, 'ESTANDAR');
INSERT INTO rooms VALUES (4, 1, 4, 'ESTANDAR');
INSERT INTO rooms VALUES (5, 1, 5, 'ESTANDAR');
INSERT INTO rooms VALUES (6, 1, 6, 'ESTANDAR');
INSERT INTO rooms VALUES (7, 1, 7, 'ESTANDAR');
INSERT INTO rooms VALUES (8, 1, 8, 'ESTANDAR');
INSERT INTO rooms VALUES (9, 1, 9, 'ESTANDAR');
INSERT INTO rooms VALUES (10, 1, 10, 'ESTANDAR');
INSERT INTO rooms VALUES (11, 1, 11, 'SUITE');
INSERT INTO rooms VALUES (12, 1, 12, 'ESTANDAR');
INSERT INTO rooms VALUES (13, 1, 13, 'ESTANDAR');
INSERT INTO rooms VALUES (14, 1, 14, 'ESTANDAR');
INSERT INTO rooms VALUES (15, 1, 15, 'ESTANDAR');
INSERT INTO rooms VALUES (16, 1, 16, 'ESTANDAR');
INSERT INTO rooms VALUES (17, 1, 17, 'ESTANDAR');
INSERT INTO rooms VALUES (18, 1, 18, 'SUITE');
INSERT INTO rooms VALUES (19, 1, 19, 'ESTANDAR');
INSERT INTO rooms VALUES (20, 1, 20, 'ESTANDAR');
INSERT INTO rooms VALUES (21, 1, 21, 'ESTANDAR');
INSERT INTO rooms VALUES (22, 1, 22, 'ESTANDAR');
INSERT INTO rooms VALUES (23, 1, 23, 'ESTANDAR');
INSERT INTO rooms VALUES (24, 1, 24, 'ESTANDAR');
INSERT INTO rooms VALUES (25, 1, 25, 'ESTANDAR');
INSERT INTO rooms VALUES (26, 1, 26, 'ESTANDAR');
INSERT INTO rooms VALUES (27, 1, 27, 'ESTANDAR');
INSERT INTO rooms VALUES (28, 1, 28, 'ESTANDAR');
INSERT INTO rooms VALUES (29, 1, 29, 'ESTANDAR');
INSERT INTO rooms VALUES (30, 1, 30, 'ESTANDAR');
INSERT INTO rooms VALUES (31, 1, 31, 'ESTANDAR');
INSERT INTO rooms VALUES (32, 1, 32, 'ESTANDAR');
INSERT INTO rooms VALUES (33, 1, 33, 'ESTANDAR');
INSERT INTO rooms VALUES (34, 1, 34, 'ESTANDAR');
INSERT INTO rooms VALUES (35, 1, 35, 'SUITE');
INSERT INTO rooms VALUES (36, 1, 36, 'SUITE');
INSERT INTO rooms VALUES (37, 1, 37, 'ESTANDAR');
INSERT INTO rooms VALUES (38, 1, 38, 'ESTANDAR');
INSERT INTO rooms VALUES (39, 1, 39, 'ESTANDAR');
INSERT INTO rooms VALUES (40, 1, 40, 'ESTANDAR');
INSERT INTO rooms VALUES (41, 1, 41, 'ESTANDAR');
INSERT INTO rooms VALUES (42, 1, 42, 'ESTANDAR');
INSERT INTO rooms VALUES (43, 1, 43, 'ESTANDAR');
INSERT INTO rooms VALUES (44, 1, 44, 'ESTANDAR');
INSERT INTO rooms VALUES (45, 1, 45, 'SUITE');
INSERT INTO rooms VALUES (46, 1, 46, 'ESTANDAR');
INSERT INTO rooms VALUES (47, 1, 47, 'ESTANDAR');
INSERT INTO rooms VALUES (48, 1, 48, 'ESTANDAR');
INSERT INTO rooms VALUES (49, 1, 49, 'ESTANDAR');
INSERT INTO rooms VALUES (50, 1, 50, 'ESTANDAR');
INSERT INTO rooms VALUES (51, 2, 1, 'ESTANDAR');
INSERT INTO rooms VALUES (52, 2, 2, 'ESTANDAR');
INSERT INTO rooms VALUES (53, 2, 3, 'ESTANDAR');
INSERT INTO rooms VALUES (54, 2, 4, 'ESTANDAR');
INSERT INTO rooms VALUES (55, 2, 5, 'ESTANDAR');
INSERT INTO rooms VALUES (56, 2, 6, 'ESTANDAR');
INSERT INTO rooms VALUES (57, 2, 7, 'ESTANDAR');
INSERT INTO rooms VALUES (58, 2, 8, 'ESTANDAR');
INSERT INTO rooms VALUES (59, 2, 9, 'ESTANDAR');
INSERT INTO rooms VALUES (60, 2, 10, 'ESTANDAR');
INSERT INTO rooms VALUES (61, 2, 11, 'ESTANDAR');
INSERT INTO rooms VALUES (62, 2, 12, 'ESTANDAR');
INSERT INTO rooms VALUES (63, 2, 13, 'ESTANDAR');
INSERT INTO rooms VALUES (64, 2, 14, 'ESTANDAR');
INSERT INTO rooms VALUES (65, 2, 15, 'ESTANDAR');
INSERT INTO rooms VALUES (66, 2, 16, 'ESTANDAR');
INSERT INTO rooms VALUES (67, 2, 17, 'ESTANDAR');
INSERT INTO rooms VALUES (68, 2, 18, 'ESTANDAR');
INSERT INTO rooms VALUES (69, 2, 19, 'ESTANDAR');
INSERT INTO rooms VALUES (70, 2, 20, 'ESTANDAR');
INSERT INTO rooms VALUES (71, 2, 21, 'ESTANDAR');
INSERT INTO rooms VALUES (72, 2, 22, 'ESTANDAR');
INSERT INTO rooms VALUES (73, 2, 23, 'ESTANDAR');
INSERT INTO rooms VALUES (74, 2, 24, 'ESTANDAR');
INSERT INTO rooms VALUES (75, 2, 25, 'ESTANDAR');
INSERT INTO rooms VALUES (76, 2, 26, 'ESTANDAR');
INSERT INTO rooms VALUES (77, 2, 27, 'ESTANDAR');
INSERT INTO rooms VALUES (78, 2, 28, 'ESTANDAR');
INSERT INTO rooms VALUES (79, 2, 29, 'ESTANDAR');
INSERT INTO rooms VALUES (80, 2, 30, 'ESTANDAR');
INSERT INTO rooms VALUES (81, 2, 31, 'ESTANDAR');
INSERT INTO rooms VALUES (82, 2, 32, 'ESTANDAR');
INSERT INTO rooms VALUES (83, 2, 33, 'ESTANDAR');
INSERT INTO rooms VALUES (84, 2, 34, 'ESTANDAR');
INSERT INTO rooms VALUES (85, 2, 35, 'ESTANDAR');
INSERT INTO rooms VALUES (86, 2, 36, 'ESTANDAR');
INSERT INTO rooms VALUES (87, 2, 37, 'ESTANDAR');
INSERT INTO rooms VALUES (88, 2, 38, 'ESTANDAR');
INSERT INTO rooms VALUES (89, 2, 39, 'ESTANDAR');
INSERT INTO rooms VALUES (90, 2, 40, 'ESTANDAR');
INSERT INTO rooms VALUES (91, 2, 41, 'ESTANDAR');
INSERT INTO rooms VALUES (92, 2, 42, 'ESTANDAR');
INSERT INTO rooms VALUES (93, 2, 43, 'ESTANDAR');
INSERT INTO rooms VALUES (94, 2, 44, 'ESTANDAR');
INSERT INTO rooms VALUES (95, 2, 45, 'ESTANDAR');
INSERT INTO rooms VALUES (96, 2, 46, 'ESTANDAR');
INSERT INTO rooms VALUES (97, 2, 47, 'ESTANDAR');
INSERT INTO rooms VALUES (98, 2, 48, 'ESTANDAR');
INSERT INTO rooms VALUES (99, 2, 49, 'ESTANDAR');
INSERT INTO rooms VALUES (100, 2, 50, 'ESTANDAR');
INSERT INTO rooms VALUES (101, 3, 1, 'ESTANDAR');
INSERT INTO rooms VALUES (102, 3, 2, 'ESTANDAR');
INSERT INTO rooms VALUES (103, 3, 3, 'ESTANDAR');
INSERT INTO rooms VALUES (104, 3, 4, 'ESTANDAR');
INSERT INTO rooms VALUES (105, 3, 5, 'ESTANDAR');
INSERT INTO rooms VALUES (106, 3, 6, 'ESTANDAR');
INSERT INTO rooms VALUES (107, 3, 7, 'ESTANDAR');
INSERT INTO rooms VALUES (108, 3, 8, 'ESTANDAR');
INSERT INTO rooms VALUES (109, 3, 9, 'ESTANDAR');
INSERT INTO rooms VALUES (110, 3, 10, 'ESTANDAR');
INSERT INTO rooms VALUES (111, 3, 11, 'ESTANDAR');
INSERT INTO rooms VALUES (112, 3, 12, 'ESTANDAR');
INSERT INTO rooms VALUES (113, 3, 13, 'ESTANDAR');
INSERT INTO rooms VALUES (114, 3, 14, 'SUITE');
INSERT INTO rooms VALUES (115, 3, 15, 'ESTANDAR');
INSERT INTO rooms VALUES (116, 3, 16, 'ESTANDAR');
INSERT INTO rooms VALUES (117, 3, 17, 'ESTANDAR');
INSERT INTO rooms VALUES (118, 3, 18, 'ESTANDAR');
INSERT INTO rooms VALUES (119, 3, 19, 'ESTANDAR');
INSERT INTO rooms VALUES (120, 3, 20, 'ESTANDAR');
INSERT INTO rooms VALUES (121, 3, 21, 'ESTANDAR');
INSERT INTO rooms VALUES (122, 3, 22, 'ESTANDAR');
INSERT INTO rooms VALUES (123, 3, 23, 'ESTANDAR');
INSERT INTO rooms VALUES (124, 3, 24, 'ESTANDAR');
INSERT INTO rooms VALUES (125, 3, 25, 'ESTANDAR');
INSERT INTO rooms VALUES (126, 3, 26, 'ESTANDAR');
INSERT INTO rooms VALUES (127, 3, 27, 'ESTANDAR');
INSERT INTO rooms VALUES (128, 3, 28, 'ESTANDAR');
INSERT INTO rooms VALUES (129, 3, 29, 'ESTANDAR');
INSERT INTO rooms VALUES (130, 3, 30, 'ESTANDAR');
INSERT INTO rooms VALUES (131, 3, 31, 'SUITE');
INSERT INTO rooms VALUES (132, 3, 32, 'ESTANDAR');
INSERT INTO rooms VALUES (133, 3, 33, 'SUITE');
INSERT INTO rooms VALUES (134, 3, 34, 'SUITE');
INSERT INTO rooms VALUES (135, 3, 35, 'ESTANDAR');
INSERT INTO rooms VALUES (136, 3, 36, 'ESTANDAR');
INSERT INTO rooms VALUES (137, 3, 37, 'ESTANDAR');
INSERT INTO rooms VALUES (138, 3, 38, 'ESTANDAR');
INSERT INTO rooms VALUES (139, 3, 39, 'SUITE');
INSERT INTO rooms VALUES (140, 3, 40, 'ESTANDAR');
INSERT INTO rooms VALUES (141, 3, 41, 'ESTANDAR');
INSERT INTO rooms VALUES (142, 3, 42, 'SUITE');
INSERT INTO rooms VALUES (143, 3, 43, 'ESTANDAR');
INSERT INTO rooms VALUES (144, 3, 44, 'ESTANDAR');
INSERT INTO rooms VALUES (145, 3, 45, 'ESTANDAR');
INSERT INTO rooms VALUES (146, 3, 46, 'ESTANDAR');
INSERT INTO rooms VALUES (147, 3, 47, 'ESTANDAR');
INSERT INTO rooms VALUES (148, 3, 48, 'ESTANDAR');
INSERT INTO rooms VALUES (149, 3, 49, 'SUITE');
INSERT INTO rooms VALUES (150, 3, 50, 'ESTANDAR');
INSERT INTO rooms VALUES (151, 4, 1, 'ESTANDAR');
INSERT INTO rooms VALUES (152, 4, 2, 'ESTANDAR');
INSERT INTO rooms VALUES (153, 4, 3, 'SUITE');
INSERT INTO rooms VALUES (154, 4, 4, 'ESTANDAR');
INSERT INTO rooms VALUES (155, 4, 5, 'ESTANDAR');
INSERT INTO rooms VALUES (156, 4, 6, 'SUITE');
INSERT INTO rooms VALUES (157, 4, 7, 'ESTANDAR');
INSERT INTO rooms VALUES (158, 4, 8, 'SUITE');
INSERT INTO rooms VALUES (159, 4, 9, 'ESTANDAR');
INSERT INTO rooms VALUES (160, 4, 10, 'ESTANDAR');
INSERT INTO rooms VALUES (161, 4, 11, 'ESTANDAR');
INSERT INTO rooms VALUES (162, 4, 12, 'ESTANDAR');
INSERT INTO rooms VALUES (163, 4, 13, 'ESTANDAR');
INSERT INTO rooms VALUES (164, 4, 14, 'SUITE');
INSERT INTO rooms VALUES (165, 4, 15, 'ESTANDAR');
INSERT INTO rooms VALUES (166, 4, 16, 'ESTANDAR');
INSERT INTO rooms VALUES (167, 4, 17, 'ESTANDAR');
INSERT INTO rooms VALUES (168, 4, 18, 'ESTANDAR');
INSERT INTO rooms VALUES (169, 4, 19, 'ESTANDAR');
INSERT INTO rooms VALUES (170, 4, 20, 'ESTANDAR');
INSERT INTO rooms VALUES (171, 4, 21, 'ESTANDAR');
INSERT INTO rooms VALUES (172, 4, 22, 'ESTANDAR');
INSERT INTO rooms VALUES (173, 4, 23, 'ESTANDAR');
INSERT INTO rooms VALUES (174, 4, 24, 'SUITE');
INSERT INTO rooms VALUES (175, 4, 25, 'ESTANDAR');
INSERT INTO rooms VALUES (176, 4, 26, 'ESTANDAR');
INSERT INTO rooms VALUES (177, 4, 27, 'ESTANDAR');
INSERT INTO rooms VALUES (178, 4, 28, 'ESTANDAR');
INSERT INTO rooms VALUES (179, 4, 29, 'ESTANDAR');
INSERT INTO rooms VALUES (180, 4, 30, 'ESTANDAR');
INSERT INTO rooms VALUES (181, 4, 31, 'ESTANDAR');
INSERT INTO rooms VALUES (182, 4, 32, 'SUITE');
INSERT INTO rooms VALUES (183, 4, 33, 'SUITE');
INSERT INTO rooms VALUES (184, 4, 34, 'ESTANDAR');
INSERT INTO rooms VALUES (185, 4, 35, 'ESTANDAR');
INSERT INTO rooms VALUES (186, 4, 36, 'ESTANDAR');
INSERT INTO rooms VALUES (187, 4, 37, 'ESTANDAR');
INSERT INTO rooms VALUES (188, 4, 38, 'ESTANDAR');
INSERT INTO rooms VALUES (189, 4, 39, 'ESTANDAR');
INSERT INTO rooms VALUES (190, 4, 40, 'ESTANDAR');
INSERT INTO rooms VALUES (191, 4, 41, 'SUITE');
INSERT INTO rooms VALUES (192, 4, 42, 'ESTANDAR');
INSERT INTO rooms VALUES (193, 4, 43, 'ESTANDAR');
INSERT INTO rooms VALUES (194, 4, 44, 'ESTANDAR');
INSERT INTO rooms VALUES (195, 4, 45, 'SUITE');
INSERT INTO rooms VALUES (196, 4, 46, 'ESTANDAR');
INSERT INTO rooms VALUES (197, 4, 47, 'ESTANDAR');
INSERT INTO rooms VALUES (198, 4, 48, 'ESTANDAR');
INSERT INTO rooms VALUES (199, 4, 49, 'SUITE');
INSERT INTO rooms VALUES (200, 4, 50, 'ESTANDAR');
INSERT INTO rooms VALUES (201, 5, 1, 'ESTANDAR');
INSERT INTO rooms VALUES (202, 5, 2, 'SUITE');
INSERT INTO rooms VALUES (203, 5, 3, 'ESTANDAR');
INSERT INTO rooms VALUES (204, 5, 4, 'ESTANDAR');
INSERT INTO rooms VALUES (205, 5, 5, 'ESTANDAR');
INSERT INTO rooms VALUES (206, 5, 6, 'ESTANDAR');
INSERT INTO rooms VALUES (207, 5, 7, 'ESTANDAR');
INSERT INTO rooms VALUES (208, 5, 8, 'ESTANDAR');
INSERT INTO rooms VALUES (209, 5, 9, 'ESTANDAR');
INSERT INTO rooms VALUES (210, 5, 10, 'ESTANDAR');
INSERT INTO rooms VALUES (211, 5, 11, 'SUITE');
INSERT INTO rooms VALUES (212, 5, 12, 'SUITE');
INSERT INTO rooms VALUES (213, 5, 13, 'ESTANDAR');
INSERT INTO rooms VALUES (214, 5, 14, 'ESTANDAR');
INSERT INTO rooms VALUES (215, 5, 15, 'ESTANDAR');
INSERT INTO rooms VALUES (216, 5, 16, 'ESTANDAR');
INSERT INTO rooms VALUES (217, 5, 17, 'ESTANDAR');
INSERT INTO rooms VALUES (218, 5, 18, 'ESTANDAR');
INSERT INTO rooms VALUES (219, 5, 19, 'SUITE');
INSERT INTO rooms VALUES (220, 5, 20, 'ESTANDAR');
INSERT INTO rooms VALUES (221, 5, 21, 'ESTANDAR');
INSERT INTO rooms VALUES (222, 5, 22, 'ESTANDAR');
INSERT INTO rooms VALUES (223, 5, 23, 'ESTANDAR');
INSERT INTO rooms VALUES (224, 5, 24, 'ESTANDAR');
INSERT INTO rooms VALUES (225, 5, 25, 'ESTANDAR');
INSERT INTO rooms VALUES (226, 5, 26, 'ESTANDAR');
INSERT INTO rooms VALUES (227, 5, 27, 'ESTANDAR');
INSERT INTO rooms VALUES (228, 5, 28, 'ESTANDAR');
INSERT INTO rooms VALUES (229, 5, 29, 'ESTANDAR');
INSERT INTO rooms VALUES (230, 5, 30, 'ESTANDAR');
INSERT INTO rooms VALUES (231, 5, 31, 'ESTANDAR');
INSERT INTO rooms VALUES (232, 5, 32, 'SUITE');
INSERT INTO rooms VALUES (233, 5, 33, 'ESTANDAR');
INSERT INTO rooms VALUES (234, 5, 34, 'ESTANDAR');
INSERT INTO rooms VALUES (235, 5, 35, 'ESTANDAR');
INSERT INTO rooms VALUES (236, 5, 36, 'SUITE');
INSERT INTO rooms VALUES (237, 5, 37, 'ESTANDAR');
INSERT INTO rooms VALUES (238, 5, 38, 'ESTANDAR');
INSERT INTO rooms VALUES (239, 5, 39, 'ESTANDAR');
INSERT INTO rooms VALUES (240, 5, 40, 'ESTANDAR');
INSERT INTO rooms VALUES (241, 5, 41, 'ESTANDAR');
INSERT INTO rooms VALUES (242, 5, 42, 'ESTANDAR');
INSERT INTO rooms VALUES (243, 5, 43, 'ESTANDAR');
INSERT INTO rooms VALUES (244, 5, 44, 'ESTANDAR');
INSERT INTO rooms VALUES (245, 5, 45, 'SUITE');
INSERT INTO rooms VALUES (246, 5, 46, 'ESTANDAR');
INSERT INTO rooms VALUES (247, 5, 47, 'ESTANDAR');
INSERT INTO rooms VALUES (248, 5, 48, 'SUITE');
INSERT INTO rooms VALUES (249, 5, 49, 'ESTANDAR');
INSERT INTO rooms VALUES (250, 5, 50, 'ESTANDAR');
INSERT INTO rooms VALUES (251, 6, 1, 'ESTANDAR');
INSERT INTO rooms VALUES (252, 6, 2, 'ESTANDAR');
INSERT INTO rooms VALUES (253, 6, 3, 'ESTANDAR');
INSERT INTO rooms VALUES (254, 6, 4, 'ESTANDAR');
INSERT INTO rooms VALUES (255, 6, 5, 'ESTANDAR');
INSERT INTO rooms VALUES (256, 6, 6, 'ESTANDAR');
INSERT INTO rooms VALUES (257, 6, 7, 'ESTANDAR');
INSERT INTO rooms VALUES (258, 6, 8, 'ESTANDAR');
INSERT INTO rooms VALUES (259, 6, 9, 'ESTANDAR');
INSERT INTO rooms VALUES (260, 6, 10, 'ESTANDAR');
INSERT INTO rooms VALUES (261, 6, 11, 'ESTANDAR');
INSERT INTO rooms VALUES (262, 6, 12, 'ESTANDAR');
INSERT INTO rooms VALUES (263, 6, 13, 'ESTANDAR');
INSERT INTO rooms VALUES (264, 6, 14, 'ESTANDAR');
INSERT INTO rooms VALUES (265, 6, 15, 'SUITE');
INSERT INTO rooms VALUES (266, 6, 16, 'ESTANDAR');
INSERT INTO rooms VALUES (267, 6, 17, 'ESTANDAR');
INSERT INTO rooms VALUES (268, 6, 18, 'ESTANDAR');
INSERT INTO rooms VALUES (269, 6, 19, 'ESTANDAR');
INSERT INTO rooms VALUES (270, 6, 20, 'ESTANDAR');
INSERT INTO rooms VALUES (271, 6, 21, 'ESTANDAR');
INSERT INTO rooms VALUES (272, 6, 22, 'ESTANDAR');
INSERT INTO rooms VALUES (273, 6, 23, 'ESTANDAR');
INSERT INTO rooms VALUES (274, 6, 24, 'ESTANDAR');
INSERT INTO rooms VALUES (275, 6, 25, 'ESTANDAR');
INSERT INTO rooms VALUES (276, 6, 26, 'ESTANDAR');
INSERT INTO rooms VALUES (277, 6, 27, 'SUITE');
INSERT INTO rooms VALUES (278, 6, 28, 'ESTANDAR');
INSERT INTO rooms VALUES (279, 6, 29, 'ESTANDAR');
INSERT INTO rooms VALUES (280, 6, 30, 'ESTANDAR');
INSERT INTO rooms VALUES (281, 6, 31, 'ESTANDAR');
INSERT INTO rooms VALUES (282, 6, 32, 'ESTANDAR');
INSERT INTO rooms VALUES (283, 6, 33, 'ESTANDAR');
INSERT INTO rooms VALUES (284, 6, 34, 'ESTANDAR');
INSERT INTO rooms VALUES (285, 6, 35, 'ESTANDAR');
INSERT INTO rooms VALUES (286, 6, 36, 'ESTANDAR');
INSERT INTO rooms VALUES (287, 6, 37, 'ESTANDAR');
INSERT INTO rooms VALUES (288, 6, 38, 'ESTANDAR');
INSERT INTO rooms VALUES (289, 6, 39, 'ESTANDAR');
INSERT INTO rooms VALUES (290, 6, 40, 'ESTANDAR');
INSERT INTO rooms VALUES (291, 6, 41, 'ESTANDAR');
INSERT INTO rooms VALUES (292, 6, 42, 'ESTANDAR');
INSERT INTO rooms VALUES (293, 6, 43, 'ESTANDAR');
INSERT INTO rooms VALUES (294, 6, 44, 'ESTANDAR');
INSERT INTO rooms VALUES (295, 6, 45, 'ESTANDAR');
INSERT INTO rooms VALUES (296, 6, 46, 'ESTANDAR');
INSERT INTO rooms VALUES (297, 6, 47, 'ESTANDAR');
INSERT INTO rooms VALUES (298, 6, 48, 'SUITE');
INSERT INTO rooms VALUES (299, 6, 49, 'ESTANDAR');
INSERT INTO rooms VALUES (300, 6, 50, 'ESTANDAR');

COMMIT;

--changeset mmezi:3
CREATE TABLE guests (
	id   INTEGER PRIMARY KEY,
	name VARCHAR2(100) NOT NULL UNIQUE
);

--changeset mmezi:4
INSERT INTO guests (id, name) VALUES (1, 'aguilar,francisco');
INSERT INTO guests (id, name) VALUES (2, 'alarcón,salomón');
INSERT INTO guests (id, name) VALUES (3, 'álvarez,medellín felipe');
INSERT INTO guests (id, name) VALUES (4, 'rios,gaston');
INSERT INTO guests (id, name) VALUES (5, 'gastan,victor');
INSERT INTO guests (id, name) VALUES (6, 'camarena,alonso');
INSERT INTO guests (id, name) VALUES (7, 'morelos,óscar');
INSERT INTO guests (id, name) VALUES (8, 'camargo,alonso');
INSERT INTO guests (id, name) VALUES (9, 'gaspar,alonso');
INSERT INTO guests (id, name) VALUES (10, 'camarillo,alonso');
INSERT INTO guests (id, name) VALUES (11, 'camau,alonso');
INSERT INTO guests (id, name) VALUES (12, 'camberos,óscar');
INSERT INTO guests (id, name) VALUES (13, 'cambray,óscar');
INSERT INTO guests (id, name) VALUES (14, 'camino,óscar');
INSERT INTO guests (id, name) VALUES (15, 'campa,óscar');
INSERT INTO guests (id, name) VALUES (16, 'campillo,óscar');
INSERT INTO guests (id, name) VALUES (17, 'teutli,rodrigo');
INSERT INTO guests (id, name) VALUES (18, 'texeda,rodrigo');
INSERT INTO guests (id, name) VALUES (19, 'teyes,rodrigo');
INSERT INTO guests (id, name) VALUES (20, 'teyo,rodrigo');
INSERT INTO guests (id, name) VALUES (21, 'thelles,rodrigo');
INSERT INTO guests (id, name) VALUES (22, 'thobar,rodrigo');
INSERT INTO guests (id, name) VALUES (23, 'thorres,rodrigo');
INSERT INTO guests (id, name) VALUES (24, 'thovar,rodrigo');
INSERT INTO guests (id, name) VALUES (25, 'tierra,rodrigo');
INSERT INTO guests (id, name) VALUES (26, 'tierrablanca,rodrigo');
INSERT INTO guests (id, name) VALUES (27, 'campirano,óscar');
INSERT INTO guests (id, name) VALUES (28, 'campos,javier');
INSERT INTO guests (id, name) VALUES (29, 'camposano,javier');
INSERT INTO guests (id, name) VALUES (30, 'campusano,javier');
INSERT INTO guests (id, name) VALUES (31, 'cana,óscar');
INSERT INTO guests (id, name) VALUES (32, 'canal,óscar');
INSERT INTO guests (id, name) VALUES (33, 'gandara,gustavo');
INSERT INTO guests (id, name) VALUES (34, 'gaona,gustavo');
INSERT INTO guests (id, name) VALUES (35, 'garambuyo,gustavo');
INSERT INTO guests (id, name) VALUES (36, 'garate,gustavo');
INSERT INTO guests (id, name) VALUES (37, 'garavito,gustavo');
INSERT INTO guests (id, name) VALUES (38, 'garay,gustavo');
INSERT INTO guests (id, name) VALUES (39, 'acosta,rodrigo');
INSERT INTO guests (id, name) VALUES (40, 'garcia,alberto');
INSERT INTO guests (id, name) VALUES (41, 'Bairn, Roberyl');
INSERT INTO guests (id, name) VALUES (42, 'Foot, Mondtle');
INSERT INTO guests (id, name) VALUES (43, 'Sandy, Adas');
INSERT INTO guests (id, name) VALUES (44, 'Laspip, Mantatar');
INSERT INTO guests (id, name) VALUES (45, 'Burrow, Fasgo');
INSERT INTO guests (id, name) VALUES (46, 'Hard, Ponbert');
INSERT INTO guests (id, name) VALUES (47, 'Horn, Roro');
INSERT INTO guests (id, name) VALUES (48, 'Green, Wifro');
INSERT INTO guests (id, name) VALUES (49, 'Shire, Nelmir');
INSERT INTO guests (id, name) VALUES (50, 'gardea,alberto');
INSERT INTO guests (id, name) VALUES (51, 'garduno,alberto');
INSERT INTO guests (id, name) VALUES (52, 'garfias,alberto');
INSERT INTO guests (id, name) VALUES (53, 'garia,alberto');
INSERT INTO guests (id, name) VALUES (54, 'garibai,alberto');
INSERT INTO guests (id, name) VALUES (55, 'garibaldo,alberto');
INSERT INTO guests (id, name) VALUES (56, 'garibay,alberto');
INSERT INTO guests (id, name) VALUES (57, 'pedrosa ,martin');
INSERT INTO guests (id, name) VALUES (58, 'garivay,alberto');
INSERT INTO guests (id, name) VALUES (59, 'garnica,alberto');
INSERT INTO guests (id, name) VALUES (60, 'acosta,matias');
INSERT INTO guests (id, name) VALUES (61, 'garrido,alberto');
INSERT INTO guests (id, name) VALUES (62, 'garsa,alberto');
INSERT INTO guests (id, name) VALUES (63, 'garsia,alberto');
INSERT INTO guests (id, name) VALUES (64, 'garza,raúl');
INSERT INTO guests (id, name) VALUES (65, 'acevedo,pablo');
INSERT INTO guests (id, name) VALUES (66, 'teyo,maximo');
INSERT INTO guests (id, name) VALUES (67, 'garzia,raúl');
INSERT INTO guests (id, name) VALUES (68, 'gasca,raúl');
INSERT INTO guests (id, name) VALUES (69, 'gascon,raúl');
INSERT INTO guests (id, name) VALUES (70, 'gaspar,raúl');
INSERT INTO guests (id, name) VALUES (71, 'gastan,raúl');
INSERT INTO guests (id, name) VALUES (72, 'gatica,raúl');
INSERT INTO guests (id, name) VALUES (73, 'álvarez, salvador');
INSERT INTO guests (id, name) VALUES (74, 'gauna,alberto');
INSERT INTO guests (id, name) VALUES (75, 'villalva,santiago');
INSERT INTO guests (id, name) VALUES (76, 'villalvazo,salvador');
INSERT INTO guests (id, name) VALUES (77, 'villamar,gabriel');
INSERT INTO guests (id, name) VALUES (78, 'villami,gabriel');
INSERT INTO guests (id, name) VALUES (79, 'villanueba,gabriel');
INSERT INTO guests (id, name) VALUES (80, 'villapando,salvador');
INSERT INTO guests (id, name) VALUES (81, 'moral,óscar');
INSERT INTO guests (id, name) VALUES (82, 'morales,óscar');
INSERT INTO guests (id, name) VALUES (83, 'morantes,óscar');
INSERT INTO guests (id, name) VALUES (84, 'moras,óscar');
INSERT INTO guests (id, name) VALUES (85, 'morelos,salvador');
INSERT INTO guests (id, name) VALUES (86, 'moreno,óscar');
INSERT INTO guests (id, name) VALUES (87, 'morentin,óscar');
INSERT INTO guests (id, name) VALUES (88, 'patron,francisco');
INSERT INTO guests (id, name) VALUES (89, 'paulin,lucas');
INSERT INTO guests (id, name) VALUES (90, 'paura,lucas');
INSERT INTO guests (id, name) VALUES (91, 'pavon,tomas');
INSERT INTO guests (id, name) VALUES (92, 'paz,tomas        ');
INSERT INTO guests (id, name) VALUES (93, 'alarcón,gerardo genaro');
INSERT INTO guests (id, name) VALUES (94, 'pecina,tomas');
INSERT INTO guests (id, name) VALUES (95, 'pedraza,tomas');
INSERT INTO guests (id, name) VALUES (96, 'pedrosa,lucas');
INSERT INTO guests (id, name) VALUES (97, 'morelos,tomas');
INSERT INTO guests (id, name) VALUES (98, 'peeres,lucas');
INSERT INTO guests (id, name) VALUES (99, 'aguilar,dorantes');
INSERT INTO guests (id, name) VALUES (100, 'camarena,dorantes');

COMMIT;

CREATE TABLE reservations (
	id          INTEGER PRIMARY KEY, --INTEGER DEFAULT dept_seq.nextval NOT NULL,
	room_id     INTEGER NOT NULL,
	check_in          DATE NOT NULL,
	check_out         DATE NOT NULL,
	  CONSTRAINT fk_room
        FOREIGN KEY (room_id)
        REFERENCES rooms(id)
);

--INSERT INTO reservations (id, room_id, check_in, check_out) VALUES (1, 1, TO_DATE('2018/10/03', 'yyyy/mm/dd'), TO_DATE('2018/10/19', 'yyyy/mm/dd'));

COMMIT;