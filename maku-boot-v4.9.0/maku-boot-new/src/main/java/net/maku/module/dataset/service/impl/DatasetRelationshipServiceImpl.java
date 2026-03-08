package net.maku.module.dataset.service.impl;

import lombok.AllArgsConstructor;
import net.maku.module.dataset.dao.DatasetRelationshipDao;
import net.maku.module.dataset.service.DatasetRelationshipService;
import net.maku.module.dataset.vo.DatasetRelationshipVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据集关联关系服务实现类
 */
@Service
@AllArgsConstructor
public class DatasetRelationshipServiceImpl implements DatasetRelationshipService {

    private final DatasetRelationshipDao datasetRelationshipDao;

    /**
     * 浏览数据集关联关系列表（不支持查询，只是浏览）
     * 
     * @param relationshipType 关系类型
     * @return 数据集关联关系 vo列表
     */
    @Override
    public List<DatasetRelationshipVO> listByRelationshipType(String relationshipType) {
        // 根据关系类型浏览关联关系列表
        return null;
    }

    /**
     * 新增数据集关联关系
     * 
     * @param relationship 数据集关联关系 vo对象（必填：选源数据集、选目标数据集、关系类型、关系描述）
     */
    @Override
    public void saveRelationship(DatasetRelationshipVO relationship) {
        // 生成关联关系ID（UUID）
        // 获取选择的源数据集和目标数据集ID
        // 设置创建人ID（从当前登录用户获取）
        // 设置创建时间（当前时间）
    }

    /**
     * 删除数据集关联关系
     * 
     * @param relationship 数据集关联关系 vo对象（必填：关联关系ID，或源数据集ID+目标数据集ID+关系类型）
     */
    @Override
    public void deleteRelationship(DatasetRelationshipVO relationship) {
    }

    /**
     * 修改数（更新）据集关联关系
     * 
     * @param relationship 数据集关联关系 vo对象（必填：关联关系ID；更新人ID、更新时间由后端填充）
     */
    @Override
    public void update(DatasetRelationshipVO relationship) {
        // 设置更新人ID（从当前登录用户获取）
        // 设置更新时间（当前时间）
    }
}
