CREATE TABLE student(
    id uuid primary key default gen_random_uuid(),
    name varchar(255) not null,
    create_at date NOT NULL,
    group_id uuid,

    CONSTRAINT fk_student_group
    Foreign key (group_id)
    REFERENCES university_group (id)

);

-- Комментарии к таблице
COMMENT ON TABLE student IS 'Студенты университета';

-- Комментарии к колонкам
COMMENT ON COLUMN student.id IS 'Уникальный идентификатор студента (UUID)';
COMMENT ON COLUMN student.name IS 'Имя студента';
COMMENT ON COLUMN student.create_at IS 'Дата зачисления студента'