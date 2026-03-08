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
 * 数据集关联文件
 */
@Data
@Schema(description = "数据集关联文件")
public class DatasetFileVO implements Serializable{
    private static final long serialVersionUID = 1L;

    @Schema(description = "关联ID")
    private String id;
    @Schema(description = "所属数据集ID")
    private String datasetId;
    @NotBlank(message = "文件名不能为空")
    @Schema(description = "文件名", requiredMode = Schema.RequiredMode.REQUIRED)
    private String fileName;
    @NotNull(message = "文件状态不能为空")
    @Schema(description = "文件状态（1=未标注，2=已标注）", requiredMode = Schema.RequiredMode.REQUIRED)
    private String fileStatus;
    @NotBlank(message = "文件存储路径不能为空")
    @Schema(description = "文件存储路径", requiredMode = Schema.RequiredMode.REQUIRED)
    private String filePath;
    @NotBlank(message = "文件格式不能为空")
    @Schema(description = "文件格式", requiredMode = Schema.RequiredMode.REQUIRED)
    private String fileType;
    @NotBlank(message = "文件大小不能为空")
    @Schema(description = "文件大小", requiredMode = Schema.RequiredMode.REQUIRED)
    private String fileSize;
    @NotBlank(message = "导入类型不能为空")
    @Schema(description = "导入类型：1=本地上传，2=云端导入，3=API拉取，4=从已有数据集导入", requiredMode = Schema.RequiredMode.REQUIRED)
    private String importType;
    @Schema(description = "导入人ID")
    private String importUserId;
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    @Schema(description = "创建时间")
    private LocalDateTime createTime;

}
