package net.maku.module.dataset.service;

import net.maku.module.dataset.vo.DictDataTypeVO;

import java.util.List;

/**
 * 数据类型字典（仅查询，供下拉用）
 */
public interface DictDataTypeService {

    /**
     * 查询所有数据类型（图片、视频、文本、表格、音频）
     */
    List<DictDataTypeVO> list();
}
