package net.maku.module.dataset.service.impl;

import lombok.AllArgsConstructor;
import net.maku.module.dataset.dao.DatasetFileDao;
import net.maku.module.dataset.service.DatasetFileService;
import net.maku.module.dataset.vo.DatasetFileVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据集文件服务实现类
 */
@Service
@AllArgsConstructor
public class DatasetFileServiceImpl implements DatasetFileService {

    private final DatasetFileDao datasetFileDao;

    /**
     * 根据文件名浏览数据集文件列表（不支持查询，只是浏览）
     * 
     * @param fileName 文件名（可为空，为空则浏览所有文件）
     * @return 数据集文件 vo对象
     */
    @Override
    public List<DatasetFileVO> listByFileName(String fileName) {
        // 根据文件名浏览文件列表
        return null;
    }

    /**
     * 新增数据集文件
     * 
     * @param file 数据集文件 vo对象（必填：文件名、文件存储路径、导入类型）
     */
    @Override
    public void save(DatasetFileVO file) {
        // 生成文件ID（UUID）
        // 设置导入人ID（从当前登录用户获取）
        // 默认文件状态为未标注
        // 选择导入方式
        // 获取文件格式、文件大小
        // 生成创建时间（当前时间）
    }

    /**
     * 修改数据集文件信息
     * 
     * @param file 数据集文件 vo对象（必填）
     */
    @Override
    public void update(DatasetFileVO file) {
        // 更新文件信息
    }

    /**
     * 批量删除数据集文件
     * 
     * @param idList 文件ID列表
     */
    @Override
    public void delete(List<String> idList) {
        // 批量删除文件
    }
}
