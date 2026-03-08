package net.maku.module.dataset.service;

import net.maku.module.dataset.vo.DictTaskTypeVO;

import java.util.List;

/**
 * 任务类型字典（按数据类型过滤，保证10种搭配）
 */
public interface DictTaskTypeService {

    /**
     * 根据数据类型ID查询可选任务类型
     */
    List<DictTaskTypeVO> listByDataTypeId(Integer dataTypeId);
}
