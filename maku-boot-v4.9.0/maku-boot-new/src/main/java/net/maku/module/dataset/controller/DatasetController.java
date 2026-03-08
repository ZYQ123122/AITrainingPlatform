package net.maku.module.dataset.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.common.utils.Result;
import net.maku.module.dataset.query.DatasetQuery;
import net.maku.module.dataset.service.DatasetService;
import net.maku.module.dataset.vo.DatasetVO;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 数据集管理控制器
 */
@RestController
@RequestMapping("dataset/dataset")
@Tag(name = "数据集管理")
@AllArgsConstructor
public class DatasetController {

    private final DatasetService datasetService;

    /**
     * 分页查询数据集列表
     * 
     * @param query 查询条件（分页参数：page、limit；筛选条件：数据集名称、数据类型ID、任务类型ID、创建时间）
     * @return 分页结果，包含总记录数和当前页的数据集列表
     */
    @GetMapping("page")
    @Operation(summary = "分页查询")
    public Result<PageResult<DatasetVO>> page(@ParameterObject @Valid DatasetQuery query) {
        return Result.ok(datasetService.page(query));
    }

    /**
     * 根据数据集名称查询数据集详情
     * 
     * @param name 数据集名称
     * @return 数据集 vo对象
     */
    @GetMapping("name/{name}")
    @Operation(summary = "根据名称查询详情")
    public Result<DatasetVO> getByName(@PathVariable String name) {
        return Result.ok(datasetService.getByName(name));
    }

    /**
     * 新增数据集
     * 
     * @param vo 数据集 vo对象（必填：数据集名称、数据类型ID、任务类型ID；创建人ID、创建时间由后端填充）
     * @return 操作结果
     */
    @PostMapping
    @Operation(summary = "新增数据集")
    public Result<String> save(@RequestBody @Valid DatasetVO vo) {
        datasetService.save(vo);
        return Result.ok();
    }

    /**
     * 修改数据集信息
     * 
     * @param vo 数据集 vo对象（必填：数据集ID；更新人ID、更新时间由后端填充）
     * @return 操作结果
     */
    @PutMapping
    @Operation(summary = "修改数据集")
    public Result<String> update(@RequestBody @Valid DatasetVO vo) {
        datasetService.update(vo);
        return Result.ok();
    }

    /**
     * 批量删除数据集
     * 
     * @param idList 数据集ID列表
     * @return 操作结果
     */
    @DeleteMapping
    @Operation(summary = "批量删除数据集")
    public Result<String> delete(@RequestBody List<String> idList) {
        datasetService.delete(idList);
        return Result.ok();
    }
}
