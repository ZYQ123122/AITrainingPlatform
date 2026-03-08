package net.maku.module.dataset.service;

import net.maku.module.dataset.vo.DatasetFileVO;

import java.util.List;

/**
 * 数据集里文件增删改查（无查询条件）
 */
public interface DatasetFileService {
    List<DatasetFileVO> listByFileName(String fileName);

    void save(DatasetFileVO file);

    void update(DatasetFileVO file);

    void delete(List<String> idList);

}
