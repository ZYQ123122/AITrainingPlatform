package net.maku.module.dataset.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 数据类型字典表（图片、视频、文本、表格、音频）
 */
@Data
@TableName("dict_data_type")
public class DictDataTypeEntity {

    @TableId
    private Integer id;
    /** 数据类型名称 */
    private String dataTypeName;
    /** 数据类型编码 */
    private String dataTypeCode;
    /** 排序权重 */
    private Integer sort;
}
