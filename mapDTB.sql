CREATE DATABASE Map;
USE Map;

CREATE TABLE Map(
	ID_map INT IDENTITY(1,1) PRIMARY KEY,
	title_map VARCHAR(50) NOT NULL
	--image
);


CREATE TABLE Vertex(
	ID_vertex INT PRIMARY KEY,
	name_vertex VARCHAR(50) NOT NULL,
	type_vertex INT, --dia diem noi bat cho phep hien thi
	coordinates_x INT NOT NULL,
	coordinates_y INT NOT NULL,
	ID_map INT REFERENCES Map(ID_map)
);
DROP TABLE Vertex;


CREATE TABLE Edge(
	ID_edge INT PRIMARY KEY,
	name_edge VARCHAR(50) NOT NULL,
	ID_vertex_1 INT NOT NULL REFERENCES Vertex(ID_vertex),
	ID_vertex_2 INT NOT NULL REFERENCES Vertex(ID_vertex),
	distance FLOAT,
	two_way INT,
	ID_map INT REFERENCES Map(ID_map)
);
DROP TABLE Edge


CREATE TABLE Vehicle(
	ID_vehicle INT PRIMARY KEY,
	title_vehicle VARCHAR(30) NOT NULL,
	speed float
);
DROP TABLE Vehicle

CREATE TABLE Vehicle_Edge(
	ID_edge INT REFERENCES Edge(ID_edge),
	ID_vehicle INT REFERENCES Vehicle(ID_vehicle),
);



--///////////////////////////////////////////////////////
--Map
SELECT * FROM Map
INSERT INTO Map VALUES ('Ban do DHCT');
INSERT INTO Map VALUES ('Khu vuc Ben Ninh Kieu');
INSERT INTO Map VALUES ('Cong vien Luu Huu Phuoc_Dai lo Hoa Binh');

--Vertex
SELECT * FROM Vertex;
DELETE FROm Vertex;

INSERT INTO Vertex VALUES (1, 'Nga 3 Nha thi dau va Gym', 0, 1055, 271, 1);
INSERT INTO Vertex VALUES (2, 'Nha xe C1', 1, 1324, 485, 1);
INSERT INTO Vertex VALUES (3, 'Dinh vong xuyen 2 3', 0, 1437, 518, 1);
INSERT INTO Vertex VALUES (4, 'Dinh vong xuyen 1 2', 0, 1492, 499, 1);
INSERT INTO Vertex VALUES (5, 'Dinh vong xuyen 1 4', 0, 1503, 551, 1);
INSERT INTO Vertex VALUES (6, 'Dinh vong xuyen 3 4', 0, 1445, 551, 1);
INSERT INTO Vertex VALUES (7, 'Nha xuat ban sach DHCT', 1, 1734, 746, 1);
INSERT INTO Vertex VALUES (8, 'Cong A', 1, 1775, 782, 1);
INSERT INTO Vertex VALUES (9, 'Phong bao ve cong B', 1, 1503, 1034, 1);
INSERT INTO Vertex VALUES (10, 'Nga 3 truoc Hoi truong rua_nha VPD', 0, 1214, 848, 1);
INSERT INTO Vertex VALUES (11, 'Loi thu 1 vao khoa CNTT&TT', 0, 1051, 739, 1);
INSERT INTO Vertex VALUES (12, 'Khoa CNTT', 1, 1014, 640, 1);
INSERT INTO Vertex VALUES (13, 'Loi thu 2 vao khoa CNTT&TT', 0, 923, 657, 1);
INSERT INTO Vertex VALUES (14, 'Nga 3 khoa NN_B1', 0, 611, 842, 1);
INSERT INTO Vertex VALUES (15, 'Tram y te DHCT', 1, 792, 365, 1);
INSERT INTO Vertex VALUES (16, 'Phong Gym DHCT', 1, 840, 289, 1);
INSERT INTO Vertex VALUES (17, 'Nha hoc B1', 1, 600, 450, 1);
INSERT INTO Vertex VALUES (18, 'Loi 1 vao khoa Cong Nghe', 0, 446, 348, 1);
INSERT INTO Vertex VALUES (19, 'Nga 3 truoc khoa Cong Nghe', 0, 348, 292, 1);
INSERT INTO Vertex VALUES (20, 'Loi 2 vao khoa Cong Nghe', 0, 311, 266, 1);
INSERT INTO Vertex VALUES (21, 'Khoa Cong Nghe', 1, 420, 254, 1);
INSERT INTO Vertex VALUES (22, 'Khoa Thuy San', 1, 244, 425, 1);
INSERT INTO Vertex VALUES (23, 'Nha hoc D2', 1, 1088, 611, 1);
INSERT INTO Vertex VALUES (24, 'Nha hoc C1', 1, 1153, 529, 1);

