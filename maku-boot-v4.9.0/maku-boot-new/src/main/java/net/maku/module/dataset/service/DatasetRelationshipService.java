package net.maku.module.dataset.service;

import net.maku.module.dataset.vo.DatasetRelationshipVO;


import java.util.List;

/**
 * 数据集关系类型增删改查（不支持查询，只能浏览）
 */
public interface DatasetRelationshipService {
    /**
     * 浏览数据集关联关系列表（不支持查询，只是浏览）
     * 
     * @param relationshipType 关系类型（可为空，为空则浏览所有）
     * @return 数据集关联关系VO列表
     */
    List<DatasetRelationshipVO> listByRelationshipType(String relationshipType);
    void saveRelationship(DatasetRelationshipVO relationship);
    void deleteRelationship(DatasetRelationshipVO relationship);
    void update(DatasetRelationshipVO relationship);
}
