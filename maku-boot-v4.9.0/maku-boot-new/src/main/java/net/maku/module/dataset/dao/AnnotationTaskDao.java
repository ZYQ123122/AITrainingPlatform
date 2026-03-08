package net.maku.module.dataset.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import net.maku.module.dataset.entity.AnnotationTaskEntity;

@Mapper
public interface AnnotationTaskDao extends BaseDao<AnnotationTaskEntity> {
}
