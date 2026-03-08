CREATE TABLE dict_data_type
(
    id                 TINYINT(1) NOT NULL AUTO_INCREMENT COMMENT '数据类型ID',
    data_type_name     VARCHAR(50) NOT NULL COMMENT '数据类型名称（图片、视频、音频、表格、文档）',
    data_type_code     VARCHAR(50) NOT NULL COMMENT '数据类型编码（image/video/audio/table/document）',
    sort               INT(4) DEFAULT 0 COMMENT '排序权重',
    primary key (id),
    unique key (data_type_code)
)ENGINE = InnoDB  COMMENT ='数据类型字典表';

CREATE TABLE dict_task_type
(
    id                 TINYINT(1) NOT NULL AUTO_INCREMENT COMMENT '任务类型ID',
    task_type_name     VARCHAR(50) NOT NULL COMMENT '任务类型名称（分类、预测 、动作跟踪、动作识别）',
    task_type_code     VARCHAR(50) NOT NULL COMMENT '任务类型编码(classification/prediction/action_tracking/action_recognition)',
    data_type_id       TINYINT(1) NOT NULL COMMENT '关联数据类型ID（限制数据 + 任务类型组合）',
    sort               INT(4) DEFAULT 0 COMMENT '排序权重',
    primary key (id),
    foreign key (data_type_id) references dict_data_type(id),
    unique key (task_type_name)
)ENGINE = InnoDB  COMMENT ='任务类型字典表';

CREATE TABLE dataset
(
    id                 VARCHAR(32) DEFAULT (UUID()) COMMENT '数据集ID',
    dataset_name       VARCHAR(50) NOT NULL COMMENT '数据集名称',
    data_type_id       TINYINT(1) NOT NULL COMMENT '数据类型ID',
    task_type_id       TINYINT(1) NOT NULL COMMENT '任务类型ID',
    parent_dataset_id  VARCHAR(32) DEFAULT (UUID()) COMMENT '父数据集ID（支持包含已有数据集）(自关联)',
    status             TINYINT(1) NOT NULL DEFAULT 1 COMMENT '状态（1=待标注，2=标注中，3=已完成），默认待标注',
    dataset_type       TINYINT(1) NOT NULL DEFAULT 1 COMMENT '类型（1=公开数据集，2=私有数据集，3=自定义数据集）',
    create_user_id     VARCHAR(32) DEFAULT (UUID()) COMMENT '创建人ID',
    create_time        DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_user_id     VARCHAR(32) DEFAULT (UUID()) COMMENT '更新人ID',
    update_time        DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    primary key (id),
    foreign key (create_user_id) references sys_user(id),
    foreign key (update_user_id) references sys_user(id),
    foreign key (data_type_id) references dict_data_type(id),
    foreign key (task_type_id) references dict_task_type(id),
    foreign key (parent_dataset_id) references dataset(id),
    unique key (dataset_name)
)ENGINE = InnoDB  COMMENT ='数据集表';

CREATE TABLE dataset_relationship
(
    id                        VARCHAR(32) DEFAULT (UUID()) COMMENT '关联关系ID',
    source_dataset_id         VARCHAR(32) DEFAULT (UUID()) COMMENT '源数据集ID',
    target_dataset_id         VARCHAR(32) DEFAULT (UUID()) COMMENT '目标数据集ID',
    relationship_type         VARCHAR(50) NOT NULL COMMENT '关系类型',
    relationship_description  TEXT NOT NULL COMMENT '关系描述',
    create_user_id            VARCHAR(32) DEFAULT (UUID()) COMMENT '创建人ID',
    create_time               DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_user_id            VARCHAR(32) DEFAULT (UUID()) COMMENT '更新人ID',
    update_time               DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    primary key (id),
    foreign key (create_user_id) references sys_user(id),
    foreign key (update_user_id) references sys_user(id),
    foreign key (source_dataset_id) references dataset(id),
    foreign key (target_dataset_id) references dataset(id)
)ENGINE = InnoDB  COMMENT ='数据集关联表';

CREATE TABLE dataset_file
(
    id                        VARCHAR(32) DEFAULT (UUID()) COMMENT '关联ID',
    dataset_id                VARCHAR(32) DEFAULT (UUID()) COMMENT '所属数据集ID',
    file_name                 VARCHAR(50) NOT NULL COMMENT '文件名',
    file_status               TINYINT(1) NOT NULL DEFAULT 1 COMMENT '文件状态（1=未标注，2=已标注）',
    file_path                 VARCHAR(100) NOT NULL COMMENT '文件存储路径',
    file_type                 VARCHAR(50) NOT NULL COMMENT '文件格式',
    file_size                 BIGINT NOT NULL COMMENT '文件大小',
    import_type               TINYINT(1) NOT NULL DEFAULT 1 COMMENT '导入类型：1=本地上传，2=云端导入，3=API拉取，4=从已有数据集导入',
    import_user_id            VARCHAR(32) DEFAULT (UUID()) COMMENT '导入人ID',
    create_time               DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    primary key (id),
    foreign key (dataset_id) references dataset(id),
    foreign key (import_user_id) references sys_user(id)
)ENGINE = InnoDB  COMMENT ='数据集_文件关联表';

CREATE TABLE annotation_task
(
    id                        VARCHAR(32) DEFAULT (UUID()) COMMENT '标注任务ID',
    task_name                 VARCHAR(50) NOT NULL COMMENT '标注任务名称',
    dataset_id                VARCHAR(32) DEFAULT (UUID()) COMMENT '关联数据集ID',
    status                    TINYINT(1) NOT NULL DEFAULT 1 COMMENT '状态（1=未开始，2=进行中，3=已结束）',
    progress                  INT(4) NOT NULL DEFAULT 0 COMMENT '标注进度',
    total_file_count          BIGINT NOT NULL DEFAULT 0 COMMENT '该任务的总文件数（先统计dataset_file WHERE dataset_id = 该任务dataset_id的记录数，赋值给total_file_count（总文件数））',
    annotated_count           BIGINT NOT NULL DEFAULT 0 COMMENT '已标注文件数（新增标注结果时自动 + 1）',
    create_user_id            VARCHAR(32) DEFAULT (UUID()) COMMENT '创建人ID',
    create_time               DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time               DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    primary key (id),
    foreign key (dataset_id) references dataset(id),
    foreign key (create_user_id) references sys_user(id),
    unique key (task_name)
)ENGINE = InnoDB  COMMENT ='标注任务表';

CREATE TABLE annotation_result
(
    id                        VARCHAR(32) DEFAULT (UUID()) COMMENT '标注结果ID',
    task_id                   VARCHAR(32) DEFAULT (UUID()) COMMENT '关联标注任务ID',
    file_id                   VARCHAR(32) DEFAULT (UUID()) COMMENT '关联数据集文件ID',
    dataset_id                VARCHAR(32) DEFAULT (UUID()) COMMENT '数据集的冗余字段',
    annotation_content        TEXT NOT NULL COMMENT '标注内容（JSON格式）',
    annotation_type           VARCHAR(50) NOT NULL COMMENT '标注类型（由 data_type+task_type 决定，如 image_classify、video_action_tracking）',
    create_time               DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    primary key (id),
    foreign key (task_id) references annotation_task(id),
    foreign key (file_id) references dataset_file(id),
    foreign key (dataset_id) references dataset(id)
)ENGINE = InnoDB  COMMENT ='标注结果表';