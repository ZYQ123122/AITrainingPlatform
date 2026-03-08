package net.maku.module.dataset.service;

import net.maku.framework.common.utils.PageResult;
import net.maku.module.dataset.query.AnnotationTaskQuery;
import net.maku.module.dataset.vo.AnnotationTaskVO;

import java.util.List;

/**
 * 标注任务的增删改查
 */
public interface AnnotationTaskService {
    PageResult<AnnotationTaskVO> page(AnnotationTaskQuery query);

    AnnotationTaskVO getAnnotationTaskById(String id);
    void save(AnnotationTaskVO vo);

    void update(AnnotationTaskVO vo);

    void delete(List<String> idList);
}
