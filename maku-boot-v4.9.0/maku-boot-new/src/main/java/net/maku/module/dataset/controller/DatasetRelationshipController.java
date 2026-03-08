package net.maku.module.dataset.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.module.dataset.service.DatasetRelationshipService;
import net.maku.module.dataset.vo.DatasetRelationshipVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 数据集关联关系管理控制器（不支持查询，只能浏览）
 */
@RestController
@RequestMapping("dataset/relationship")
@Tag(name = "数据集关联关系管理")
@AllArgsConstructor
public class DatasetRelationshipController {

    private final DatasetRelationshipService datasetRelationshipService;

    /**
     * 浏览数据集关联关系列表（不支持查询，只是浏览）
     * 
     * @param relationshipType 关系类型（可为空，为空则浏览所有）
     * @return 数据集关联关系 vo对象
     */
    @GetMapping("list")
    @Operation(summary = "浏览关联关系列表")
    public Result<List<DatasetRelationshipVO>> listByRelationshipType(
            @RequestParam(required = false) String relationshipType) {
        return Result.ok(datasetRelationshipService.listByRelationshipType(relationshipType));
    }

    /**
     * 新增数据集关联关系
     * 
     * @param relationship 数据集关联关系 vo（必填：源数据集ID、目标数据集ID、关系类型、关系描述）
     * @return 操作结果
     */
    @PostMapping
    @Operation(summary = "新增数据集关联关系")
    public Result<String> saveRelationship(@RequestBody @Valid DatasetRelationshipVO relationship) {
        datasetRelationshipService.saveRelationship(relationship);
        return Result.ok();
    }

    /**
     * 删除数据集关联关系
     * 
     * @param relationship 数据集关联关系 vo对象（必填：关联关系ID，或源数据集ID+目标数据集ID+关系类型）
     * @return 操作结果
     */
    @DeleteMapping
    @Operation(summary = "删除数据集关联关系")
    public Result<String> deleteRelationship(@RequestBody @Valid DatasetRelationshipVO relationship) {
        datasetRelationshipService.deleteRelationship(relationship);
        return Result.ok();
    }

    /**
     * 修改数据集关联关系
     * 
     * @param relationship 数据集关联关系 vo对象（必填：关联关系ID；更新人ID、更新时间由后端填充）
     * @return 操作结果
     */
    @PutMapping
    @Operation(summary = "修改数据集关联关系")
    public Result<String> update(@RequestBody @Valid DatasetRelationshipVO relationship) {
        datasetRelationshipService.update(relationship);
        return Result.ok();
    }
}
