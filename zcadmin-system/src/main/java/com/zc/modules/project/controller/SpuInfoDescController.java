package com.zc.modules.project.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.zc.annotation.Log;
import com.zc.entity.ResultResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import com.zc.modules.project.entity.SpuInfoDesc;
import com.zc.modules.project.service.SpuInfoDescService;
/**
 * spu介绍 信息操作处理
 *
 * @author Zhang C
 * @date 2021-08-16
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/project/spuInfoDesc")
@Api(tags = "spu介绍信息管理")
public class SpuInfoDescController {
    private final SpuInfoDescService spuInfoDescService;

    @GetMapping("/id")
    @ApiOperation("根据主键获得对象数据")
    @Log("spu介绍信息管理:根据主键获得对象数据")
    @PreAuthorize("@el.check('spuInfoDesc:getRecordById')")
    public ResultResponse getRecordById(Long id) {
        SpuInfoDesc result = spuInfoDescService.selectByPrimaryKey(id);
        if (result != null) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @GetMapping
    @ApiOperation("根据条件查询得到对象集合")
    @Log("spu介绍信息管理:根据条件查询得到对象集合")
    @PreAuthorize("@el.check('spuInfoDesc:getListByParam')")
    public ResultResponse getListByParam(SpuInfoDesc record) {
        List<SpuInfoDesc> result = spuInfoDescService.selectListBySelective(record);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }


    @GetMapping("/ids")
    @ApiOperation("根据id集合获得目标数据集合")
    @Log("spu介绍信息管理:根据id集合获得目标数据集合")
    @PreAuthorize("@el.check('spuInfoDesc:getListByIds')")
    public ResultResponse getListByIds(@RequestParam(value = "ids" ,required=false)List<Long> ids) {
        List<SpuInfoDesc> result = spuInfoDescService.selectByPrimaryKeys(ids);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @ApiOperation("分页获得目标数据集合")
    @GetMapping("page")
    @Log("spu介绍信息管理:分页获得目标数据集合")
    @PreAuthorize("@el.check('spuInfoDesc:getPageByParam')")
    public ResultResponse getPageByParam(SpuInfoDesc record, Page page) {
        IPage<SpuInfoDesc> recordIPage = spuInfoDescService.selectPageBySelective(record, page);
        return ResultResponse.success(recordIPage);
    }

    @Log("spu介绍信息管理:根据条件查询符合数据的数量")
    @GetMapping("count")
    @ApiOperation("根据条件查询符合数据的数量")
    @PreAuthorize("@el.check('spuInfoDesc:getCount')")
    public ResultResponse getCount(SpuInfoDesc record) {
        int result = spuInfoDescService.selectCountBySelective(record);
        return ResultResponse.success(result);
    }

    @ApiOperation("插入单条数据")
    @PostMapping
    @Log("spu介绍信息管理:插入单条数据")
    @PreAuthorize("@el.check('spuInfoDesc:insert')")
    public ResultResponse insert(@RequestBody SpuInfoDesc record) {
        int result = spuInfoDescService.insert(record);
        if (result > 0) {
            return ResultResponse.success(record);
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量插入数据")
    @PostMapping("batch")
    @Log("spu介绍信息管理:批量插入数据")
    @PreAuthorize("@el.check('spuInfoDesc:insertBatch')")
    public ResultResponse insertBatch(@RequestBody List<SpuInfoDesc> records) {
        int result = spuInfoDescService.insertBatch(records);
        if (result > 0) {
            return ResultResponse.success(records);
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据")
    @PutMapping
    @Log("spu介绍信息管理:修改数据")
    @PreAuthorize("@el.check('spuInfoDesc:update')")
    public ResultResponse update(@RequestBody SpuInfoDesc record) {
        int result = spuInfoDescService.update(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据,仅修改不为null的数据")
    @PutMapping("/selective")
    @Log("spu介绍信息管理:修改部分数据")
    @PreAuthorize("@el.check('spuInfoDesc:updateBySelective')")
    public ResultResponse updateBySelective(@RequestBody SpuInfoDesc record) {
        int result = spuInfoDescService.updateBySelective(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量修改数据")
    @PutMapping("batch")
    @Log("spu介绍信息管理:批量修改数据")
    @PreAuthorize("@el.check('spuInfoDesc:updateBatch')")
    public ResultResponse updateBatch(@RequestBody List<SpuInfoDesc> records) {
        int result = spuInfoDescService.updateBatch(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    //如果某批数据中,有一个数据属性存在值,其他数据的属性不存在值,那么最终修改结果为其他数据的该属性将设为null值
    @ApiOperation("批量修改数据,仅修改部分属性")
    @PutMapping("batch/selective")
    @Log("spu介绍信息管理:批量修改数据的部分属性")
    @PreAuthorize("@el.check('spuInfoDesc:updateBatchBySelective')")
    public ResultResponse updateBatchBySelective(@RequestBody List<SpuInfoDesc> records) {
        int result = spuInfoDescService.updateBatchBySelective(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("删除数据")
    @DeleteMapping()
    @Log("spu介绍信息管理:删除数据")
    @PreAuthorize("@el.check('spuInfoDesc:delete')")
    public ResultResponse delete(Long id) {
        int result = spuInfoDescService.deleteByPrimaryKey(id);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("根据主键集合批量删除数据")
    @DeleteMapping("ids")
    @Log("spu介绍信息管理:根据主键集合批量删除数据")
    @PreAuthorize("@el.check('spuInfoDesc:deleteByIds')")
    public ResultResponse deleteByIds(@RequestBody List<Long> ids) {
        int result = spuInfoDescService.deleteByPrimaryKeys(ids);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }


}
