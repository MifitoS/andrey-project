create INDEX idx_student_group_id
on student (group_id);

comment on INDEX idx_student_group_id IS 'Индекс для ускорения поиска студентов по группе';