INSERT INTO Vertex VALUES (26, 'Vuon bang DHCT', 1, 1291, 498, 1);
INSERT INTO Vertex VALUES (27, 'Nga 3 truoc Hoi truong Rua voi Nha Dieu Hanh', 0, 1029, 725, 1);
INSERT INTO Vertex VALUES (28, 'Nga 3 loi vao Hoi truong Rua', 0, 1015, 751, 1);
INSERT INTO Vertex VALUES (29, 'Loi thu 1 vao Hoi truong Rua', 0, 954, 753, 1);
INSERT INTO Vertex VALUES (30, 'Hoi truong Rua', 1, 970, 805, 1);
INSERT INTO Vertex VALUES (31, 'Loi thu 2 vao Hoi truong Rua', 0, 1025, 807, 1);
INSERT INTO Vertex VALUES (32, 'Loi thu 2 vao Nha Dieu Hanh', 0, 1054, 738, 1);
INSERT INTO Vertex VALUES (33, 'Nha Dieu Hanh', 1, 1140, 717, 1);
INSERT INTO Vertex VALUES (34, 'Loi thu 1 vao Nha Dieu Hanh', 0, 1192, 826, 1);
INSERT INTO Vertex VALUES (35, 'Cong B', 1, 1282, 885, 1);
INSERT INTO Vertex VALUES (36, 'Nha hoc D1', 1, 1300, 797, 1);
INSERT INTO Vertex VALUES (37, 'Trung tam hoc lieu', 1, 1413, 662, 1);
INSERT INTO Vertex VALUES (38, 'Khoa KHXH&NV', 1, 1547, 494, 1);
INSERT INTO Vertex VALUES (39, 'Truoc Cong sau Khoa KHTN', 0, 990, 311, 1);
INSERT INTO Vertex VALUES (40, 'Dinh thu 3 ho sen Khoa KHTN', 0, 1038, 248, 1);
INSERT INTO Vertex VALUES (41, 'Dinh thu 2 ho sen Khoa KHTN', 0, 1085, 196, 1);
INSERT INTO Vertex VALUES (42, 'Dinh thu 4 ho sen Khoa KHTN', 0, 1100, 279, 1);
INSERT INTO Vertex VALUES (43, 'Dinh thu 1 ho sen Khoa KHTN', 0, 1149, 233, 1);
INSERT INTO Vertex VALUES (44, 'Khoa KHTN', 1, 1295, 355, 1);
INSERT INTO Vertex VALUES (45, 'Khuc cua Nha xe DHCT', 0, 1370, 269, 1);
INSERT INTO Vertex VALUES (46, 'Truoc Khoa Khoa hoc chinh tri', 0, 1313, 219, 1);
INSERT INTO Vertex VALUES (47, 'Khoa Khoa hoc chinh tri', 1, 1362, 161, 1);
INSERT INTO Vertex VALUES (48, 'Khoa Kinh te', 1, 1207, 140, 1);
INSERT INTO Vertex VALUES (49, 'Nga 3 nha thi dau moi & KTX A', 0, 1023, 1, 1);
INSERT INTO Vertex VALUES (50, 'Nha thi dau TDTT-DHCT', 1, 990, 42, 1);


