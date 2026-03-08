package net.maku.module.dataset.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.module.dataset.entity.DatasetEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据集
 */
@Mapper
public interface DatasetDao extends BaseDao<DatasetEntity> {
}
