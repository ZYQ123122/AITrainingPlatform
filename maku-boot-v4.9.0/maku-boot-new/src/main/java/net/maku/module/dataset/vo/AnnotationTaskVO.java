package net.maku.module.dataset.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import net.maku.framework.common.utils.DateUtils;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 标注任务表
 */
@Data
@Schema(description = "标注任务表")
public class AnnotationTaskVO implements Serializable{
    private static final long serialVersionUID = 1L;

    @Schema(description = "标注任务ID")
    private String id;
    @NotBlank(message = "标注任务名称不能为空")
    @Schema(description = "标注任务名称", requiredMode = Schema.RequiredMode.REQUIRED)
    private String taskName;
    @Schema(description = "关联数据集ID")
    private String datasetId;
    @NotNull(message = "状态不能为空")
    @Schema(description = "状态（1=未开始，2=进行中，3=已结束）", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer status;
    @NotNull(message = "标注进度不能为空")
    @Schema(description = "标注进度", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer progress;
    @NotNull(message = "该任务的总文件数")
    @Schema(description = "该任务的总文件数（先统计dataset_file WHERE dataset_id = 该任务dataset_id的记录数，赋值给total_file_count（总文件数））", requiredMode = Schema.RequiredMode.REQUIRED)
    private String totalFileCount;
    @NotNull(message = "已标注文件数")
    @Schema(description = "已标注文件数（新增标注结果时自动 + 1）", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer annotatedCount;
    @Schema(description = "创建人ID（后端根据当前用户填充）")
    private String createUserId;
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    @Schema(description = "创建时间")
    private LocalDateTime createTime;
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}
