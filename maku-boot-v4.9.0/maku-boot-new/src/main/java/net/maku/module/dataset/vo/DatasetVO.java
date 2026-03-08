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
 * 数据集（增删改查、表单校验）
 */
@Data
@Schema(description = "数据集")
public class DatasetVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "数据集ID")
    private String id;
    @NotBlank(message = "数据集名称不能为空")
    @Schema(description = "数据集名称", requiredMode = Schema.RequiredMode.REQUIRED)
    private String datasetName;
    @NotNull(message = "数据类型不能为空")
    @Schema(description = "数据类型ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer dataTypeId;
    @NotNull(message = "任务类型不能为空")
    @Schema(description = "任务类型ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer taskTypeId;
    @Schema(description = "是否导入已有数据集（true 时 parentDatasetId 可为选中的已有数据集ID）")
    private Boolean importFromExisting;
    @Schema(description = "父数据集ID（导入已有数据集时必填）")
    private String parentDatasetId;
    @Schema(description = "状态（1=待标注，2=标注中，3=已完成）")
    private Integer status;
    @Schema(description = "类型（1=公开，2=私有，3=自定义）")
    private Integer datasetType;
    @Schema(description = "创建人ID（后端根据当前用户填充）")
    private String createUserId;
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    @Schema(description = "创建时间")
    private LocalDateTime createTime;
    @Schema(description = "更新人ID（后端根据当前用户填充）")
    private String updateUserId;
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}
