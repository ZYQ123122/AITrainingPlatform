package net.maku.module.dataset.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import net.maku.module.dataset.entity.AnnotationResultEntity;

@Mapper
public interface AnnotationResultDao extends BaseDao<AnnotationResultEntity> {
}
