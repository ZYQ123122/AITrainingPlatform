package net.maku.module.dataset.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import net.maku.framework.common.utils.DateUtils;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 标注结果表
 */
@Data
@Schema(description = "标注结果表")
public class AnnotationResultVO implements Serializable{
    private static final long serialVersionUID = 1L;

    @Schema(description = "标注结果ID")
    private String id;
    @Schema(description = "关联标注任务ID")
    private String taskId;
    @Schema(description = "关联数据集文件ID")
    private String fileId;
    @Schema(description = "数据集的冗余字段")
    private String datasetId;
    @Schema(description = "标注内容（JSON格式）")
    private String annotationContent;
    @NotBlank(message = "标注类型不能为空")
    @Schema(description = "标注类型（由 data_type+task_type 决定，如 image_classify、video_action_tracking）")
    private String annotationType;
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    @Schema(description = "创建时间")
    private LocalDateTime createTime;

}
