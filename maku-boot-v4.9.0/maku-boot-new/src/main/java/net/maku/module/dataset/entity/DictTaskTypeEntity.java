package net.maku.module.dataset.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 任务类型字典表（分类、预测、动作跟踪、动作识别等，与数据类型组合共10种）
 */
@Data
@TableName("dict_task_type")
public class DictTaskTypeEntity {

    @TableId
    private Integer id;
    /** 任务类型名称 */
    private String taskTypeName;
    /** 任务类型编码 */
    private String taskTypeCode;
    /** 关联数据类型ID */
    private Integer dataTypeId;
    /** 排序权重 */
    private Integer sort;
}