UPDATE Vertex SET name_vertex='Nha hoc D1' WHERE ID_vertex=36;

--Edge
DELETE FROM Edge

SELECT * FROM Edge

INSERT INTO Edge VALUES (1, 'Duong truoc phong Gym', 1, 16, 44.48, 1, 1);
INSERT INTO Edge VALUES (2, 'Duong ke cong sau Khoa KHTN', 1, 39, 80.04, 1, 1);
INSERT INTO Edge VALUES (3, 'Duong truoc Nha thi dau TDTT', 1, 50, 113.03, 1, 1);

INSERT INTO Edge VALUES (4, 'Duong ke Khoa KHTN va Nha hoc C1', 2, 3, 56.14, 1, 1);
INSERT INTO Edge VALUES (5, 'Duong ke Khoa KHTN va Nha xe C1', 2, 39, 82.34, 1, 1);

INSERT INTO Edge VALUES (6, 'Duong thu 3 Vong xuyen', 3, 6, 14.53, 0, 1);

INSERT INTO Edge VALUES (7, 'Duong thu 2 Vong xuyen', 4, 3, 25.88, 0, 1);
INSERT INTO Edge VALUES (8, 'Duong truoc Khoa KHTN va Vuon bang', 4, 44, 47.03, 1, 1);

INSERT INTO Edge VALUES (9, 'Duong thu 1 Vong xuyen', 5, 4, 23.51, 0, 1);
INSERT INTO Edge VALUES (10, 'Duong truoc Vuon bang', 5, 26, 33.65, 1, 1);

INSERT INTO Edge VALUES (11, 'Duong thu 4 Vong xuyen', 6, 5, 25.37, 0, 1);
INSERT INTO Edge VALUES (12, 'Duong tu Nha hoc C1', 6, 24, 50.05, 1, 1);

INSERT INTO Edge VALUES (13, 'Loi Cong A', 7, 8, 29.00, 1, 1);
INSERT INTO Edge VALUES (14, 'Duong ke ben TTHL & Vuon bang', 7, 26, 111.76, 1, 1);
INSERT INTO Edge VALUES (15, 'Duong truoc TTHL', 7, 37, 23.49, 1, 1);
INSERT INTO Edge VALUES (16, 'Duong truoc nha hoc A3', 7, 38, 91.79, 1, 1);

INSERT INTO Edge VALUES (17, 'Duong truoc Nha dieu hanh', 9, 34, 40.53, 1, 1);
INSERT INTO Edge VALUES (18, 'Duong truoc Nha bao ve', 9, 35, 24.16, 1, 1);
INSERT INTO Edge VALUES (19, 'Duong truoc Nha hoc D1', 9, 36, 46.59, 1, 1);

INSERT INTO Edge VALUES (20, 'Duong truoc bai xe Van phong doan', 10, 11, 91.37, 1, 1);
INSERT INTO Edge VALUES (21, 'Duong truoc bai xe Van phong doan & Nha hoc D2', 10, 23, 64.79, 1, 1);
INSERT INTO Edge VALUES (22, 'Duong truoc Hoi truong rua', 10, 27, 15.74, 1, 1);

INSERT INTO Edge VALUES (23, 'Loi thu 1 vao Khoa CNTT&TT', 11, 12, 52.76, 1, 1);
INSERT INTO Edge VALUES (24, 'Duong truoc Khoa CNTT&TT', 11, 13, 71.48, 1, 1);

INSERT INTO Edge VALUES (25, 'Loi thu 2 vao Khoa CNTT&TT', 12, 13, 51.03, 1, 1);

