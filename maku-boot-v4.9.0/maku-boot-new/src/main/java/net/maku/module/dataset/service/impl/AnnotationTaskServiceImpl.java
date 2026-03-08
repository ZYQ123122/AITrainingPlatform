package net.maku.module.dataset.service.impl;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.module.dataset.dao.AnnotationTaskDao;
import net.maku.module.dataset.query.AnnotationTaskQuery;
import net.maku.module.dataset.service.AnnotationTaskService;
import net.maku.module.dataset.vo.AnnotationTaskVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 标注任务服务实现类
 */
@Service
@AllArgsConstructor
public class AnnotationTaskServiceImpl implements AnnotationTaskService {

    private final AnnotationTaskDao annotationTaskDao;

    /**
     * 分页查询标注任务列表
     * 
     * @param query 查询条件（分页参数：page、limit；筛选条件：标注任务名称、数据类型ID、任务类型ID、创建时间）
     * @return 分页结果，包含总记录数和当前页的标注任务列表
     */
    @Override
    public PageResult<AnnotationTaskVO> page(AnnotationTaskQuery query) {
        // 分页查询标注任务列表
        return null;
    }

    /**
     * 根据任务名称查询标注任务详情
     * 
     * @param id 标注任务ID
     * @return 标注任务VO对象，如果不存在则返回null
     */
    @Override
    public AnnotationTaskVO getAnnotationTaskById(String id) {
        // 根据查询标注任务详情
        return null;
    }

    /**
     * 新增标注任务
     * 
     * @param vo 标注任务 vo对象（必填：标注任务名称、选择的关联数据集；创建人ID、创建时间由后端填充）
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(AnnotationTaskVO vo) {
        // 生成标注任务ID（UUID）
        // 设置创建人ID（从当前登录用户获取）
        // 获取选择的关联数据集的ID
        // 生成创建时间（当前时间）
        // 状态默认（未开始），根据标注进度判断状态的改变
        // 标注进度默认是0，边标注边计算标注进度
        // 获取总文件数，计算已标注文件数
    }

    /**
     * 修改标注任务信息
     * 
     * @param vo 标注任务 vo对象（必填：选择标注任务；更新时间由后端填充）
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(AnnotationTaskVO vo) {
        // 获取选择的标注任务的ID
        // 设置更新时间（当前时间）
    }

    /**
     * 批量删除标注任务
     * 
     * @param idList 标注任务ID列表
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<String> idList) {
        // 批量删除标注任务
    }
}
