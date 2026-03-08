package net.maku.module.dataset.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.module.dataset.entity.DictTaskTypeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务类型字典
 */
@Mapper
public interface DictTaskTypeDao extends BaseDao<DictTaskTypeEntity> {
}