INSERT INTO Edge VALUES (26, 'Duong truoc Khoa Nong nghiep', 13, 14, 143.97, 1, 1);

INSERT INTO Edge VALUES (27, 'Duong ke Nha hoc B1 & Tram y te', 14, 15, 94.62, 1, 1);
INSERT INTO Edge VALUES (28, 'Duong truoc Khoa Nong nghiep & Nha hoc B1', 14, 17, 66.93, 1, 1);

INSERT INTO Edge VALUES (29, 'Duong truoc Tram y te', 15, 16, 49.94, 1, 1);

INSERT INTO Edge VALUES (30, 'Duong truoc Nha hoc B1', 17, 18, 109.16, 1, 1);

INSERT INTO Edge VALUES (31, 'Duong truoc Khoa Cong Nghe', 18, 19, 60.76, 1, 1);
INSERT INTO Edge VALUES (32, 'Loi vao thu 1 Khoa Cong Nghe', 18, 21, 60.8, 1, 1);

INSERT INTO Edge VALUES (33, 'Duong truoc Khoa Cong Nghe', 19, 20, 25.13, 1, 1);
INSERT INTO Edge VALUES (34, 'Duong truoc Khoa Thuy san', 19, 22, 95.16, 1, 1);

INSERT INTO Edge VALUES (35, 'Loi vao thu 2 Khoa Cong Nghe', 20, 21, 54.41, 1, 1);

INSERT INTO Edge VALUES (36, 'Duong truoc Nha hoc C1', 23, 24, 66.92, 1, 1);

INSERT INTO Edge VALUES (37, 'Loi vao Hoi truong rua', 27, 28, 18.04, 1, 1);
INSERT INTO Edge VALUES (38, 'Duong truoc Hoi truong rua', 27, 32, 14.05, 1, 1);

INSERT INTO Edge VALUES (39, 'Duong thu 1 Vong xuyen HTR', 28, 29, 32.82, 1, 1);
INSERT INTO Edge VALUES (40, 'Duong thu 4 Vong xuyen HTR', 28, 31, 32.12, 1, 1);

INSERT INTO Edge VALUES (41, 'Duong thu 2 Vong xuyen HTR', 29, 30, 31, 1, 1);

INSERT INTO Edge VALUES (42, 'Duong thu 3 Vong xuyen HTR', 30, 31, 33.29, 1, 1);

INSERT INTO Edge VALUES (43, 'Loi vao thu 2 Nha dieu hanh', 32, 33, 52.59, 1, 1);
INSERT INTO Edge VALUES (44, 'Duong truoc Nha dieu hanh', 32, 34, 91.92, 1, 1);

INSERT INTO Edge VALUES (45, 'Loi vao thu 1 Nha dieu hanh', 33, 34, 68.04, 1, 1);

INSERT INTO Edge VALUES (46, 'Duong truoc Nha hoc D1 & TTHL', 36, 37, 105.56, 1, 1);

INSERT INTO Edge VALUES (47, 'Duong ra cong sau khoa KHTN', 39, 40, 44.36, 1, 1);

INSERT INTO Edge VALUES (48, 'Duong thu 2 Ho sen Khoa KHTN', 40, 41, 36.99, 1, 1);
INSERT INTO Edge VALUES (49, 'Duong thu 3 Ho sen Khoa KHTN', 40, 42, 38.19, 1, 1);

INSERT INTO Edge VALUES (50, 'Duong thu 1 Ho sen Khoa KHTN', 41, 43, 45.7, 1, 1);

INSERT INTO Edge VALUES (51, 'Duong thu 4 Ho sen Khoa KHTN', 42, 43, 39.02, 1, 1);

INSERT INTO Edge VALUES (52, 'Loi vao Ho sen Khoa KHTN', 43, 44, 109.47, 1, 1);

INSERT INTO Edge VALUES (53, 'Duong truoc Khoa KHTN', 44, 45, 62.05, 1, 1);

