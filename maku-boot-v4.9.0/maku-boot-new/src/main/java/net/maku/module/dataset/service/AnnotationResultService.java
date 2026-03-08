package net.maku.module.dataset.service;

import net.maku.module.dataset.vo.AnnotationResultVO;

import java.util.List;
/**
 * 标注结果增删改查（无查询条件）
 */

public interface AnnotationResultService {
    List<AnnotationResultVO> listByFileName(String fileName);

    void save(AnnotationResultVO vo);
    void update(AnnotationResultVO vo);
    void delete(List<String> idList);
}
