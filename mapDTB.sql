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


--Edge
DELETE FROM Edge

SELECT * FROM Edge

INSERT INTO Edge VALUES (1, 'Duong truoc Tram y te', 1, 14, 190.27, 1, 1);
INSERT INTO Edge VALUES (2, 'Duong ke cong sau Khoa KHTN', 2, 1, 161.28, 1, 1);
INSERT INTO Edge VALUES (3, 'Duong nha xe C1', 3, 2, 56.14, 1, 1);
INSERT INTO Edge VALUES (4, 'Vong xuyen 3', 3, 6, 14.53, 0, 1);
INSERT INTO Edge VALUES (5, 'Vong xuyen 2', 4, 3, 25.88, 0, 1);
INSERT INTO Edge VALUES (6, 'Vong xuyen 1', 5, 4, 23.51, 0, 1);
INSERT INTO Edge VALUES (7, 'Vong xuyen 4', 6, 5, 25.37, 0, 1);
INSERT INTO Edge VALUES (8, 'Duong truoc nha hoc C1', 6, 10, 180.22, 1, 1);
INSERT INTO Edge VALUES (9, 'Duong cong A giua LRC va Vuon Bang', 7, 5, 144.79, 1, 1);
INSERT INTO Edge VALUES (10, 'Duong truoc LRC va D2', 7, 9, 173.63, 1, 1);
INSERT INTO Edge VALUES (11, 'Duong tu cong A vao', 8, 7, 29.00, 1, 1);
INSERT INTO Edge VALUES (12, 'Duong tu cong B vao, truoc Nha dieu hanh', 9, 10, 162.06, 1, 1);
INSERT INTO Edge VALUES (13, 'Duong truoc bai xe Doan thanh nien', 10, 11, 91.37, 1, 1);
INSERT INTO Edge VALUES (14, 'Duong thu 1 vao khoa CNTT&TT', 11, 12, 52.76, 1, 1);
INSERT INTO Edge VALUES (15, 'Duong truoc khoa CNTT&TT', 11, 13, 71.48, 1, 1);
INSERT INTO Edge VALUES (16, 'Duong thu 2 vao khoa CNTT&TT', 13, 12, 51.03, 1, 1);
INSERT INTO Edge VALUES (17, 'Duong truoc khoa Nong nghiep', 14, 13, 143.97, 1, 1);

--Vehicle
SELECT * FROM Vehicle;
INSERT INTO Vehicle VALUES (1, 'Di bo', 5); --toc do trung binh
INSERT INTO Vehicle VALUES (2, 'Xe dap', 15); --toc do khuyen cao
INSERT INTO Vehicle VALUES (3, 'Xe may', 40); --toc do khuyen cao
INSERT INTO Vehicle VALUES (4, 'Xe o to', 50); --toc do khuyen cao


--Vehicle_edge
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