INSERT INTO Edge VALUES (54, 'Duong truoc Khoa KHCT', 45, 46, 40.92, 1, 1);

INSERT INTO Edge VALUES (55, 'Loi vao Khoa KHCT', 46, 47, 41.52, 1, 1);
INSERT INTO Edge VALUES (56, 'Duong truoc Khoa KHCT', 46, 48, 72.9, 1, 1);

INSERT INTO Edge VALUES (57, 'Duong truoc Khoa Kinh te', 48, 49, 137.37, 1, 1);

INSERT INTO Edge VALUES (58, 'Duong truoc Nha thi dau TDTT', 49, 50, 41.58, 1, 1);


--Vehicle
SELECT * FROM Vehicle;
INSERT INTO Vehicle VALUES (1, 'Di bo', 5); --toc do trung binh
INSERT INTO Vehicle VALUES (2, 'Xe dap', 15); --toc do khuyen cao
INSERT INTO Vehicle VALUES (3, 'Xe may', 25); --toc do khuyen cao
INSERT INTO Vehicle VALUES (4, 'Xe o to', 30); --toc do khuyen cao

--Vehicle_edge
DELETE FROM Vehicle_Edge

SELECT * FROM Vehicle_Edge
INSERT INTO Vehicle_Edge VALUES (1, 1);
INSERT INTO Vehicle_Edge VALUES (2, 1);
INSERT INTO Vehicle_Edge VALUES (3, 1);
INSERT INTO Vehicle_Edge VALUES (4, 1);
INSERT INTO Vehicle_Edge VALUES (5, 1);
INSERT INTO Vehicle_Edge VALUES (6, 1);
INSERT INTO Vehicle_Edge VALUES (7, 1);
INSERT INTO Vehicle_Edge VALUES (8, 1);
INSERT INTO Vehicle_Edge VALUES (9, 1);
INSERT INTO Vehicle_Edge VALUES (10, 1);
INSERT INTO Vehicle_Edge VALUES (11, 1);
INSERT INTO Vehicle_Edge VALUES (12, 1);
INSERT INTO Vehicle_Edge VALUES (13, 1);
INSERT INTO Vehicle_Edge VALUES (14, 1);
INSERT INTO Vehicle_Edge VALUES (15, 1);
INSERT INTO Vehicle_Edge VALUES (16, 1);
INSERT INTO Vehicle_Edge VALUES (17, 1);

INSERT INTO Vehicle_Edge VALUES (1, 2);
INSERT INTO Vehicle_Edge VALUES (2, 2);
INSERT INTO Vehicle_Edge VALUES (3, 2);
INSERT INTO Vehicle_Edge VALUES (4, 2);
INSERT INTO Vehicle_Edge VALUES (5, 2);
INSERT INTO Vehicle_Edge VALUES (6, 2);
INSERT INTO Vehicle_Edge VALUES (7, 2);
INSERT INTO Vehicle_Edge VALUES (8, 2);
INSERT INTO Vehicle_Edge VALUES (9, 2);
INSERT INTO Vehicle_Edge VALUES (10, 2);
INSERT INTO Vehicle_Edge VALUES (11, 2);
INSERT INTO Vehicle_Edge VALUES (12, 2);
INSERT INTO Vehicle_Edge VALUES (13, 2);
INSERT INTO Vehicle_Edge VALUES (14, 2);
INSERT INTO Vehicle_Edge VALUES (15, 2);
INSERT INTO Vehicle_Edge VALUES (16, 2);
INSERT INTO Vehicle_Edge VALUES (17, 2);

