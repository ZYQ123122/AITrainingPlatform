package net.maku.module.dataset.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import net.maku.module.dataset.entity.DatasetFileEntity;

/**
 * 数据集_文件关联表
 */
@Mapper
public interface DatasetFileDao extends BaseDao<DatasetFileEntity> {
}
