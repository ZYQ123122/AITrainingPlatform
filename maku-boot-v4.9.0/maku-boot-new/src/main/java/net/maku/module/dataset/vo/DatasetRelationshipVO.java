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
 * 数据集关联表
 */

@Data
@Schema(description = "数据集关联表")
public class DatasetRelationshipVO implements Serializable{
    private static final long serialVersionUID = 1L;

    @Schema(description = "关联关系ID")
    private String id;
    @Schema(description = "源数据集ID")
    private String sourceDatasetId;
    @Schema(description = "目标数据集ID")
    private String targetDatasetId;
    @NotBlank(message = "关系类型不能为空")
    @Schema(description = "关系类型", requiredMode = Schema.RequiredMode.REQUIRED)
    private String relationshipType;
    @NotBlank(message = "关系描述不能为空")
    @Schema(description = "关系描述", requiredMode = Schema.RequiredMode.REQUIRED)
    private String relationshipDescription;
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
