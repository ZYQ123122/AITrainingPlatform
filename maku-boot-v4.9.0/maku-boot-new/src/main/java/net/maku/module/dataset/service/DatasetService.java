package net.maku.module.dataset.service;

import net.maku.framework.common.utils.PageResult;
import net.maku.module.dataset.query.DatasetQuery;
import net.maku.module.dataset.vo.DatasetVO;

import java.util.List;

/**
 * 数据集增删改查
 */
public interface DatasetService {

    PageResult<DatasetVO> page(DatasetQuery query);

    DatasetVO getByName(String name);

    void save(DatasetVO vo);

    void update(DatasetVO vo);

    void delete(List<String> idList);
}
