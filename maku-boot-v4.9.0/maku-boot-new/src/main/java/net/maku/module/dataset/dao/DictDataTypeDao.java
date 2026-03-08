package net.maku.module.dataset.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.module.dataset.entity.DictDataTypeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据类型字典
 */
@Mapper
public interface DictDataTypeDao extends BaseDao<DictDataTypeEntity> {
}
