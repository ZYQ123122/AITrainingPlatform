package net.maku.module.dataset.service.impl;

import lombok.AllArgsConstructor;
import net.maku.module.dataset.dao.AnnotationResultDao;
import net.maku.module.dataset.service.AnnotationResultService;
import net.maku.module.dataset.vo.AnnotationResultVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 标注结果服务实现类
 */
@Service
@AllArgsConstructor
public class AnnotationResultServiceImpl implements AnnotationResultService {

    private final AnnotationResultDao annotationResultDao;

    /**
     * 根据文件名浏览标注结果列表（这个需要写吗，我不太确定）
     * 
     * @param fileName 文件名
     * @return 标注结果 vo对象
     */
    @Override
    public List<AnnotationResultVO> listByFileName(String fileName) {
        // 根据文件名浏览标注结果列表
        return null;
    }

    /**
     * 新增标注结果
     * 
     * @param vo 标注结果 vo对象（必填：关联标注任务ID、关联数据集文件ID、数据集ID、标注内容、标注类型）
     */
    @Override
    public void save(AnnotationResultVO vo) {
        // 生成标注文件夹结果ID（UUID）
        // 生成创建时间（当前时间）
        // 标注后的文件增加后，对应标注任务的已标注文件数（annotatedCount）自动 +1
    }

    /**
     * 修改标注结果
     * 
     * @param vo 标注结果 vo对象（必填：标注结果ID）
     */
    @Override
    public void update(AnnotationResultVO vo) {
        // 更新标注结果
    }

    /**
     * 批量删除标注结果
     * 
     * @param idList 标注结果ID列表
     */
    @Override
    public void delete(List<String> idList) {
        // 批量删除标注结果
        // 删除标注结果后，对应的标注任务的已标注文件数（annotatedCount）需要相应减少
    }
}
