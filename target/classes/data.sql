-- DEPARTAMENTOS
INSERT INTO department (id, nome) VALUES (1, 'Exatas'), (2, 'Humanas');

-- TÍTULOS
INSERT INTO title (id, nome) VALUES (1, 'Doutor'), (2, 'Mestre');

-- PROFESSORES
INSERT INTO professor (id, department_id, title_id, nome) VALUES (1, 1, 1, 'Prof. Ana'), (2, 2, 2, 'Prof. Bruno');

-- PRÉDIOS
INSERT INTO building (id, nome) VALUES (1, 'Prédio A'), (2, 'Prédio B');

-- SALAS
INSERT INTO room (id, building_id, nome) VALUES (1, 1, 'Sala 101'), (2, 2, 'Sala 202');

-- DISCIPLINAS
INSERT INTO subject (id, codigo, nome) VALUES (1, 'MAT101', 'Matemática Básica'), (2, 'HIS201', 'História Geral');

-- TURMAS
INSERT INTO class (id, subject_id, ano, semestre, codigo, professor_id) VALUES (1, 1, 2025, 1, 'A', 1), (2, 2, 2025, 1, 'B', 2);

-- HORÁRIOS DE AULA
INSERT INTO class_schedule (id, class_id, room_id, dia_semana, hora_inicio, hora_fim) VALUES
  (1, 1, 1, 1, '08:00', '10:00'),
  (2, 1, 1, 3, '10:00', '12:00'),
  (3, 2, 2, 2, '14:00', '16:00');

-- PRÉ-REQUISITOS DE DISCIPLINAS
INSERT INTO subject_prerequisite (id, subject_id, prerequisiteid) VALUES (1, 2, 1);
