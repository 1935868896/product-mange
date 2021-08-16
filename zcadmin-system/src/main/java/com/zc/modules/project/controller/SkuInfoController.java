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
import com.zc.modules.project.entity.SkuInfo;
import com.zc.modules.project.service.SkuInfoService;
/**
 * sku 信息操作处理
 *
 * @author Zhang C
 * @date 2021-08-16
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/project/skuInfo")
@Api(tags = "sku信息管理")
public class SkuInfoController {
    private final SkuInfoService skuInfoService;

    @GetMapping("/id")
    @ApiOperation("根据主键获得对象数据")
    @Log("sku信息管理:根据主键获得对象数据")
    @PreAuthorize("@el.check('skuInfo:getRecordById')")
    public ResultResponse getRecordById(Long id) {
        SkuInfo result = skuInfoService.selectByPrimaryKey(id);
        if (result != null) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @GetMapping
    @ApiOperation("根据条件查询得到对象集合")
    @Log("sku信息管理:根据条件查询得到对象集合")
    @PreAuthorize("@el.check('skuInfo:getListByParam')")
    public ResultResponse getListByParam(SkuInfo record) {
        List<SkuInfo> result = skuInfoService.selectListBySelective(record);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }


    @GetMapping("/ids")
    @ApiOperation("根据id集合获得目标数据集合")
    @Log("sku信息管理:根据id集合获得目标数据集合")
    @PreAuthorize("@el.check('skuInfo:getListByIds')")
    public ResultResponse getListByIds(@RequestParam(value = "ids" ,required=false)List<Long> ids) {
        List<SkuInfo> result = skuInfoService.selectByPrimaryKeys(ids);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @ApiOperation("分页获得目标数据集合")
    @GetMapping("page")
    @Log("sku信息管理:分页获得目标数据集合")
    @PreAuthorize("@el.check('skuInfo:getPageByParam')")
    public ResultResponse getPageByParam(SkuInfo record, Page page) {
        IPage<SkuInfo> recordIPage = skuInfoService.selectPageBySelective(record, page);
        return ResultResponse.success(recordIPage);
    }

    @Log("sku信息管理:根据条件查询符合数据的数量")
    @GetMapping("count")
    @ApiOperation("根据条件查询符合数据的数量")
    @PreAuthorize("@el.check('skuInfo:getCount')")
    public ResultResponse getCount(SkuInfo record) {
        int result = skuInfoService.selectCountBySelective(record);
        return ResultResponse.success(result);
    }

    @ApiOperation("插入单条数据")
    @PostMapping
    @Log("sku信息管理:插入单条数据")
    @PreAuthorize("@el.check('skuInfo:insert')")
    public ResultResponse insert(@RequestBody SkuInfo record) {
        int result = skuInfoService.insert(record);
        if (result > 0) {
            return ResultResponse.success(record);
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量插入数据")
    @PostMapping("batch")
    @Log("sku信息管理:批量插入数据")
    @PreAuthorize("@el.check('skuInfo:insertBatch')")
    public ResultResponse insertBatch(@RequestBody List<SkuInfo> records) {
        int result = skuInfoService.insertBatch(records);
        if (result > 0) {
            return ResultResponse.success(records);
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据")
    @PutMapping
    @Log("sku信息管理:修改数据")
    @PreAuthorize("@el.check('skuInfo:update')")
    public ResultResponse update(@RequestBody SkuInfo record) {
        int result = skuInfoService.update(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据,仅修改不为null的数据")
    @PutMapping("/selective")
    @Log("sku信息管理:修改部分数据")
    @PreAuthorize("@el.check('skuInfo:updateBySelective')")
    public ResultResponse updateBySelective(@RequestBody SkuInfo record) {
        int result = skuInfoService.updateBySelective(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量修改数据")
    @PutMapping("batch")
    @Log("sku信息管理:批量修改数据")
    @PreAuthorize("@el.check('skuInfo:updateBatch')")
    public ResultResponse updateBatch(@RequestBody List<SkuInfo> records) {
        int result = skuInfoService.updateBatch(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    //如果某批数据中,有一个数据属性存在值,其他数据的属性不存在值,那么最终修改结果为其他数据的该属性将设为null值
    @ApiOperation("批量修改数据,仅修改部分属性")
    @PutMapping("batch/selective")
    @Log("sku信息管理:批量修改数据的部分属性")
    @PreAuthorize("@el.check('skuInfo:updateBatchBySelective')")
    public ResultResponse updateBatchBySelective(@RequestBody List<SkuInfo> records) {
        int result = skuInfoService.updateBatchBySelective(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("删除数据")
    @DeleteMapping()
    @Log("sku信息管理:删除数据")
    @PreAuthorize("@el.check('skuInfo:delete')")
    public ResultResponse delete(Long id) {
        int result = skuInfoService.deleteByPrimaryKey(id);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("根据主键集合批量删除数据")
    @DeleteMapping("ids")
    @Log("sku信息管理:根据主键集合批量删除数据")
    @PreAuthorize("@el.check('skuInfo:deleteByIds')")
    public ResultResponse deleteByIds(@RequestBody List<Long> ids) {
        int result = skuInfoService.deleteByPrimaryKeys(ids);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }


}
