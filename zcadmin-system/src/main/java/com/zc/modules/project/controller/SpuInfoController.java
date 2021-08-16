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
import com.zc.modules.project.entity.SpuInfo;
import com.zc.modules.project.service.SpuInfoService;
/**
 * spu 信息操作处理
 *
 * @author Zhang C
 * @date 2021-08-16
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/project/spuInfo")
@Api(tags = "spu信息管理")
public class SpuInfoController {
    private final SpuInfoService spuInfoService;

    @GetMapping("/id")
    @ApiOperation("根据主键获得对象数据")
    @Log("spu信息管理:根据主键获得对象数据")
    @PreAuthorize("@el.check('spuInfo:getRecordById')")
    public ResultResponse getRecordById(Long id) {
        SpuInfo result = spuInfoService.selectByPrimaryKey(id);
        if (result != null) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @GetMapping
    @ApiOperation("根据条件查询得到对象集合")
    @Log("spu信息管理:根据条件查询得到对象集合")
    @PreAuthorize("@el.check('spuInfo:getListByParam')")
    public ResultResponse getListByParam(SpuInfo record) {
        List<SpuInfo> result = spuInfoService.selectListBySelective(record);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }


    @GetMapping("/ids")
    @ApiOperation("根据id集合获得目标数据集合")
    @Log("spu信息管理:根据id集合获得目标数据集合")
    @PreAuthorize("@el.check('spuInfo:getListByIds')")
    public ResultResponse getListByIds(@RequestParam(value = "ids" ,required=false)List<Long> ids) {
        List<SpuInfo> result = spuInfoService.selectByPrimaryKeys(ids);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @ApiOperation("分页获得目标数据集合")
    @GetMapping("page")
    @Log("spu信息管理:分页获得目标数据集合")
    @PreAuthorize("@el.check('spuInfo:getPageByParam')")
    public ResultResponse getPageByParam(SpuInfo record, Page page) {
        IPage<SpuInfo> recordIPage = spuInfoService.selectPageBySelective(record, page);
        return ResultResponse.success(recordIPage);
    }

    @Log("spu信息管理:根据条件查询符合数据的数量")
    @GetMapping("count")
    @ApiOperation("根据条件查询符合数据的数量")
    @PreAuthorize("@el.check('spuInfo:getCount')")
    public ResultResponse getCount(SpuInfo record) {
        int result = spuInfoService.selectCountBySelective(record);
        return ResultResponse.success(result);
    }

    @ApiOperation("插入单条数据")
    @PostMapping
    @Log("spu信息管理:插入单条数据")
    @PreAuthorize("@el.check('spuInfo:insert')")
    public ResultResponse insert(@RequestBody SpuInfo record) {
        int result = spuInfoService.insert(record);
        if (result > 0) {
            return ResultResponse.success(record);
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量插入数据")
    @PostMapping("batch")
    @Log("spu信息管理:批量插入数据")
    @PreAuthorize("@el.check('spuInfo:insertBatch')")
    public ResultResponse insertBatch(@RequestBody List<SpuInfo> records) {
        int result = spuInfoService.insertBatch(records);
        if (result > 0) {
            return ResultResponse.success(records);
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据")
    @PutMapping
    @Log("spu信息管理:修改数据")
    @PreAuthorize("@el.check('spuInfo:update')")
    public ResultResponse update(@RequestBody SpuInfo record) {
        int result = spuInfoService.update(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据,仅修改不为null的数据")
    @PutMapping("/selective")
    @Log("spu信息管理:修改部分数据")
    @PreAuthorize("@el.check('spuInfo:updateBySelective')")
    public ResultResponse updateBySelective(@RequestBody SpuInfo record) {
        int result = spuInfoService.updateBySelective(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量修改数据")
    @PutMapping("batch")
    @Log("spu信息管理:批量修改数据")
    @PreAuthorize("@el.check('spuInfo:updateBatch')")
    public ResultResponse updateBatch(@RequestBody List<SpuInfo> records) {
        int result = spuInfoService.updateBatch(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    //如果某批数据中,有一个数据属性存在值,其他数据的属性不存在值,那么最终修改结果为其他数据的该属性将设为null值
    @ApiOperation("批量修改数据,仅修改部分属性")
    @PutMapping("batch/selective")
    @Log("spu信息管理:批量修改数据的部分属性")
    @PreAuthorize("@el.check('spuInfo:updateBatchBySelective')")
    public ResultResponse updateBatchBySelective(@RequestBody List<SpuInfo> records) {
        int result = spuInfoService.updateBatchBySelective(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("删除数据")
    @DeleteMapping()
    @Log("spu信息管理:删除数据")
    @PreAuthorize("@el.check('spuInfo:delete')")
    public ResultResponse delete(Long id) {
        int result = spuInfoService.deleteByPrimaryKey(id);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("根据主键集合批量删除数据")
    @DeleteMapping("ids")
    @Log("spu信息管理:根据主键集合批量删除数据")
    @PreAuthorize("@el.check('spuInfo:deleteByIds')")
    public ResultResponse deleteByIds(@RequestBody List<Long> ids) {
        int result = spuInfoService.deleteByPrimaryKeys(ids);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }


}
