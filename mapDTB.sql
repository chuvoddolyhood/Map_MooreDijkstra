CREATE DATABASE Map;
USE Map;

CREATE TABLE Edge(
	ID_edge INT IDENTITY(1,1) PRIMARY KEY,
	name_edge VARCHAR(50) NOT NULL,
	ID_vertex_1 INT NOT NULL,
	ID_vertex_2 INT NOT NULL,
	distance FLOAT
);

DROP TABLE Edge
DELETE FROM Edge

SELECT * FROM Edge

INSERT INTO Edge VALUES ('Duong truoc Tram y te', 1, 14, 190.27);
INSERT INTO Edge VALUES ('Duong ke cong sau Khoa KHTN', 2, 1, 161.28);
INSERT INTO Edge VALUES ('Duong nha xe C1', 3, 2, 56.14);
INSERT INTO Edge VALUES ('Vong xuyen 3', 3, 6, 14.53);
INSERT INTO Edge VALUES ('Vong xuyen 2', 4, 3, 25.88);
INSERT INTO Edge VALUES ('Vong xuyen 1', 5, 4, 23.51);
INSERT INTO Edge VALUES ('Vong xuyen 4', 6, 5, 25.37);
INSERT INTO Edge VALUES ('Duong truoc nha hoc C1', 6, 10, 180.22);
INSERT INTO Edge VALUES ('Duong cong A giua LRC va Vuon Bang', 7, 5, 144.79);
INSERT INTO Edge VALUES ('Duong truoc LRC va D2', 7, 9, 173.63);
INSERT INTO Edge VALUES ('Duong tu cong A vao', 8, 7, 29.00);
INSERT INTO Edge VALUES ('Duong tu cong B vao, truoc Nha dieu hanh', 9, 10, 162.06);
INSERT INTO Edge VALUES ('Duong truoc bai xe Doan thanh nien', 10, 11, 91.37);
INSERT INTO Edge VALUES ('Duong thu 1 vao khoa CNTT&TT', 11, 12, 52.76);
INSERT INTO Edge VALUES ('Duong truoc khoa CNTT&TT', 11, 13, 71.48);
INSERT INTO Edge VALUES ('Duong thu 2 vao khoa CNTT&TT', 13, 12, 51.03);
INSERT INTO Edge VALUES ('Duong truoc khoa Nong nghiep', 14, 13, 143.97);


--so cung/so dinh
SELECT COUNT(*) AS so_cung, MAX(ID_Vertex_1) AS so_dinh FROM Edge;

//Lay thong tin vertex
SELECT ID_vertex_1, ID_Vertex_2 FROM Edge;