INSERT INTO Vehicle_Edge VALUES (1, 3);
INSERT INTO Vehicle_Edge VALUES (2, 3);
INSERT INTO Vehicle_Edge VALUES (3, 3);
INSERT INTO Vehicle_Edge VALUES (4, 3);
INSERT INTO Vehicle_Edge VALUES (5, 3);
INSERT INTO Vehicle_Edge VALUES (6, 3);
INSERT INTO Vehicle_Edge VALUES (7, 3);
INSERT INTO Vehicle_Edge VALUES (8, 3);
INSERT INTO Vehicle_Edge VALUES (9, 3);
INSERT INTO Vehicle_Edge VALUES (10, 3);
INSERT INTO Vehicle_Edge VALUES (11, 3);
INSERT INTO Vehicle_Edge VALUES (12, 3);
INSERT INTO Vehicle_Edge VALUES (13, 3);
INSERT INTO Vehicle_Edge VALUES (14, 3);
INSERT INTO Vehicle_Edge VALUES (15, 3);
INSERT INTO Vehicle_Edge VALUES (16, 3);
INSERT INTO Vehicle_Edge VALUES (17, 3);

INSERT INTO Vehicle_Edge VALUES (1, 4);
INSERT INTO Vehicle_Edge VALUES (2, 4);
INSERT INTO Vehicle_Edge VALUES (3, 4);
INSERT INTO Vehicle_Edge VALUES (4, 4);
INSERT INTO Vehicle_Edge VALUES (5, 4);
INSERT INTO Vehicle_Edge VALUES (6, 4);
INSERT INTO Vehicle_Edge VALUES (7, 4);
INSERT INTO Vehicle_Edge VALUES (8, 4);
INSERT INTO Vehicle_Edge VALUES (9, 4);
INSERT INTO Vehicle_Edge VALUES (10, 4);
INSERT INTO Vehicle_Edge VALUES (11, 4);
INSERT INTO Vehicle_Edge VALUES (12, 4);
INSERT INTO Vehicle_Edge VALUES (13, 4);
INSERT INTO Vehicle_Edge VALUES (14, 4);
INSERT INTO Vehicle_Edge VALUES (15, 4);
INSERT INTO Vehicle_Edge VALUES (16, 4);
INSERT INTO Vehicle_Edge VALUES (17, 4);
--////////////////////////////////////////////////////////////////

--so cung/so dinh
SELECT COUNT(*) AS so_cung, MAX(ID_Vertex_1) AS so_dinh FROM Edge;

--Lay thong tin vertex
SELECT * FROM Edge
SELECT ID_vertex_1, ID_Vertex_2, distance, two_way FROM Edge;


--Vertex noi bat
SELECT name_vertex FROM Vertex WHERE type_vertex=1;

--Thong tin vertex
SELECT * FROM Vertex


--Chinh sua thong tin toa do Vertex
UPDATE Vertex SET coordinates_x=699, coordinates_y=512 WHERE ID_vertex=14;


--Get toa do tu name_vertex
SELECT ID_vertex, coordinates_x, coordinates_y FROM Vertex WHERE name_vertex = 'Cong A'


SELECT COUNT(*) AS so_cung FROM Edge;
SELECT COUNT(*) AS so_dinh FROM Vertex;




--Lay toa do tu ID_vertex
SELECT coordinates_x, coordinates_y FROM Vertex WHERE ID_vertex=7



SELECT * FROM Edge
SELECT * FROM Vertex

SELECT (SELECT name_vertex FROM Vertex WHERE ID_Vertex = 2) AS startVertex, 
	(SELECT name_vertex FROM Vertex WHERE ID_Vertex = 3) AS endVertex,
	E.name_edge, E.distance, E.two_way 
FROM Edge E JOIN Vertex V ON E.ID_Vertex_1=V.ID_Vertex 
WHERE (ID_Vertex_1 = 2 OR ID_Vertex_2 = 2) AND (ID_Vertex_1 = 3 OR ID_Vertex_2 = 3);




SELECT * FROM Vehicle

SELECT speed FROM Vehicle WHERE title_vehicle='Di bo';




SELECT * FROM Edge
SELECT * FROM Vertex
SELECT * FROM Vehicle_Edge