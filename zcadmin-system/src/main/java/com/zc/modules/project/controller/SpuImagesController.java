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
import com.zc.modules.project.entity.SpuImages;
import com.zc.modules.project.service.SpuImagesService;
/**
 * spu图片 信息操作处理
 *
 * @author Zhang C
 * @date 2021-08-16
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/project/spuImages")
@Api(tags = "spu图片信息管理")
public class SpuImagesController {
    private final SpuImagesService spuImagesService;

    @GetMapping("/id")
    @ApiOperation("根据主键获得对象数据")
    @Log("spu图片信息管理:根据主键获得对象数据")
    @PreAuthorize("@el.check('spuImages:getRecordById')")
    public ResultResponse getRecordById(Long id) {
        SpuImages result = spuImagesService.selectByPrimaryKey(id);
        if (result != null) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @GetMapping
    @ApiOperation("根据条件查询得到对象集合")
    @Log("spu图片信息管理:根据条件查询得到对象集合")
    @PreAuthorize("@el.check('spuImages:getListByParam')")
    public ResultResponse getListByParam(SpuImages record) {
        List<SpuImages> result = spuImagesService.selectListBySelective(record);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }


    @GetMapping("/ids")
    @ApiOperation("根据id集合获得目标数据集合")
    @Log("spu图片信息管理:根据id集合获得目标数据集合")
    @PreAuthorize("@el.check('spuImages:getListByIds')")
    public ResultResponse getListByIds(@RequestParam(value = "ids" ,required=false)List<Long> ids) {
        List<SpuImages> result = spuImagesService.selectByPrimaryKeys(ids);
        if (result != null && result.size() > 0) {
            return ResultResponse.success(result);
        }
        return ResultResponse.error();
    }

    @ApiOperation("分页获得目标数据集合")
    @GetMapping("page")
    @Log("spu图片信息管理:分页获得目标数据集合")
    @PreAuthorize("@el.check('spuImages:getPageByParam')")
    public ResultResponse getPageByParam(SpuImages record, Page page) {
        IPage<SpuImages> recordIPage = spuImagesService.selectPageBySelective(record, page);
        return ResultResponse.success(recordIPage);
    }

    @Log("spu图片信息管理:根据条件查询符合数据的数量")
    @GetMapping("count")
    @ApiOperation("根据条件查询符合数据的数量")
    @PreAuthorize("@el.check('spuImages:getCount')")
    public ResultResponse getCount(SpuImages record) {
        int result = spuImagesService.selectCountBySelective(record);
        return ResultResponse.success(result);
    }

    @ApiOperation("插入单条数据")
    @PostMapping
    @Log("spu图片信息管理:插入单条数据")
    @PreAuthorize("@el.check('spuImages:insert')")
    public ResultResponse insert(@RequestBody SpuImages record) {
        int result = spuImagesService.insert(record);
        if (result > 0) {
            return ResultResponse.success(record);
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量插入数据")
    @PostMapping("batch")
    @Log("spu图片信息管理:批量插入数据")
    @PreAuthorize("@el.check('spuImages:insertBatch')")
    public ResultResponse insertBatch(@RequestBody List<SpuImages> records) {
        int result = spuImagesService.insertBatch(records);
        if (result > 0) {
            return ResultResponse.success(records);
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据")
    @PutMapping
    @Log("spu图片信息管理:修改数据")
    @PreAuthorize("@el.check('spuImages:update')")
    public ResultResponse update(@RequestBody SpuImages record) {
        int result = spuImagesService.update(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("修改数据,仅修改不为null的数据")
    @PutMapping("/selective")
    @Log("spu图片信息管理:修改部分数据")
    @PreAuthorize("@el.check('spuImages:updateBySelective')")
    public ResultResponse updateBySelective(@RequestBody SpuImages record) {
        int result = spuImagesService.updateBySelective(record);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("批量修改数据")
    @PutMapping("batch")
    @Log("spu图片信息管理:批量修改数据")
    @PreAuthorize("@el.check('spuImages:updateBatch')")
    public ResultResponse updateBatch(@RequestBody List<SpuImages> records) {
        int result = spuImagesService.updateBatch(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    //如果某批数据中,有一个数据属性存在值,其他数据的属性不存在值,那么最终修改结果为其他数据的该属性将设为null值
    @ApiOperation("批量修改数据,仅修改部分属性")
    @PutMapping("batch/selective")
    @Log("spu图片信息管理:批量修改数据的部分属性")
    @PreAuthorize("@el.check('spuImages:updateBatchBySelective')")
    public ResultResponse updateBatchBySelective(@RequestBody List<SpuImages> records) {
        int result = spuImagesService.updateBatchBySelective(records);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("删除数据")
    @DeleteMapping()
    @Log("spu图片信息管理:删除数据")
    @PreAuthorize("@el.check('spuImages:delete')")
    public ResultResponse delete(Long id) {
        int result = spuImagesService.deleteByPrimaryKey(id);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }

    @ApiOperation("根据主键集合批量删除数据")
    @DeleteMapping("ids")
    @Log("spu图片信息管理:根据主键集合批量删除数据")
    @PreAuthorize("@el.check('spuImages:deleteByIds')")
    public ResultResponse deleteByIds(@RequestBody List<Long> ids) {
        int result = spuImagesService.deleteByPrimaryKeys(ids);
        if (result > 0) {
            return ResultResponse.success();
        }
        return ResultResponse.error();
    }


}
