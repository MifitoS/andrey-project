CREATE TABLE university_group(
    id uuid primary key DEFAULT gen_random_uuid(),
    name varchar(255) NOT NULL,
    age INTEGER,
    create_at date NOT NULL
);

-- Комментарии к таблице
COMMENT ON TABLE university_group IS 'Учебная группа университета';

-- Комментарии к колонкам
COMMENT ON COLUMN university_group.id IS 'Уникальный идентификатор группы (UUID)';
COMMENT ON COLUMN university_group.name IS 'Уникальное имя группы';
COMMENT ON COLUMN university_group.age IS 'Возрастная категория или курс группы';
COMMENT ON COLUMN university_group.create_at IS 'Дата создания группы'