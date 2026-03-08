package net.maku.module.dataset.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 标注结果表
 */
@Data
@TableName("annotation_result")
public class AnnotationResultEntity {
    @TableId
    private String id;
    /** 关联标注任务ID */
    private String taskId;
    /** 关联数据集文件ID */
    private String fileId;
    /** 数据集的冗余字段 */
    private String datasetId;
    /** 标注内容（JSON格式） */
    private String annotationContent;
    /** 标注类型（由 data_type+task_type 决定，如 image_classify、video_action_tracking） */
    private String annotationType;
    /** 创建时间 */
    private LocalDateTime createTime;
}
