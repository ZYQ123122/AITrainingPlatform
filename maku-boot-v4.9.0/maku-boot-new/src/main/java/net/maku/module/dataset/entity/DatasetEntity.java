package net.maku.module.dataset.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 数据集表
 */
@Data
@TableName("dataset")
public class DatasetEntity {

    @TableId
    private String id;
    /** 数据集名称 */
    private String datasetName;
    /** 数据类型ID */
    private Integer dataTypeId;
    /** 任务类型ID */
    private Integer taskTypeId;
    /** 父数据集ID（是否导入已有数据集） */
    private String parentDatasetId;
    /** 状态（1=待标注，2=标注中，3=已完成） */
    private Integer status;
    /** 类型（1=公开，2=私有，3=自定义） */
    private Integer datasetType;
    /** 创建人ID */
    private String createUserId;
    /** 创建时间 */
    private LocalDateTime createTime;
    /** 更新人ID */
    private String updateUserId;
    /** 更新时间 */
    private LocalDateTime updateTime;
}
